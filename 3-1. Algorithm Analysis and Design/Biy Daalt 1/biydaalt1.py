from tkinter.scrolledtext import ScrolledText
import tkinter as tk
import re
from spellchecker import SpellChecker


class GUI:
    def __init__(self, spelling_checker):
        self.spelling_checker = spelling_checker
        self.root = tk.Tk()
        self.setup_ui()

    def setup_ui(self):
        width = self.root.winfo_screenwidth()
        height = self.root.winfo_screenheight()
        self.root.geometry(f"{width}x{height}")
        self.root.title("Алдаа шалгагч")

        self.text = ScrolledText(self.root, font=("Arial", 14), wrap=tk.WORD)
        self.text.pack(expand=True, fill=tk.BOTH)

        bottom_frame = tk.Frame(self.root)
        bottom_frame.pack(fill=tk.X, side=tk.BOTTOM)

        self.stats_label = tk.Label(bottom_frame, text="Word Count: 0 | Incorrect Word Count: 0")
        self.stats_label.pack(side=tk.BOTTOM)

        self.root.bind("<F6>", self.spelling_checker.check_spelling)
        self.text.bind("<Motion>", self.spelling_checker.show_suggestions)

        self.suggestion_menu = tk.Menu(self.text, tearoff=0)
        self.spelling_checker.set_gui(self)

    def start(self):
        self.root.mainloop()


class SpellingChecker:
    def __init__(self):
        self.spellchecker = SpellChecker()

    def set_gui(self, gui):
        self.gui = gui

    def check_spelling(self, event=None):
        content = self.gui.text.get("1.0", tk.END).strip()
        words = re.findall(r'\b\w+\b', content)
        total_words = len(words)
        misspelled_count = 0

        self.gui.text.tag_remove("misspelled", "1.0", tk.END)
        misspelled_words = self.spellchecker.unknown(words)

        for word in misspelled_words:
            misspelled_count += 1
            start_idx = self.gui.text.search(word, "1.0", tk.END)
            end_idx = f"{start_idx}+{len(word)}c"
            self.gui.text.tag_add("misspelled", start_idx, end_idx)
            self.gui.text.tag_config("misspelled", foreground="red", underline=True)

        self.gui.stats_label.config(text=f"Word Count: {total_words} | Incorrect Word Count: {misspelled_count}")

    def show_suggestions(self, event):
        mouse_index = self.gui.text.index(f"@{event.x},{event.y}")

        for tag in self.gui.text.tag_names(mouse_index):
            if tag == "misspelled":
                word_start = self.gui.text.index(f"{mouse_index} wordstart")
                word_end = self.gui.text.index(f"{mouse_index} wordend")
                misspelled_word = self.gui.text.get(word_start, word_end)

                suggestions = self.spellchecker.candidates(misspelled_word)

                self.gui.suggestion_menu.delete(0, tk.END)
                for suggestion in suggestions:
                    self.gui.suggestion_menu.add_command(label=suggestion, command=lambda s=suggestion: self.replace_word(word_start, word_end, s))

                self.gui.suggestion_menu.post(event.x_root, event.y_root)
                return

        self.gui.suggestion_menu.unpost()

    def replace_word(self, start, end, new_word):
        self.gui.text.delete(start, end)
        self.gui.text.insert(start, new_word)


def main():
    spelling_checker = SpellingChecker()
    gui = GUI(spelling_checker)
    gui.start()


if __name__ == "__main__":
    main()

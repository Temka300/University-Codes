import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SortingApp extends JFrame implements ActionListener {
    private JButton sortButton;
    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    
    public SortingApp() {
        super("Sorting App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        inputTextArea = new JTextArea(10, 20);
        outputTextArea = new JTextArea(10, 20);
        sortButton = new JButton("Sort");
        sortButton.addActionListener(this);
        
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(inputTextArea));
        panel.add(sortButton);
        panel.add(new JScrollPane(outputTextArea));
        
        add(panel);
        pack();
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sortButton) {
            String input = inputTextArea.getText();
            String[] numbers = input.split("\\s+");
            
            int[] arr = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }
            
            // Using selection sort for demonstration purposes
            selectionSort(arr);
            
            StringBuilder output = new StringBuilder();
            for (int num : arr) {
                output.append(num).append(" ");
            }
            
            outputTextArea.setText(output.toString());
        }
    }
    
    private void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SortingApp();
            }
        });
    }
}

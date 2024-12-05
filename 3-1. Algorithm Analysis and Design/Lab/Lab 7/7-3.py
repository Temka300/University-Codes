class Node:
    def __init__(self, char=None, freq=None):
        self.char = char  # Character for this node
        self.freq = freq  # Frequency of the character
        self.left = None  # Left child
        self.right = None  # Right child

def decode_huff(root, s):
    decoded_string = []
    current = root  # Start from the root of the tree
    
    for bit in s:
        if bit == '0':
            current = current.left  # Move to the left child
        else:
            current = current.right  # Move to the right child
        
        # If we reach a leaf node, add the character to the decoded string
        if current.left is None and current.right is None:
            decoded_string.append(current.char)
            current = root  # Reset to the root for the next character
            
    return ''.join(decoded_string)

# Example usage:
# Build the Huffman tree for the given problem:
root = Node()
root.left = Node('B')
root.right = Node('A')
root.right.left = Node('R')
root.right.right = Node()
root.right.right.left = Node('C')
root.right.right.right = Node('D')

# Decoded input string
s = "1001011"
decoded_result = decode_huff(root, s)
print(decoded_result)  # Output: ABACA

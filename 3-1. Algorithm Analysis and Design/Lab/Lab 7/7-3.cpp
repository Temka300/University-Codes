#include <iostream>
#include <string>
using namespace std;

// Node structure for the Huffman Tree
struct Node {
    char data;         // Character stored in the node (for leaf nodes)
    int freq;          // Frequency of the character
    Node* left;        // Left child
    Node* right;       // Right child

    Node(char data, int freq, Node* left = nullptr, Node* right = nullptr)
        : data(data), freq(freq), left(left), right(right) {}
};

// Function to decode the Huffman encoded string
string decode_huff(Node* root, const string& s) {
    string decoded_string = "";
    Node* current = root;

    for (char bit : s) {
        if (bit == '0') {
            current = current->left;  // Move left for '0'
        } else {
            current = current->right;  // Move right for '1'
        }

        // Check if current node is a leaf node
        if (!current->left && !current->right) {
            decoded_string += current->data;  // Append the character
            current = root;  // Reset to root for the next character
        }
    }

    return decoded_string;
}

// Example usage
int main() {
    // Construct the sample Huffman tree
    Node* root = new Node('\0', 12);  // Root node with null data
    root->left = new Node('B', 5);  // Left child
    root->right = new Node('\0', 7);  // Internal node
    root->right->left = new Node('A', 3);  // Left child of right node
    root->right->right = new Node('C', 4);  // Right child of right node

    // Encoded string
    string encoded_string = "1001011";

    // Decode the string
    string decoded_result = decode_huff(root, encoded_string);

    // Output the decoded string
    cout << "Decoded string: " << decoded_result << endl;

    // Free allocated memory (for the sake of good practice)
    delete root->left;
    delete root->right->left;
    delete root->right->right;
    delete root->right;
    delete root;

    return 0;
}

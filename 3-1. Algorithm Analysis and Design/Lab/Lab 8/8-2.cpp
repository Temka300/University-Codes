#include <iostream>
#include <vector>

void insertionSort(std::vector<int>& arr) {
    for (size_t i = 1; i < arr.size(); i++) {
        int key = arr[i];
        int j = i - 1;

        // Move elements of arr[0..i-1] that are greater than key
        // to one position ahead of their current position
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

int main() {
    std::vector<int> data = {5, 3, 8, 6, 2};
    insertionSort(data);

    std::cout << "Sorted array: ";
    for (const auto& num : data) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    return 0;
}

#include <catch2/catch_test_macros.hpp>
#include <vector>

void insertionSort(std::vector<int>& arr);

TEST_CASE("InsertionSort sorts an array correctly", "[insertionSort]") {
    std::vector<int> data = {5, 3, 8, 6, 2};
    std::vector<int> expected = {2, 3, 5, 6, 8};

    insertionSort(data);
    REQUIRE(data == expected);
}

TEST_CASE("InsertionSort handles an empty array", "[insertionSort]") {
    std::vector<int> data = {};
    std::vector<int> expected = {};

    insertionSort(data);
    REQUIRE(data == expected);
}

TEST_CASE("InsertionSort handles a single element array", "[insertionSort]") {
    std::vector<int> data = {1};
    std::vector<int> expected = {1};

    insertionSort(data);
    REQUIRE(data == expected);
}

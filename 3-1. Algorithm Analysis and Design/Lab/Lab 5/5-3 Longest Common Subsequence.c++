#include <iostream>
#include <string>
#include <cstring>
#include <algorithm>

using namespace std;

class Solution {
public:
    int longestCommonSubsequence(std::string text1, std::string text2) {
        int text1Length = text1.size(), text2Length = text2.size();
        int dp[text1Length + 1][text2Length + 1];
      
        memset(dp, 0, sizeof dp);
      
        for (int i = 1; i <= text1Length; ++i) {
            for (int j = 1; j <= text2Length; ++j) {
                if (text1[i - 1] == text2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = std::max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
      
        return dp[text1Length][text2Length];
    }
};

// int main() {
//     Solution sol;
//     string text1 = "abcde";
//     string text2 = "ace";
//     cout << "Length of Longest Common Subsequence: " << sol.longestCommonSubsequence(text1, text2) << endl;
//     return 0;
// }

// CMakeLists.txt
// cmake_minimum_required(VERSION 3.5)
// project(LongestCommonSubsequence)

// Include(FetchContent)

// FetchContent_Declare(
//   Catch2
//   GIT_REPOSITORY
//   GIT_TAG
// )

// FetchContent_MakeAvailable(Catch2)

// add_executable(tests 5-3 Longest Common Subsequence.cpp)
// target_link_libraries(tests Catch2::Catch2)

// set(CMAKE_CXX_STANDARD 20)
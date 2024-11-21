#https://leetcode.com/problems/unique-binary-search-trees/

def numTrees(n: int) -> int:
    # dp[i] stores number of unique BSTs with i nodes
    dp = [0] * (n + 1)
    
    # Base cases
    dp[0] = 1  # Empty tree
    dp[1] = 1  # Single node tree
    
    # Calculate for each number of nodes
    for i in range(2, n + 1):
        # Consider each number as root
        for j in range(i):
            # Left subtree has j nodes
            # Right subtree has (i-1-j) nodes
            dp[i] += dp[j] * dp[i - 1 - j]
    
    return dp[n]

# Test cases
print(numTrees(3))  # Output: 5
print(numTrees(1))  # Output: 1

def coin_change(coins, amount):
    # Memoization dictionary
    memo = {}
    
    def dp(remaining):
        # Base cases
        if remaining == 0:
            return 0  # No coins needed for amount 0
        if remaining < 0:
            return float('inf')  # Invalid case, return infinity
        
        # Check if result is already computed
        if remaining in memo:
            return memo[remaining]
        
        # Recurrence relation: minimum coins for the current amount
        result = float('inf')
        for coin in coins:
            result = min(result, 1 + dp(remaining - coin))
        
        # Save the result in the memo dictionary
        memo[remaining] = result
        return result
    
    # Calculate result
    result = dp(amount)
    return result if result != float('inf') else -1  # Return -1 if no solution exists

# Unit Test
import unittest

class TestCoinChange(unittest.TestCase):
    def test_examples(self):
        self.assertEqual(coin_change([1, 2, 5], 11), 3)  # 5 + 5 + 1
        self.assertEqual(coin_change([2], 3), -1)        # Not possible
        self.assertEqual(coin_change([1], 0), 0)        # Zero amount, zero coins
        self.assertEqual(coin_change([1, 2, 5], 7), 2)  # 5 + 2
        self.assertEqual(coin_change([3, 4, 5], 6), 2)  # 3 + 3

# Run the tests
if __name__ == "__main__":
    unittest.main()

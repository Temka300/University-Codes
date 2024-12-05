def fractional_knapsack_greedy(weights, values, capacity):
    # Combine weights and values into a list of tuples and calculate value-to-weight ratio
    items = [(values[i] / weights[i], weights[i], values[i]) for i in range(len(weights))]
    # Sort items by value-to-weight ratio in descending order
    items.sort(reverse=True, key=lambda x: x[0])

    total_value = 0
    for ratio, weight, value in items:
        if capacity >= weight:
            # Take the whole item
            total_value += value
            capacity -= weight
        else:
            # Take fractional part of the item
            total_value += ratio * capacity
            break
    
    return total_value

# Example input
weights = [10, 20, 30]
values = [60, 100, 120]
capacity = 50

# Solve using the greedy method
max_value = fractional_knapsack_greedy(weights, values, capacity)
max_value

# 1 Example of chr()
char = chr(65)  # Returns the character corresponding to Unicode code point 65, which is 'A'
print(char)     # Output: 'A'

# 2 Example of any()
my_list = [False, True, False]
result = any(my_list)  # Returns True because at least one element (True) is True
print(result)          # Output: True

# 3 Example of ascii()
string = 'hello'
ascii_str = ascii(string)  # Returns the string representation with escape characters, 'hello'
print(ascii_str)           # Output: "'hello'"

# 4 Example of range()
my_range = range(5)  # Generates numbers from 0 to 4
print(list(my_range)) # Output: [0, 1, 2, 3, 4]

# 5 Example of slice()
my_list = [1, 2, 3, 4, 5]
my_slice = slice(1, 4)  # Defines a slice from index 1 to 3 (not including 4)
result = my_list[my_slice]
print(result)           # Output: [2, 3, 4]

# 6 Example of hash()
hashed_value = hash('hello')
print(hashed_value)  # Output: -3651527349381155473 (Note: Hash values may vary between Python sessions)

# 7 Example of hex()
decimal_value = 255
hex_value = hex(decimal_value)  # Converts 255 to its hexadecimal representation
print(hex_value)                # Output: '0xff'

# 8 Example of eval()
expression = '3 + 5'
result = eval(expression)  # Evaluates the string '3 + 5' as a Python expression
print(result)              # Output: 8

# 9 Example of sum()
numbers = [1, 2, 3, 4, 5]
total_sum = sum(numbers)  # Adds up all the numbers in the list
print(total_sum)          # Output: 15

# 10 Example of pow()
result = pow(2, 3)  # Calculates 2 raised to the power of 3
print(result)       # Output: 8

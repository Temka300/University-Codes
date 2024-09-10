def insert_in_sorted_order(lst, value):
    index = 0
    while index < len(lst) and lst[index] < value:
        index += 1
    lst.insert(index, value)

# Example usage
ordered_list = [1, 3, 5, 7, 9]

insert_in_sorted_order(ordered_list, 4)
insert_in_sorted_order(ordered_list, 2)
insert_in_sorted_order(ordered_list, 6)

print(ordered_list)

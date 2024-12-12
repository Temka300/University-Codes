# https://leetcode.com/problems/linked-list-cycle/description/

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if not head or not head.next:
            return False  # Empty list or single node without a cycle
        
        slow = head  # Slow pointer moves one step at a time
        fast = head  # Fast pointer moves two steps at a time
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
            # If the slow and fast pointers meet, there is a cycle
            if slow == fast:
                return True
        
        return False  # If the loop exits, there is no cycle        
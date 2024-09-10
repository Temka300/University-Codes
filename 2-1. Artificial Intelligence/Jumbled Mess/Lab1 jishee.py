class Queue:
    def __init__(self):
        self._list = []  # анхны утга

    def enqueue(self, element):
        self._list.append(element)

    def dequeue(self):
        if self.is_empty():
            return None
        return self._list.pop(0)

    def __len__(self):
        return len(self._list)

    def is_empty(self):
        return len(self._list) == 0

    def peek(self):
        if self.is_empty():
            return None
        return self._list[0]

    def __str__(self):
        return 'Queue: ' + str(self._list)


queue = Queue()
queue.enqueue('T1')
queue.enqueue('T2')
queue.enqueue('T3')
print('queue:', queue)
print('queue.is_empty():', queue.is_empty())
print('queue.len():', len(queue))  # Fixed the method call here
print('queue.peek():', queue.peek())
print('queue.dequeue():', queue.dequeue())  # Fixed the method name here
print('queue:', queue)

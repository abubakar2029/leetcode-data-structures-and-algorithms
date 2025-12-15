from collections import Counter
import heapq
from typing import List
class Solution:
    def minSetSize(self, arr: List[int]) -> int:
        count = Counter(arr)

        heap = []
        for key, value in count.items():
            heapq.heappush(heap, -value)

        print(heap)
        i = 0
        n = len(arr)
        for _ in range(n):
            i += 1
            element = heapq.heappop(heap)
            print(element)
            n -= -element
            if n <= len(arr) // 2:
                print(n, len(arr))
                print("break")
                break

        return i

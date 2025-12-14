class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        # create a min-heap with sq. distance as the 1st value
        # return the first k-values
        heap = []

        for x, y in points:
            heapq.heappush(heap, (x**2 + y**2, x, y))

        result = []
        for _ in range(k):
            result.append(heapq.heappop(heap)[1:])

        return result

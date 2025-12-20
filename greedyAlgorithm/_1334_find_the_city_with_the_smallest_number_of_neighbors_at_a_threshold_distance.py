
from typing import List

import math


class Solution:
    def findTheCity(
        self, n: int, edges: List[List[int]], distanceThreshold: int
    ) -> int:
        # it will be a 2D list
        # iterate over the 2D distances list and return the one smallest with the higher distance
        # make a 2D list
        # hr element os ka infinity ha
        # u or v le lo
        # iterate or edge relaxation kr do
        distances = [[math.inf] * n + [0] for _ in range(n)]


        print(distances)
        for edge in edges:
            u, v, w = edge
            if (
                distances[u][v] == math.inf or distances[u][v] < w
            ) and w <= distanceThreshold:
                distances[u][v] = w

        print(distances)


Solution().findTheCity(5, [[0, 1, 2], [0, 4, 8], [
    1, 2, 3], [1, 4, 2], [2, 3, 1], [3, 4, 1]], 2)

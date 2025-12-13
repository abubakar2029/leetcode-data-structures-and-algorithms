# Graph Definition
graph = {
    'A': [('B', 1), ('D', 4)],
    'B': [('C', 2), ('D', 5)],
    'D': [('C', 1)],
    'C': []
}


# Algorithm 
import heapq

def dijkstra(graph, start):
    min_heap = [(0, start)]  # (distance, node)
    distances = {node: float('inf') for node in graph}
    distances[start] = 0

    while min_heap:
        curr_dist, curr_node = heapq.heappop(min_heap)

        if curr_dist > distances[curr_node]:
            continue

        for neighbor, weight in graph[curr_node]:
            new_dist = curr_dist + weight

            if new_dist < distances[neighbor]:
                distances[neighbor] = new_dist
                heapq.heappush(min_heap, (new_dist, neighbor))

    return distances

result = dijkstra(graph, 'A')
print(result)

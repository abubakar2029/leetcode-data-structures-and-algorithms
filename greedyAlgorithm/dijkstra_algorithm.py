import heapq
graph = {"a": {"b": 1, "c": 4}, "b": {"c": 1, "d": 6}, "c": {"d": 3}, "d": {}}


def dijkstra(graph, start):
    distances = {}
    for node in graph:
        distances[node] = float('inf')
    distances[start] = 0

    minHeap = [(0, start)]

    while minHeap:
        weight, node = heapq.heappop(minHeap)
        neighbors = graph[node]
        for n_node, n_weight in neighbors.items():
            # Edge Relaxation
            if (distances[n_node] > weight+n_weight):
                distances[n_node] = weight+n_weight
                heapq.heappush(minHeap, ((weight+n_weight), n_node))

    print(distances)


dijkstra(graph, "a")

class Solution:
    def islandsAndTreasure(self, grid: List[List[int]]) -> None:
        m, n = len(grid), len(grid[0])
        visit = set()
        q = deque()

        def addn(i, j):
            if i < 0 or i >= m or j < 0 or j >= n or (i, j) in visit or grid[i][j] == -1: return 
            visit.add((i, j))
            q.append([i,j])
        for i in range(m):
            for j in range(n):
                if grid[i][j] == 0:
                    q.append([i, j])
                    visit.add((i,j))

        dist = 0
        while q:
            for a in range(len(q)):
                i, j = q.popleft()
                grid[i][j] = dist
                addn(i, j+1)
                addn(i, j-1)
                addn(i+1, j)
                addn(i-1, j)
            dist += 1            
class Solution:
    def gridIllumination(self, n: int, lamps: list[list[int]], queries: list[list[int]]) -> list[int]:
        row, col, d, s, lampset = defaultdict(int), defaultdict(int), defaultdict(int), defaultdict(int), set()
        for lamp in lamps:
            if tuple(lamp) in lampset:
                continue
            r, c = lamp
            lampset.add(tuple(lamp))
            row[r] += 1
            col[c] += 1
            d[r - c] += 1
            s[r + c] += 1

        def turnoff(x, y):
            if (x, y) in lampset:
                row[x] -= 1
                col[y] -= 1
                d[x - y] -= 1
                s[x + y] -= 1
                lampset.remove((x, y))

        ans = []
        for q in queries:
            x, y = q
            if row[x] or col[y] or d[x - y] or s[x + y]:
                ans.append(1)
            else:
                ans.append(0)

            turnoff(x, y)
            turnoff(x, y - 1)
            turnoff(x, y + 1)
            turnoff(x - 1, y)
            turnoff(x - 1, y - 1)
            turnoff(x - 1, y + 1)
            turnoff(x + 1, y)
            turnoff(x + 1, y - 1)
            turnoff(x + 1, y + 1)

        return ans
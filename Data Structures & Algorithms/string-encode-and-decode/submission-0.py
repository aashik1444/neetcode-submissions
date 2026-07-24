class Solution:

    def encode(self, strs: List[str]) -> str:
        sol = ""
        for i in strs:
            sol += str(len(i))+"&"+i
        return sol

    def decode(self, s: str) -> List[str]:
        sol = []
        i = 0
        while i < len(s):
            j = i
            while s[j] != "&":
                j += 1
            length = int(s[i:j])
            sol.append(s[j+1:j+1+length])
            i = j+1+length
        return sol

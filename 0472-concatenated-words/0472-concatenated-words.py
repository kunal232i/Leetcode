class Solution:
    def findAllConcatenatedWordsInADict(self, words: List[str]) -> List[str]:
        seen = set(words)
        
        def dfs(word):
            """Return True if input is a concatenated word."""
            for i in range(1, len(word)): 
                prefix = word[:i]
                suffix = word[i:]
                if prefix in seen and (suffix in seen or dfs(suffix)): return True 
            return False 
        
        ans = []
        for word in words: 
            if dfs(word): ans.append(word)
        return ans 
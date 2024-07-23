class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        
        length = min(len(word1),len(word2))
        print(length)
        j,k = 0,0 
        res = ""
        for i in range(length):
            
            print(j,k)
            res += word1[j]
            res += word2[k]

            j +=1
            k +=1

        res += word1[j:len(word1)]
        res += word2[k:len(word2)]

        return res    
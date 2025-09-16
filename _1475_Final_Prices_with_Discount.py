# Approach 02

# Approach 01
class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        min_var = 0
        ans = prices.copy()

        # list ka last sa iterate krna ha
        for i in range(len(prices) - 1, -1, -1):
            if i < len(prices) - 1 and prices[i] >= prices[i + 1]:
                ans[i] = prices[i] - prices[i + 1]
                min_var = prices[i+1]
                continue
            else:
                print(prices[i])
                ans[i] = prices[i] - min_var

            min_var = min(min_var, prices[i])

        return ans

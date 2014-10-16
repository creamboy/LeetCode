class Solution:
    # @param x, an integer
    # @return an integer
    def sqrt(self, x):
        epsilon=0.1
        low = 0
        high = x
        guess = (low + high)/2
        counter = 1
        while (abs(guess*guess - x) > epsilon) and (counter <= 100):
            if high*high==x:
                return high
            if low*low==x:
                return low
            if guess*guess < x:
                low=guess
            else:
                high = guess
            guess = (low + high)/2
            counter += 1
        return guess

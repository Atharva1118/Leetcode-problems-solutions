class Solution(object):
    def countEven(self, num):
        sum=0
        n=num
        while n>0:
            sum=sum+n%10
            n=n//10
        if sum%2==0:
            return num//2
        else:
            return (num-1)/2
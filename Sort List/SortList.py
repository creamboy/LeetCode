# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
def merge(left, right):
    l=left
    r=right
    fakehead=ListNode(8888)
    newtemp=fakehead
    while l!=None or r!=None:
        if l==None:
            newtemp.next=r
            break
        elif r==None:
            newtemp.next=l
            break            
        else:
            if l.val<=r.val:
                newtemp.next=l
                l=l.next
                newtemp=newtemp.next
            else:
                newtemp.next=r
                r=r.next
                newtemp=newtemp.next
    return fakehead.next
class Solution:
    # @param head, a ListNode
    # @return a ListNode
    def sortList(self, head):
        if head==None:
            return head
        if head.next==None:
            return head
        count=0
        temp=head
        while temp!=None:
            temp=temp.next
            count=count+1
        middle=count/2
        temp2=head
        left=head
        right=None
        countHalf=0
        while temp2!=None:
            countHalf=countHalf+1
            future=temp2.next
            if countHalf==middle:
                temp2.next=None
                right=future
                break
            temp2=future
        return merge(Solution.sortList(self,left), Solution.sortList(self,right))
        
        

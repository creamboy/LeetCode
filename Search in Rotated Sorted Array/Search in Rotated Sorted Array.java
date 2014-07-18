public class Solution {
public int search(int[] A, int target) {
   return search(A,target,0,A.length-1);
}

public int search(int[] A, int target, int low, int high){
    int mid=(low+high)/2;
    if(A[mid]==target) 
        return mid;
    if(low>high) 
        return -1;
    if(A[low]<=A[mid]){
      if(target>=A[low]&&target<A[mid])
      return search(A,target,low,mid-1);
      else
      return search(A,target,mid+1,high);
    } else if(A[mid]<=A[high]){
      if(target>A[mid]&&target<=A[high])
      return search(A,target,mid+1,high);
      else
      return search(A,target,low,mid-1);
  }
return -1;
}
}





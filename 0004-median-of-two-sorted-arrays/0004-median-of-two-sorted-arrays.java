class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int a=nums1.length+nums2.length;
       ArrayList<Integer>b=new ArrayList<>();
       for(Integer i:nums1)b.add(i);
       for(Integer i:nums2)b.add(i);
       Collections.sort(b);
       return b.size()%2==0?
       (b.get((a-1)/2) + b.get(((a-1)/2)+1))/2.0 : b.get((a-1)/2); 
    }
}
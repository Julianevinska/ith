package com.company;

public class Solution {
    public int[] sortArrayByParity(int[] nums) {
            int even = 0;
            int odd = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]%2 == 0){
                    even++;
                } else{
                    odd++;
                }
            }
            int[] evenArr = new int[even];
            int[] oddArr = new int[odd];
            int evenIndex = 0;
            int oddIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]%2 == 0){
                    evenArr[evenIndex++] = nums[i];
                } else {
                    oddArr[oddIndex++] = nums[i];
                }
            }
            int[] finalArr = new int[evenIndex + oddIndex];
            int finalIndex = 0;
            for (int i = 0; i < evenArr.length; i++) {
                finalArr[finalIndex++] = evenArr[i];
            }
            for (int i = 0; i < oddArr.length; i++) {
                finalArr[finalIndex++] = oddArr[i];
            }
            return finalArr;
        }
}


	/**
	 * The deadline of assignment4 is 10/12/2018 23:59 PST.
	 * Please feel free to contact Zane and Amanda for any questions.
	 */
public class Demo{	
	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
    public static int firstUniqChar(String s){
    	int[] count = new int[26];
    	char[] c = s.toCharArray();
    	for (int i = 0; i<s.length(); i++) {
    		count[c[i] - 'a']++;
    	}
    	for (int j = 0; j < s.length(); j++) {
    		if (count[c[j] - 'a'] == 1) {
    			return j;
    		}
    	}
    	return -1;
    }
  


    
    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public static int addDigits(int n) {
    	while (n > 9) {
    		int tens = n / 10;
    		int units = n % 10;
    		n = tens + units;
    	}
    	return n;
    }
    
    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public static void moveZeroes(int[] nums) {
    	int[] output = new int[nums.length];
    	int j = 0;
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] != 0) {
    			output[j] = nums[i];
    			j++;
    		}
    	}
    	for (int i = j; i < nums.length; i++) {
    		output[i] = 0;
    	}
    	System.arraycopy(output, 0, nums, 0, nums.length);
    }
	
    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
	public static String longestPalindrome(String s) {
		if(s==null||s.length()==0) return s;
        int n=s.length();
        //substring(i,j) is longestPalindrome
        boolean[][] dp=new boolean[n][n];
        String res = null;
        //[j, i]
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
//           i=j/i-j=1   
                if(s.charAt(i)==s.charAt(j) && (i-j<2 ||dp[j+1][i-1])){   
                    dp[j][i]=true;
                    if(res==null||i-j+1>res.length()){
                      res=s.substring(j,i+1);
                    }  
                }
            }
        }
        return res;
    }
	
    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			                  [4,5,6],
  			                  [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								                                 [8,5,2],
  								  							     [9,6,3] ],
     */
    public static void rotate(int[][] matrix) {
    	 int n = matrix.length;
         for (int offset = 0; offset <= n / 2; offset++) {
             for (int i = offset; i < n - offset - 1; i++) {
                 int t = matrix[offset][i];
                 matrix[offset][i] = matrix[n - 1 - i][offset];
                 matrix[n - 1 - i][offset] = matrix[n - 1 - offset][n - 1 - i];
                 matrix[n - 1 - offset][n - 1 - i] = matrix[i][n - 1 - offset];
                 matrix[i][n - 1 - offset] = t;
             }
         }
    }
}

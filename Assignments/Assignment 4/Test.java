
public class Test {

	public static void main(String[] args) {
		System.out.println(Demo.firstUniqChar("leetcode"));
		
		System.out.println(Demo.addDigits(38));
		
		int[] nums = {0,1,0,0,12}; 
		Demo.moveZeroes(nums);
		for (int i = 0; i < nums.length; i++) {
    		System.out.print(nums[i] + " ");
    	}
		System.out.println();
		
		System.out.println(Demo.longestPalindrome("abcdodc"));
		
		int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9} };
		Demo.rotate(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

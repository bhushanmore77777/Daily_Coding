
public class MissingElementInArray {
	public static int missingNumber(int nums[],int n)
	{
		int expectedTotal=(n*(n+1))/2;
		int total=0;
		for(int i=0;i<nums.length;i++)
		{
			total=total+nums[i];
		}
		return expectedTotal-total;
	}
public static void main(String[] args) {
	int nums[]= {1,2,3,5};
	int n=nums.length;
	System.out.println(missingNumber(nums, n));
}
}

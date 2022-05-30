import java.util.Arrays;

public class DPIntroduction {
	public static int[] dp = new int[] {1,2,4,5,3,1,3};
	public static void main(String[] args) {
		System.out.println(solve(6));
		System.out.println(Arrays.toString(dp));

	}
	static int solve(int n)
	{
	  // base case
	  if (n < 0) 
	      return 0;
	  if (n == 0)
	      return 1;	 
	  // checking if already calculated
	  if (dp[n]!=-1)
	      return dp[n]; 
	  // storing the result and returning
	  return dp[n] = solve(n-1) + solve(n-3) + solve(n-5);
	}
}

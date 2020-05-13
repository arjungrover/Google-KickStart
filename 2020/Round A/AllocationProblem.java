package KickStart;
import java.util.*;
public class Solution {
	public static int solve(Scanner scanner){
		int res = 0;
		int n = scanner.nextInt();
		int amt = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = scanner.nextInt();
		
		Arrays.sort(arr);
		int idx = 0;
		while(idx!=arr.length && amt>0){
			if(arr[idx]>amt)
				return res;
			
			amt-=arr[idx];
			idx++;
			res++;
		}
		
		return res;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i=1;i<=t;i++){
			System.out.println(String.format("Case #%d: %d", i, solve(input)));	
		}

	}

}

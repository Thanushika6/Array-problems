import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		int[] ar = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] =sc.nextInt();
		}
		//printing in reverse order
		for(int i=n-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//modifying the original array to reverse order
		int start=0;
		int end=n-1;
		while(start<end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] =sc.nextInt();
		}
		//replacing all 0s to 1s
		for(int i=0; i<n; i++) {
			if(arr[i]==0) {
				arr[i]=1;
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//replace even munbers to its next odd Number
		for(int i=0; i<n; i++) {
			if(arr[i]%2==0) {
				arr[i]+=1;
			}
			System.out.print( arr[i] + " ");
		}
		System.out.println();
		//replace the first element in the array with 0
		for(int i=0; i<n; i++) {
			if(i==0) {
				arr[i]=0;
			}
			System.out.print(arr[i] +" ");
		}
	}
}

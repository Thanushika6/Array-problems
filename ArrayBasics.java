import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int count=0;
		int sum=0;
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] =sc.nextInt();
		}
		//printing the number of even numbers in the array
		for(int i=0; i<n; i++) {
			if(arr[i]%2==0) {
				count++;
			}
		}
		System.out.println(count);
		//returning the sum of all even numbers in an array
		for(int i=0; i<n; i++) {
			if(arr[i]%2==0) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
		//returning all the values of odd no in array in array structure
		System.out.print("[");
		for(int i=0; i<n; i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("]");
		//replacing/updating a value in array
		for(int i=0; i<n; i++) {
			if(arr[i]==1) {
				arr[i]=0;
			}
			System.out.print(arr[i] + " ");
		}
	}
}

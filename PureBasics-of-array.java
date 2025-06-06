import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n = sc.nextInt();
		//declaration and getting input
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		//printing the array elements
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");

		}
		//sum of array elements
		for(int i=0; i<n; i++) {
			sum=sum+arr[i];
		}
		System.out.println("\n" +sum);
		//finding max of array elements
		int max=arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		//finding minimum of the array
		int min=arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}

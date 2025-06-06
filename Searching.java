import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
		System.out.println("Enter your search element");
		  int target = sc.nextInt();
		  //linear search and printing the position
		  for(int i=0;i<n;i++){
		      if(arr[i] == target){
		          System.out.println("The element is present in " + i);
		      }
		  }
		  //binary search
		 Arrays.sort(arr);
		  int low=0;
		  int high=n-1;
		  while(low<=high){
		      int mid =(low+high)/2;
		      if(arr[mid] == target){
		          System.out.println("The element is present in " + mid);
		          break;
		      }
		      else if(arr[mid]<target){
		          low=mid+1;
		      }
		      else if(arr[mid]>target){
		          high=mid-1;
		      }
		  }
		  
	}
}

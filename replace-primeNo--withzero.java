import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        if(arr[i]<=1){
	            System.out.print(arr[i] + " ");
	            continue;
	        }
	        else{
	            boolean prime = true;
	            for(int j=2;j*j<=arr[i];j++){
	                if(arr[i]%j==0){
	                    prime=false;
	                    break;
	                }
	            }
	                if(prime){
	                    arr[i]=0;
	                }
	          
	            	System.out.print(arr[i] + " ");
	            }
	        }
	}
}

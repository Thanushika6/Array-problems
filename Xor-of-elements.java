//Replace Every Element with XOR of All Other Elements
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    int res=arr[0];
	    for(int i=1;i<n;i++){
	        res = res^arr[i];
	    }
	    for(int i=0;i<n;i++){
	        arr[i]=res^arr[i];
	    }
	    System.out.print(Arrays.toString(arr));
	}
}

//replacing each element with the difference of the greatest element
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int curr=0;
        for(int i=0;i<n;i++){
            if(curr<arr[i]){
                curr=arr[i];
            }
        }
        for(int i =0;i<n;i++){
            int dif = curr-arr[i];
            System.out.print(dif + " ");
        }
    }
}

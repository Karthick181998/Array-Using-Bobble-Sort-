import java.util.Arrays;
import java.util.Scanner;
public class Bobblesort{
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter the array values");
         for(int i=0; i<length; i++){
            arr[i]=sc.nextInt();
        }
        int n=arr.length;
        for(int i=0; i<n-1; i++ ){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp; 
                }	
            }
        }
        System.out.print("After sorting array="+" "+Arrays.toString(arr));
    }
}

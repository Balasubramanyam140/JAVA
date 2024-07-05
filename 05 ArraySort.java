import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Enter "+ n+ " values ");
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        };
        System.out.println("Before Sorting : ");
         for(int i=0;i<n;i++){
            System.out.println(arr[i] + ", ");
        }
        Arrays.sort(arr);
        
        System.out.println("");
        System.out.println("second largest " + arr[arr.length-2]);
        System.out.println("");
         System.out.println("After Sorting");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
}

                 /*             OUTPUT:
                              Enter a number : 4
                              Enter 4 values 4
                              3
                              2
                              1
                              Before Sorting : 
                              4
                              3
                              2
                              1

                              second largest 3

                              After Sorting
                              1
                              2
                              3
                              4
                              
                  */

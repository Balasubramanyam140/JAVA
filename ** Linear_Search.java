//Linear Search
import java.io.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];  
        System.out.println("Enter "+n+" values for the Array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target VAlue which to be find :");
        int target = sc.nextInt();
    /*
        int arr[]= {5,8,6,3,9,0};
        int target = 10;
        int n = arr.length;
    */
        int count =-1;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                count = i;
                break;
            }
        }
        if(count>=0){
        System.out.print("Target " + target +" is found in index " +count);
        }
        else
            System.out.print("Target "+target+" is not found in the array");
    }
}

/*
OUTPUT :
            Enter size of the Array: 
            5
            Enter 5 values for the Array :
            6
            4
            8
            7
            9
            Enter Target VAlue which to be find :
            8
            Target 8 is found in index 2


*/

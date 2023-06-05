          import java.io.*;
          import java.util.Arrays;
          import java.util.Scanner;
          class Main{
              public static void main(String[] args){
                  int a = 60;
                  System.out.println(a);
                  int[] arr = {10,20,30,40,50};
                  System.out.println("Value of 0th place in arr is  "+arr[0]); //Printing a value from the specified place

                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter size of array :");
                  int n = sc.nextInt();
                  System.out.println("Type "+n+" values");
                  int[] Arr1 = new int[n];  //Here 'n' value refered as for wt size it to be stored
                  for(int i=0; i<n; i++){
                      Arr1[i] = sc.nextInt();
                  }
                  System.out.println("Printing Array values");
                  for(int i=0; i<n; i++){
                      System.out.print(Arr1[i]+" ");
                  }
                  int max = Arr1[0];
                  for(int i=0;i<n;i++){
                       max = Arr1[0];
                      if(arr[i]>max)
                         max = Arr1[i];
                  }
                  System.out.println("\nPrinting max value from the array "+max);
                  System.out.println("\nSORTING :");
                  Arrays.sort(Arr1);
                  for(int i=0; i<n; i++){
                      System.out.print(Arr1[i]+" ");
                  }

              }
          }

/*
            60
            Value of 0th place in arr is  10
            Enter size of array :
            4
            Type 4 values
            50
            40
            30
            20
            Printing Array values
            50 40 30 20 
            Printing max value from the array 50

            SORTING :
            20 30 40 50


*/

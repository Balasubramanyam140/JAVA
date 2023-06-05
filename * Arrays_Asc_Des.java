            import java.util.Arrays;
            import java.util.Scanner;
            public class Main{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a number : ");
                    int n = sc.nextInt();
                    System.out.println("Enter "+ n+ " values ");
                    int[] arr = new int[n];
                    for(int i=0;i<n;i++){
                        arr[i] = sc.nextInt();
                    };
                    System.out.println("Before Sorting : ");
                     for(int i=0;i<n;i++){
                        System.out.print(arr[i] + " ");
                    }
                    Arrays.sort(arr);

                    System.out.println("ASCENDING ORDER :");
                    for(int num : arr){
                        System.out.print(num + " ");
                    }
                    System.out.println();

                    System.out.println("DESCENDING ORDER :");
                    for(int i= n-1 ;i >=0;i--){
                        System.out.print(arr[i]+" ");
                    }
                }
            }

          /*
          
          OUTPUT :
          Enter a number : 
          5
          Enter 5 values 
          50
          10
          40
          20
          30
          Before Sorting : 
          50 10 40 20 30 
          ASCENDING ORDER :
          10 20 30 40 50 
          DESCENDING ORDER :
          50 40 30 20 10 
*/

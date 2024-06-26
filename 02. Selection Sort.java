1) Sorting 
    
            class Main{
                public static void main(String[] args){
                    int[] arr = {1,8,9,3,5};
                    int n = arr.length;
                    for(int i=0;i<n-1;i++){
                        int min =i;
                        for(int j=i+1;j<n;j++){
                            if(arr[j]<arr[min]){
                                min = j;
                            }
                        }
                        if(min != i){
                        int temp = arr[min];
                        arr[min] = arr[i];
                        arr[i] = temp;
                        }
                    }
                    for(int i :arr){
                        System.out.print(i+" ");
                    }
                }
            }

OUTPUT :
            1 3 5 8 9
___________________________________________________________________________________________
2) SortedArray using method
    
class Main{
    public static void main(String[] args){
        System.out.println("Unsoreted Array");
        int[] arr = { 1 , 4, 2, 9 , 5, 10 , 8};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        SelectionSort(arr);
        System.out.println("Sorted Array");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void SelectionSort(int[] arr){
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            }
        }
    }
}


OUTPUT :
        Unsoreted Array
        1 4 2 9 5 10 8 
        Soreted Array
        1 2 4 5 8 9 10 
_________________________________________________________________________________________
3) Sorting Method Using Scanner
    
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        System.out.println("Unsoreted Array");
        
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        SelectionSort(arr ,n);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void SelectionSort(int[] arr, int n){
        
        
        for(int i=0;i< n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            }
        }
    }
}

OUTPUT :

            Enter size of Array : 
            6
            Unsoreted Array
            9 6 3 8 2 7 
            
            2 3 6 7 8 9 

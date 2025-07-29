Que 1: Decimal to Binary
Que 1: Binary to Decimal
Que 2: Count of digits in an array
Que 3: No of Perfect Squares in an Array
QUE 4 :
        INPUT :
            5
            3
            3
        OUTPUT:
            5 15 45
QUE 5:  Sum of Odd Number
Que 6 : print missing characters from string
        Programming
        prgming
        output : o m
Que 7: Transpose of Array elements
Que 8 : Print even 1st and then odd
        input : 234532475
        output:242435375
Que 11: Sum of smallest and largest in given range
------------------------------------------------------------------------
Que 1: Decimal to Binary
    import java.util.Scanner;
    
    public class DecimalToBinaryDirect {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            String b = Integer.toBinaryString(a);
            System.out.println(b);
            sc.close();
        }
    }
    ------------------------------------------------------------------------\
Que 1: Binary to Decimal

        import java.util.Scanner;
        
        public class DecimalToBinaryDirect {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String a = sc.next();
                int b = Integer.parseInt(a,2);
                System.out.println(b);
                sc.close();
            }
        }
------------------------------------------------------------------------
Que 2: Count of digits in an array
          import java.util.Scanner;
        class Main{
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                    arr[i]= sc.nextInt();
                }
                int sum =0;
                for(int i=0;i<n;i++){
                    sum += countArr(arr[i]);
                }
                System.out.println(sum);
            }
            static int countArr(int a){//10
                if(a==0){
                    return 0;
                }
                int sum=0;
                while(a>0){//10   1
                    int rem = a%10;//0  1
                    sum= sum+rem;//0   1
                    a=a/10;//1  0
                }
                return sum;
            }
        }
------------------------------------------------------------------------  
Que 3: No of Perfect Squares in an Array

    import java.util.Scanner;
            public class Main {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    for(int i=0;i<n;i++){
                        arr[i] = sc.nextInt();
                    }
                    int count =0;
                    for(int i=0;i<n;i++){
                        if(isPerfectSquare(arr[i])){
                            count++;
                        }
                    }
                    System.out.println("Number of Perfect SQuare : "+count);
                }
                
                static boolean isPerfectSquare(int a){
                    if(a < 0 ) return false;
                    int sqrt = (int) Math.sqrt(a);
                    return sqrt*sqrt ==a;
                }
        }

------------------------------------------------------------------------
QUE 4 :
INPUT :
    5
    3
    3
OUTPUT:
    5 15 45
    
                import java.util.Scanner;
            class Main{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int n = sc.nextInt();
                    
                    for(int i=0;i<n;i++){
                        System.out.print(a+" ");
                        a = a*b;
                    }
                }
            }
------------------------------------------------------------------------
QUE 5:  Sum of Odd Numbers
    public class Main {
    public static void main(String[] args) {
        int n = 5;  
        int sum = 0;
        
        for (int i = 1, count = 0; count < n; i += 2) {
            sum += i;
            count++;
        }
        
        System.out.println("Sum of first " + n + " odd numbers = " + sum);
    }
}

                or
                    
    public class Main{
        public static void main(String[] args){
            int n =5;
            System.out.println(n^2);
        }
    }

        
------------------------------------------------------------------------
Que 6 : print missing characters from string
        Programming
        prgming
        output : o m

        import java.util.Scanner;
        class Main{
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String a = sc.next();
                String b = sc.next();
                
                char[] c = a.toCharArray();
                char[] d = b.toCharArray();
                
                boolean[] visited = new boolean[d.length];
                
                for(int i=0;i<c.length;i++){
                    boolean found = false;
                    for(int j=0;j<d.length;j++){
                        if(c[i] == d[j] && !visited[j]){
                            visited[j] = true;
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.print(c[i]+" ");
                    }
                }
            }
}
------------------------------------------------------------------------
Que 7: Transpose of Array elements

        import java.util.Scanner;
        class Main{
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int row = sc.nextInt();
                int col = sc.nextInt();
                int arr[][] = new int[row][col];
                for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        arr[i][j]= sc.nextInt();
                    }
                }
                for(int i=0;i<col;i++){
                    for(int j=0;j<row;j++){
                        System.out.print(arr[j][i]+" ");
                    }
                    System.out.println();
                }
            }
        }
------------------------------------------------------------------------
Que 8 : Print even 1st and then odd
        input : 234532475
        output:242435375

        import java.util.Scanner;

        class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                long n = sc.nextLong();
                String even = "";
                String odd = "";
                while (n > 0) {
                    long rem = n % 10;
                    if (rem % 2 == 0) {
                        even = even + rem;
                    } else {
                        odd = odd + rem;
                    }
                    n = n / 10;
                }
                System.out.println(even + odd);
            }
        }
------------------------------------------------------------------------
        
Que 11: Sum of smallest and largest in given range
        import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
        }
        int min=arr[0];
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(min+ max);
    }
}
------------------------------------------------------------------------
------------------------------------------------------------------------
------------------------------------------------------------------------
------------------------------------------------------------------------

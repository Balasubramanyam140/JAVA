// Print Palindrome or Not

            import java.util.Scanner;
            class Main{
                static int checkPalindrome(int x, int rev){

                    while(x>0){  //143
                        int y=x%10;  //3
                        x=x/10; //14
                        rev = rev * 10 + y; // 0*10 +3 =3
                    }
                    return rev;
                    }

                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a Number :");
                    int num = sc.nextInt();
                    int x = num;
                    int y;
                    int rev = 0;
                    int Palindrome = checkPalindrome(x,rev);
                    System.out.println(Palindrome);
                    if(Palindrome == num)
                       System.out.println("Palindrome");
                    else
                       System.out.println("Not a Palindrome");
                }
            }
            
/*

OUTPUT :
          Enter a Number :
          141
          141
          Palindrome
*/

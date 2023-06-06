import java.io.*;
class Main{
    public static void main(String[] args){
        int n = 143;
        int digit;
        int temp;
        while(n!=0){
            temp = n;
            int b=1;
            int ans =0;
        
        while(n!=0){
            digit = n%10;
            if(digit>0){
                digit=1;
            }
            else{
                digit=0;
            }
            ans = ans + b * digit;
            b=b*10;
            n=n/10;
        }
        System.out.print(ans+" ");
        n = temp - ans;
        }
    }
}

/*
OUTPUT :
          111 11 11 10 

*/

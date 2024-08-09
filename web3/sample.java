import java.util.*;
class sample{
    public static void main(String[] args){
          //Scanner sc=new Scanner (System.in);
          System.out.println("Hello World");
          int max=Integer.MIN_VALUE;
          for(int i=2;i<=5;i++){
            for(int j=2;j<=5;j++){
                int mul=i*j;
                System.out.print(mul+"***");
              palindrome(mul,max);
            }
          }
          System.out.print("The largest palindrome is: ");
          System.out.print(max);

    }
    public static void palindrome(int mul,int max){
        System.out.println(max);
        int a=mul;
        int num=0;
        // palindrome checks
        while(mul>0){
            int rem=mul%10;
            num=num*10+rem;
            mul/=10;
        }
       
        if(max<num && num==mul){
            max=a;
        }
    }
    // diagonal check
     public static void winner(int arr){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
    
            }
        }
     }
}
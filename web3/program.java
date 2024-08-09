public class program {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int mul=0;
        for(int i=2;i<=999;i++){
            for(int j=2;j<=999;j++){
                mul=i*j;
                int a=mul;
                int num=0;
                while(mul>0){
                    int rem=mul%10;
                    num=num*10+rem;
                    mul=mul/10;
                }
                if(a==num && max<a){
                    max=a;
                }
            }
        }
        System.out.println(max);
    }
}

import java.util.Scanner;
public class p2 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int identity=1;
        char c='1';
        char arr[][]=new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=c;
                c++;
            }
        }
        player1(arr,identity);
    }
    public static void player1(char arr[][],int identity){
        System.out.println("Player1,Please Enter the Input");
        String s=sc.nextLine();
        char c=s.charAt(0);
        if(c>='1' && c<='9'){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(arr[i][j]==c){
                        arr[i][j]='*';
                    }
                }
            }
        }
        else{
           System.out.println("come out of play");
           System.exit(0);
        }
        identity=2;
        printarr(arr,identity);
    }
    public static void printarr(char arr[][],int identity){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        if(identity==1)
            player1(arr,identity);
        else
          player2(arr,identity);
    }
    public static void player2(char arr[][],int identity){
        System.out.println("Player 2,Please Enter the Input");
        String s=sc.nextLine();
        char c=s.charAt(0);
        if(c>='1' && c<='9'){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(arr[i][j]==c){
                        arr[i][j]='o';
                    }
                }
            }
        }
        else
        {
          System.out.println("come out of play");
          System.exit(0);
        }
        identity=1;
        printarr(arr,identity);
    }
}

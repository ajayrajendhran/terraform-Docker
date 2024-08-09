import java.util.*;
public class p1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int b = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = b++;
            }
        }
        System.out.println("Enter a value");
        int a = sc.nextInt();
        while (a >= 1 && a <= 9) {
            System.out.println("hello world");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (arr[i][j] == a) {
                        arr[i][j] = 0;
                    }
                } 
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Enter a value to continue or come out");
            a = sc.nextInt(); 
        }
        System.out.println("Came out of the play");
    }
}

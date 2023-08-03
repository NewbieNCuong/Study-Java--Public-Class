import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print("*");
        }
         System.out.println();
        int tmp = n - 2;
        while(tmp > 0){
            for(int i = 1; i <= n; i++){
                if(i == 1){
                    System.out.print("*");
                }
                else if(i == n){
                    System.out.print("*");
                    break;
                }
                else{System.out.print(" ");}
            }
            System.out.println();
            --tmp;
        }
        for(int i = 1; i <= n; i++){
            System.out.print("*");
        }
    }
}

import java.util.Scanner;
public class Bai3 {
    public static boolean check(int n){
        int cnt = 0;
        for(int i = 2; i < n; i++){
            if(n % i == 0) ++cnt;
        }
        if(cnt != 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(check(n) == true){
            System.out.println("n la so nguyen to!");
        }
        else{
            System.out.println("n khong la so nguyen to!");
        }
    }
}

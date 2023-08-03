import java.util.Scanner;

public class Bai2 {

    public static float phana(int n){
        float s = 0;
        for(int i = 1; i <= n; i++){
            s += 1.0 * 1/i;
        }
        return s;
    }

    public static long phanb(int n){
        long res = 0;
        long tmp = 1;
        for(int i = 1; i <= n; i++){
            tmp *= i;
            res += tmp;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(phana(n));
        System.out.println(phanb(n));
    }
}

import java.util.Scanner;
public class Bai5 {

    public static int sum(int a, int b, int c){
        int res = 0;
        for(int i = a; i > 0; i--){
            if(b >= i * 2 && c >= i * 4){
                res = 7 * i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so qua chanh: a = ");
        int a = sc.nextInt();
        System.out.print("Nhap so qua tao: b = ");
        int b = sc.nextInt();
        System.out.print("Nhap so qua le: c = ");
        int c = sc.nextInt();
        System.out.println(sum(a, b, c));
    }
}

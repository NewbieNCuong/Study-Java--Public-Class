import java.util.Scanner;
import java.util.Arrays;

public class Bai1 {
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu n = ");
        int n = sc.nextInt();
        System.out.print("Nhap mang: ");
        int[] a = new int[1000000];
        int max = 0;
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            a[tmp]++;
            max = tmp > max ? tmp : max;
        } 
        for(int i = 0; i <= max; i++){
            if(a[i] > 0){
                System.out.println("So " + i + " xuat hien " + a[i] + " lan" );
            }
        }
    }
    public static void main(String[] args) {
        solve();
    }
}

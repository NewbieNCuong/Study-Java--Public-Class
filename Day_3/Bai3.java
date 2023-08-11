import java.util.Scanner;
import java.util.Arrays;
public class Bai3 {
    public static void solve(){
        System.out.print("Nhap so luong phan tu: n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Nhap mang: ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        solve();
    }
}

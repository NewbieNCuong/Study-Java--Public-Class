import java.util.Scanner;
import java.util.Arrays;

public class Bai2 {
    public static void add(int[] a, int indx, int value) {
        for (int i = a.length - 1; i > indx; i--) {
            a[i] = a[i - 1];
        }
        a[indx] = value;
    }

    public static void delete(int[] a, int indx) {
        for (int i = indx; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = 0;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn thêm hay xóa?");
        int tmp;
        do {
            System.out.print("Nếu bạn muốn thêm, nhập số 1. Nếu bạn muốn xóa, nhập số 2: ");
            tmp = sc.nextInt();
            if (tmp != 1 && tmp != 2) {
                System.out.println("Xin mời nhập lại.");
            }
        } while (tmp != 1 && tmp != 2);

        if (tmp == 1) {
            System.out.print("Nhập n = ");
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            System.out.print("Nhập mảng: ");
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.print("Nhập vị trí cần thêm phần tử: ");
            int indx = sc.nextInt();
            System.out.print("Nhập giá trị phần tử mới: ");
            int value = sc.nextInt();

            if (indx > n || indx < 1) {
                System.out.println("Lỗi! Vị trí nhập không hợp lệ.");
            } else {
                add(a, indx, value);
                System.out.println(Arrays.toString(a));
            }
        } else {
            System.out.print("Nhập n = ");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.print("Nhập mảng: ");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.print("Nhập vị trí cần xóa: ");
            int indx = sc.nextInt();

            if (indx >= n || indx < 0) {
                System.out.println("Lỗi! Vị trí nhập không hợp lệ.");
            } else {
                delete(a, indx);
                System.out.println(Arrays.toString(a));
            }
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
import java.util.Scanner;
import java.util.Arrays;
public class Bai2 {
    public static void add(int[] a, int indx, int value){
        for(int i = a.length - 1; i > indx; i--){
            a[i] = a[i - 1];
        }
        a[indx] = value;
    }
    public static void delete(int[] a, int indx){
        for(int i = indx; i < a.length - 1; i++){
            a[i] = a[i + 1];
        }
        a[a.length - 1] = 0;
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon them hay xoa");
        int tmp = 1;
        do{ 
            if(tmp != 1 && tmp != 2){
                System.out.println("Xin moi nhap lai");
                System.out.print("Neu ban muon them go so 1, muon xoa go so 2: ");
                tmp = sc.nextInt();
            }
            System.out.print("Neu ban muon them go so 1, muon xoa go so 2: ");
            tmp = sc.nextInt();
        }
        while(tmp != 1 && tmp != 2);
        if(tmp == 1){
            System.out.print("Nhap n = ");
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            System.out.print("Nhap mang: ");
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            System.out.print("Nhap vi tri can them phan tu: ");
            int indx = sc.nextInt();
            System.out.print("Nhap gia tri phan tu moi: ");
            int value = sc.nextInt();
            if(indx > n || indx < 1){
                System.out.println("Loi! Vi tri nhap khong hop le");
            }
            else{
                add(a, indx, value);
                System.out.println(Arrays.toString(a));
            }
        }
        else{
            System.out.print("Nhap n = ");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.print("Nhap mang: ");
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            System.out.print("Nhap vi tri can xoa: ");
            int indx = sc.nextInt();
            if(indx > n || indx < 1){
                System.out.println("Loi! Vi tri nhap khong hop le");
            }
            else{
                delete(a, indx - 1);
                int[] b = Arrays.copyOf(a, n - 1);
                System.out.println(Arrays.toString(b));
            }
        }
    }
    public static void main(String[] args) {
        solve();
    }
}

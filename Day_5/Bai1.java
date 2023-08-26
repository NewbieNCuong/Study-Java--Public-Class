import java.util.Scanner;
class NSX{
    private String MaNSX;
    private String TenNSX;
    private String DcNSX;
    public NSX(){}
    public NSX(String maNSX, String tenNSX, String dcNSX) {
        MaNSX = maNSX;
        TenNSX = tenNSX;
        DcNSX = dcNSX;
    }
    public String getMaNSX() {
        return MaNSX;
    }
    public void setMaNSX(String maNSX) {
        MaNSX = maNSX;
    }
    public String getTenNSX() {
        return TenNSX;
    }
    public void setTenNSX(String tenNSX) {
        TenNSX = tenNSX;
    }
    public String getDcNSX() {
        return DcNSX;
    }
    public void setDcNSX(String dcNSX) {
        DcNSX = dcNSX;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap Ma NSX: ");
        MaNSX = sc.nextLine();
        System.out.printf("Nhap Ten NSX: ");
        TenNSX = sc.nextLine();
        System.out.printf("Nhap DC NSX: ");
        DcNSX = sc.nextLine();
    }
    public void Xuat(){
        System.out.printf("Ma NSX: " + MaNSX);
        System.out.printf("\tTen NSX: " + TenNSX);
        System.out.printf("\tDC NSX: " + DcNSX);
    }
}

class Hang{
    private String MaHang;
    private String TenHang;
    private NSX x;
    public Hang(){}
    public Hang(String maHang, String tenHang, NSX x) {
        MaHang = maHang;
        TenHang = tenHang;
        this.x = x;
    }
    public String getMaHang() {
        return MaHang;
    }
    public void setMaHang(String maHang) {
        MaHang = maHang;
    }
    public String getTenHang() {
        return TenHang;
    }
    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }
    public NSX getX() {
        return x;
    }
    public void setX(NSX x) {
        this.x = x;
    }
    public void Nhap(){
        Scanner sc1 = new Scanner(System.in);
        System.out.printf("Nhap Ma Hang: ");
        MaHang = sc1.nextLine();
        System.out.printf("Nhap Ten Hang: ");
        TenHang = sc1.nextLine();
        x = new NSX();
        x.Nhap();
    }
    public void Xuat(){
        System.out.printf("\tMa Hang: " + MaHang);
        System.out.printf("\tTen Hang: " + TenHang);
        x.Xuat();
    }
}
public class Bai1 {
    public static void main(String[] args) {
        Hang a = new Hang();
        a.Nhap();
        a.Xuat();
    }
}

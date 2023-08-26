import java.util.Scanner;
class May{
    private String mamay;
    private String tenmay;
    private String tinhtrang;
    public May(){}
    public May(String mamay, String tenmay, String tinhtrang) {
        this.mamay = mamay;
        this.tenmay = tenmay;
        this.tinhtrang = tinhtrang;
    }

    public String getMamay() {
        return mamay;
    }

    public void setMamay(String mamay) {
        this.mamay = mamay;
    }

    public String getTenmay() {
        return tenmay;
    }

    public void setTenmay(String tenmay) {
        this.tenmay = tenmay;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma may: ");
        mamay = sc.nextLine();
        System.out.printf("Nhap ten may: ");
        tenmay = sc.nextLine();
        System.out.printf("Nhap tinh trang: ");
        tinhtrang = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma may: " + mamay);
        System.out.println("Ten may: " + tenmay);
        System.out.println("Tinh trang: " + tinhtrang);
    }
}

class QuanLy{
    private String MaQL;
    private String hoten;
    public QuanLy(){}
    public QuanLy(String maQL, String hoten) {
        MaQL = maQL;
        this.hoten = hoten;
    }
    public String getMaQL() {
        return MaQL;
    }
    public void setMaQL(String maQL) {
        MaQL = maQL;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public void Nhap(){
        Scanner sc1 = new Scanner(System.in);
        System.out.printf("Nhap Ma QL: ");
        MaQL = sc1.nextLine();
        System.out.printf("Nhap Ho ten: ");
        hoten = sc1.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma Ql: " + MaQL);
        System.out.println("Ho ten: " + hoten);
    }
}

class PhongMay{
    private String maphong;
    private String tenphong;
    private double dientich;
    private QuanLy x;
    private May[] y;
    private int n;
    public PhongMay(){}
    public PhongMay(String maphong, String tenphong, double dientich, QuanLy x, May[] y, int n) {
        this.maphong = maphong;
        this.tenphong = tenphong;
        this.dientich = dientich;
        this.x = x;
        this.y = y;
        this.n = n;
    }
    public String getMaphong() {
        return maphong;
    }
    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }
    public String getTenphong() {
        return tenphong;
    }
    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }
    public double getDientich() {
        return dientich;
    }
    public void setDientich(double dientich) {
        this.dientich = dientich;
    }
    public QuanLy getX() {
        return x;
    }
    public void setX(QuanLy x) {
        this.x = x;
    }
    public May[] getY() {
        return y;
    }
    public void setY(May[] y) {
        this.y = y;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public void Nhap(){
        Scanner sc2 = new Scanner(System.in);
        System.out.printf("Nhap ma phong: ");
        maphong = sc2.nextLine();
        System.out.printf("Nhap ten phong: ");
        tenphong = sc2.nextLine();
        System.out.printf("Nhap dien tich: ");
        dientich = sc2.nextDouble();
        x = new QuanLy();
        x.Nhap();
        System.out.printf("Nhap so luong may tinh: ");
        n = sc2.nextInt();
        y = new May[n];
        for(int i = 0; i < n; i++){
            y[i] = new May();
            y[i].Nhap();
        }
    }
    public void Xuat(){
        System.out.println("---------------------------------------");
        System.out.println("Ma phong: " + maphong);
        System.out.println("Ten Phong: " + tenphong);
        System.out.println("Dien tich: " + dientich);
        x.Xuat();
        System.out.println("So luong may tinh: " +  n);
        for(int i = 0; i < n; i++){
            System.out.println("-------------------");
            System.out.println("May " + (i + 1));
            y[i].Xuat();
        }
    }
}

public class Bai3 {
    public static void main(String[] args) {
        PhongMay a = new PhongMay();
        a.Nhap();
        a.Xuat();
    }
}
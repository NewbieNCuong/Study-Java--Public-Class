import java.util.Scanner;

class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemTB;
    //Getter, setter dài quá chị =))
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem toan: ");
        diemToan = sc.nextFloat();
        System.out.print("Nhap diem ly: ");
        diemLy = sc.nextFloat();
        System.out.print("Nhap diem hoa: ");
        diemHoa = sc.nextFloat();
        diemTB = (diemHoa + diemLy + diemToan) / 3;
    }

    public void xuat() {
        System.out.printf("%-13s%-20s%-15s%-15s%-10s%-10s%n", maSinhVien, hoTen, diemToan, diemLy, diemHoa, diemTB);
    }
}

public class Bai3 {
    public static void main(String[] args) {
        SinhVien[] sv = new SinhVien[5];
        for (int i = 0; i < sv.length; i++) {
            sv[i] = new SinhVien();
            sv[i].nhap();
        }

        System.out.println("maSinhVien   hoten               diemtoan       diemly         diemhoa   DiemTB");
        for (SinhVien x : sv) {
            x.xuat();
        }
    }
}
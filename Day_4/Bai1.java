import java.util.Scanner;

class Book {
    private String masach;
    private String tensach;
    private String tacgia;
    private String nhaxuatban;
    private String namxuatban;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma sach: ");
        masach = sc.nextLine();

        System.out.print("Ten sach: ");
        tensach = sc.nextLine();

        System.out.print("Tac gia: ");
        tacgia = sc.nextLine();

        System.out.print("Nha xuat ban: ");
        nhaxuatban = sc.nextLine();

        System.out.print("Nam xuat ban: ");
        namxuatban = sc.nextLine();
    }

    public void in() {
        System.out.printf("%-10s%-20s%-15s%-15s%-10s%n", masach, tensach, tacgia, nhaxuatban, namxuatban);
    }

    public Book(String masach, String tensach, String tacgia, String nhaxuatban, String namxuatban) {
        this.masach = masach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.nhaxuatban = nhaxuatban;
        this.namxuatban = namxuatban;
    }

    public Book() {
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public void setNamxuatban(String namxuatban) {
        this.namxuatban = namxuatban;
    }

    public String getMasach() {
        return this.masach;
    }

    public String getTensach() {
        return this.tensach;
    }

    public String getTacgia() {
        return this.tacgia;
    }

    public String getNhaxuatban() {
        return this.nhaxuatban;
    }

    public String getNamxuatban() {
        return this.namxuatban;
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Book[] a = new Book[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhap sach thu " + (i + 1));
            a[i] = new Book();
            a[i].nhap();
        }
        System.out.println("Ma sach   Ten sach            Tac gia        Nha Xuat ban   Nam xuat ban");
        for (Book x : a) {
            x.in();
        }
    }
}
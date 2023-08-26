import java.util.Scanner;
class school{
    private String name;
    private String Date;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }
    public school(String name, String date) {
        this.name = name;
        Date = date;
    }
    public school(){}
}

class Faculty{
    private String name;
    private String date;
    private school x;
    public Faculty(){}
    public Faculty(String name, String date, school x) {
        this.name = name;
        this.date = date;
        this.x = x;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public school getX() {
        return x;
    }
    public void setX(school x) {
        this.x = x;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap name cua faculty: ");
        name = sc.nextLine();
        System.out.printf("Nhap date cua Faculty: ");
        date = sc.nextLine();
        x = new school();
        System.out.printf("Nhap name cua School: ");
        String tmp = sc.nextLine();
        System.out.printf("Nhap Date cua School: ");
        String tmp1 = sc.nextLine();
        x.setName(tmp);
        x.setDate(tmp1);
    }
    public void Output(){
        System.out.println("Name cuar Faculty: " + name);
        System.out.println("Date cua Faculty: " + date);
        System.out.println("School co nam la: " + x.getName()+ " co Date la: " + x.getDate());
    }
}

class Student{
    private String Name;
    private String class1;
    private double Score;
    private Faculty y;
    public Student(){}
    public Student(String name, String class1, double score, Faculty y) {
        Name = name;
        class1 = class1;
        Score = score;
        this.y = y;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getClass1() {
        return class1;
    }
    public void setClass(String class1) {
        class1 = class1;
    }
    public double getScore() {
        return Score;
    }
    public void setScore(double score) {
        Score = score;
    }
    public Faculty getY() {
        return y;
    }
    public void setY(Faculty y) {
        this.y = y;
    }
    public void Input(){
        Scanner sc1 = new Scanner(System.in);
        System.out.printf("Nhap name cua Student: ");
        Name = sc1.nextLine();
        System.out.printf("Nhap class cua Student: ");
        class1 = sc1.nextLine();
        System.out.printf("Nhap score cua Student: ");
        Score = sc1.nextFloat();
        sc1.nextLine();
        y = new Faculty();
        y.Input();
    }
    public void Output(){
        System.out.println("Name cua Student: " + Name);
        System.out.println("Class cua Student: " + class1);
        System.out.println("Score cua Student: " + Score);
        y.Output();
    }
}

public class Bai2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        Student[] a = new Student[n];
        for(int i = 0; i < n; i++){
            System.out.println("Nhap sinh vien thu " + (i + 1));
            a[i] = new Student();
            a[i].Input();
        }
        for(Student x : a){
            System.out.println("-------------------------------------------");
            x.Output();
        }
    }
}
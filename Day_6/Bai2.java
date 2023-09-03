import java.util.ArrayList;
import java.util.Scanner;

class Person{
    private String name;
    private Byte age;
    private String address;
    private Date birthday;
    public Person(){}
    public Person(String name, Byte age, String address, Date birthday) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Byte getAge() {
        return age;
    }
    public void setAge(Byte age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public void input(){
        Scanner sc1 = new Scanner(System.in);
        System.out.printf("Enter name: ");
        name = sc1.nextLine();
        System.out.printf("Enter age: ");
        age = sc1.nextByte();
        sc1.nextLine();
        System.out.printf("Enter address: ");
        address = sc1.nextLine();
        birthday = new Date();
        birthday.input();
    }
    public void output(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        birthday.output();
    }
}

class Date{
    private Byte year;
    private Byte month;
    private Byte day;
    public Date(){}
    public Date(Byte year, Byte month, Byte day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Byte getYear() {
        return year;
    }
    public void setYear(Byte year) {
        this.year = year;
    }
    public Byte getMonth() {
        return month;
    }
    public void setMonth(Byte month) {
        this.month = month;
    }
    public Byte getDay() {
        return day;
    }
    public void setDay(Byte day) {
        this.day = day;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter year: ");
        year = sc.nextByte();
        System.out.printf("Enter month: ");
        month = sc.nextByte();
        System.out.printf("Enter Day: ");
        day = sc.nextByte();
    }
    public void output(){
        System.out.printf("Date: %d/%d/%d\n",year, month, day);
    }
}

class Student extends Person{
    private String id;
    private String class1;
    private String school;
    public Student(){}
    public Student(String name, Byte age, String address, Date birthday, String id, String class1, String school) {
        super(name, age, address, birthday);
        this.id = id;
        this.class1 = class1;
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    @Override
    public void input(){
        Scanner sc2 = new Scanner(System.in);
        super.input();
        System.out.printf("Enter id: ");
        id = sc2.nextLine();
        System.out.printf("Enter class: ");
        class1 = sc2.nextLine();
        System.out.printf("Enter school: ");
        school = sc2.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Id: " + id);
        System.out.println("class: " + class1);
        System.out.println("School: " + school);
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter so luong sinh vien: ");
        int n = sc.nextInt();
        ArrayList<Student> a = new ArrayList<Student>(n);
        for(int i = 0; i < n; i++){
            System.out.println("Nhap sinh vien thu " + (i + 1));
            Student tmp = new Student();
            tmp.input();
            a.add(tmp);
            System.out.println("------------------------------------");
        }
        for(int i = 0; i < n; i++){
            System.out.println("--------------------------------------------------");
            Student student = a.get(i);
            student.output();
        }

    }
}

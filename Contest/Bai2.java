    import java.util.Scanner;
    import java.util.ArrayList;
    class Person{
        private String name;
        private int age;
        private String gender;
        public Person(){}
        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        public void input(){
            Scanner sc = new Scanner(System.in);
            System.out.printf("Enter name: ");
            name = sc.nextLine();
            System.out.printf("Enter age: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.printf("Enter gender: ");
            gender = sc.nextLine();
        }
        public void ouput(){
            System.out.printf("%-10s%-10d%-10sn", name, age, gender);
        }
    }

    class address{
        private String city;
        private String district;
        public address(){}
        public address(String city, String district) {
            this.city = city;
            this.district = district;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public String getDistrict() {
            return district;
        }
        public void setDistrict(String district) {
            this.district = district;
        }
        public void input(){
            Scanner sc = new Scanner(System.in);
            System.out.printf("Enter city: ");
            city = sc.nextLine();
            System.out.printf("Enter district: ");
            district = sc.nextLine();
        }
        public void output(){
            System.out.printf("%-10s%-10sn", city, district);
        }
    }

    class Student extends Person{
        private int id;
        private address Address;
        private double gpa;
        public Student(){
        }
        public Student(int id, address address, double gpa) {
            this.id = id;
            Address = address;
            this.gpa = gpa;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public address getAddress() {
            return Address;
        }
        public void setAddress(address address) {
            Address = address;
        }
        public double getGpa() {
            return gpa;
        }
        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
        public void input(){
            Scanner sc1 = new Scanner(System.in);
            super.input();
            System.out.printf("Enter id: ");
            id = sc1.nextInt();
            sc1.nextLine();
            Address = new address();
            Address.input();
            System.out.printf("Enter gpa:  ");
            gpa = sc1.nextDouble();
        }
        public void output(){
            super.ouput();
            System.out.printf("%-10d%-10fn", id, gpa);
            Address.output();
        }
    }

    class Classroom{
        private int classId;
        private int numberOfStudent;
        private ArrayList<Student> listStudents;
        public Classroom(){}
        public Classroom(int classId, int numberOfStudent, ArrayList<Student> listStudents) {
            this.classId = classId;
            this.numberOfStudent = numberOfStudent;
            this.listStudents = listStudents;
        }
        public int getClassId() {
            return classId;
        }
        public void setClassId(int classId) {
            this.classId = classId;
        }
        public int getNumberOfStudent() {
            return numberOfStudent;
        }
        public void setNumberOfStudent(int numberOfStudent) {
            this.numberOfStudent = numberOfStudent;
        }
        public ArrayList<Student> getListStudents() {
            return listStudents;
        }
        public void setListStudents(ArrayList<Student> listStudents) {
            this.listStudents = listStudents;
        }
        public void input(){
            Scanner sc2 = new Scanner(System.in);
            System.out.printf("Enter classId: ");
            classId = sc2.nextInt();
            System.out.printf("Enter number of Student: ");
            numberOfStudent = sc2.nextInt();
            for(int i = 0; i < numberOfStudent; i++){
                Student a = new Student();
                a.input();
                listStudents.add(a);
            }
        }
        public void output(){
            System.out.printf("%-10d%-10dn", classId, numberOfStudent);
            for(Student x : listStudents){
                System.out.println("----------------");
                x.output();
            }
        }
        public ArrayList<Student> searchByName(String name){
            for(int i = 0; i < numberOfStudent; i++){
                if(listStudents.get(i).getName() == name){
                    return listStudents;
                }
            }
        }
    }

    public class Bai2 {
        public static void main(String[] args) {
            Classroom a = new Classroom();
            a.input();
            a.output();
        }
    }

import java.util.Scanner;
class Animal{
    private String name;
    private int age;
    private float weight;
    public Animal(){}
    
    public Animal(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap name: ");
        name = sc.nextLine();
        System.out.printf("Nhap age: ");
        age = sc.nextInt();
        System.out.printf("Nhap weight: ");
        weight = sc.nextFloat();
        sc.nextLine();
    }
    public void output(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
    public void tiengKeu(){
    }
}

class Dog extends Animal{
    private String character;
    public Dog(){}
    public Dog(String name, int age, float weight, String character){
        super(name, age, weight);
        this.character = character;
    }
    public String getCharacter() {
        return character;
    }
    public void setCharacter(String character) {
        this.character = character;
    }
    @Override
    public void input(){
        Scanner sc1 = new Scanner(System.in);
        super.input();
        System.out.printf("Nhap character: ");
        character = sc1.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Character: " + character);
    }
    @Override
    public void tiengKeu(){
        System.out.println("Mew Mew Mew");
    }
}

class Cat extends Animal{
    private String color;
    private String preferences;
    private String ownerName;
    public Cat(){}
    
    public Cat(String name, int age, float weight, String color, String preferences, String ownerName) {
        super(ownerName, age, weight);
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    @Override
    public void input(){
        Scanner sc2 = new Scanner(System.in);
        super.input();
        System.out.printf("Nhap color: ");
        color = sc2.nextLine();
        System.out.printf("Nhap preferences: ");
        preferences = sc2.nextLine();
        System.out.printf("Nhap ownerName: ");
        ownerName = sc2.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Color: " + color);
        System.out.println("Preferences: " + preferences);
        System.out.println("OwnerName: " + ownerName);
    }
    @Override
    public void tiengKeu(){
        System.out.println("Gau Gau Gau");
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.input();
        a.output();
        a.tiengKeu();
        Cat b = new Cat();
        b.input();
        b.output();
        b.tiengKeu();
    }
}

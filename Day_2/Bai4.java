import java.util.Scanner;
import java.lang.Math;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        float a = sc.nextFloat();
        System.out.print("Nhap b = ");
        float b = sc.nextFloat();
        System.out.print("Nhap c = ");
        float c = sc.nextFloat();
        if(a == 0 && b == 0 && c != 0){
            System.out.println("Phuong trinh vo nghiem");
            System.exit(0);
        }
        if(a == b && b == c && a == 0){
            System.out.println("Phuong trinh vo so nghiem!");
            System.exit(0);
        }
        float denta = b * b - 4 * a * c;
        if(denta < 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if(denta == 0){
            float x = -b/ (2 * a);
            System.out.println("Phuong trinh co 2 nghiem:\nx1 = -" +  Math.sqrt(x));
            System.out.println("x2 = " +  Math.sqrt(x));
        }
        else{
            double x1 = (-b + Math.sqrt(denta)) / (2 * a);            
            double x2 = (-b - Math.sqrt(denta)) / (2 * a);
            System.out.println("Phuong trinh co 4 nghiem:\n x1 = " + Math.sqrt(x1));            
            System.out.println("x2 = -" + Math.sqrt(x1));            
            System.out.println("x3 = " + Math.sqrt(x2));            
            System.out.println("x4 = -" + Math.sqrt(x2));
        }
    }
}

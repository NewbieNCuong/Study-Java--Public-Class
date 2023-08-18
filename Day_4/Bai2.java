import java.util.Scanner;
class HCN{
    private int D;
    private int R;
    public HCN(){
    };
    public HCN(int D, int R){
        this.D = D;
        this.R = R;
    }
    // Getter, setter tượng tự bài 1 =)) viết nhiều quá chị ơi 
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Chieu dai: ");
        D = sc.nextInt();
        System.out.print("Nhap chieu rong: ");
        R = sc.nextInt();
    }
    public void veHCN(){
        for(int i = 0; i < D; i++){
            System.out.print("*");
        }
        System.out.println();
        int tmp = R - 2;
        while(tmp > 0){
            for(int i = 1; i <= D; i++){
                if(i == 1){
                    System.out.print("*");
                }
                else if(i == D){
                    System.out.print("*");
                    break;
                }
                else{System.out.print(" ");}
            }
            System.out.println();
            --tmp;
        }
        for(int i = 0; i < D; i++){
            System.out.print("*");
        }
    }
    public float chuVi(){
        return (D + R) * 2;
    }
    public float dientich(){
        return D * R;
    }
}
public class Bai2 {
    public static void main(String[] args) {
        HCN a = new HCN();
        a.nhap();
        System.out.println("Chu vi: " + a.chuVi());
        System.out.println("Dien tich: " +  a.dientich());
        a.veHCN();
    }
}

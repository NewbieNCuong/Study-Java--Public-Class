import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                System.out.println("False");
                System.exit(0);
            }
            ++i;
            --j;
        }
        System.out.println("True");
    }
}


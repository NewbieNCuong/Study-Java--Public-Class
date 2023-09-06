import java.util.Scanner;
import java.lang.Character;
public class Bai1 {

    public static int bien(String a){
        int res1 = 0;
        for(int i = 0; i < a.length(); i++){
            res1 = res1 * 10 + (int)a.charAt(i);
        }
        return res1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.next();
        int res = 0;
        String  a = "";
        int cnt = 0;
        for(int i = 0; i < tmp.length(); i++){
            if(tmp.charAt(i) == '-'){
                cnt += 1;
                continue;
            }
            else if(Character.isDigit(tmp.charAt(i)) == true){
                a += tmp.charAt(i);
                continue;
            }
            else{
                if(cnt > 0 && a != ""){
                    res -= bien(a);
                    cnt = 0;
                }
                else if(a != ""){
                    res += bien(a);
                }
                else{
                    continue;
                }
            }
        }
        System.out.println(res);
    }
}

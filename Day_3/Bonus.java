import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
public class Bonus{
    public static void solve1(){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s = s1.trim();
        String[] res = new String[3];
        String tmp = "";
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(i > 0 && s.charAt(i) != ' ' && s.charAt(i - 1) == ' '){
                res[j] = tmp;
                ++j;
                tmp = "";
                tmp += s.charAt(i);
                continue;
            }
            else if(s.charAt(i) != ' '){
                tmp += s.charAt(i);
            }
            else{
                continue;
            }
        }
        res[j] = tmp;
        for(int i = 0; i < 3; i++){
            res[i] = res[i].toLowerCase();
            res[i] = Character.toUpperCase(res[i].charAt(0)) + res[i].substring(1);
        }
        for(int i = 0; i < 3; i++){
            System.out.print(res[i] + " ");
        }
    }

    public static void solve2(){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = s1.trim();
        String[] s = s2.split("\\s+");
        String[] res = new String[3];
        for(int i = 0; i < 3; i++){
            res[i] = s[i].toLowerCase();
            res[i] = Character.toUpperCase(res[i].charAt(0)) + res[i].substring(1);
        }
        for(int i = 0; i < 3; i++){
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args) {
        // Có 2 cách =))
        // solve1();
        solve2();
    }
}
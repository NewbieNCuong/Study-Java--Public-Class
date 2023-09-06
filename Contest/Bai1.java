import java.util.Scanner;

public class Bai1 {
    public static int bien(String a) {
        int res1 = 0;
        if (!a.isEmpty()) {
            try {
                res1 = Integer.parseInt(a);
            } catch (NumberFormatException e) {
                res1 = 0;
            }
        }
        return res1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.next();
        int res = 0;
        String a = "";
        int cnt = 0;
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == '-') {
                cnt += 1;
                continue;
            } else if (Character.isDigit(tmp.charAt(i))) {
                a += tmp.charAt(i);
                continue;
            } else {
                if (cnt > 0 && !a.isEmpty()) {
                    res -= bien(a);
                    cnt = 0;
                } else if (!a.isEmpty()) {
                    res += bien(a);
                }
                a = "";
            }
        }
        if (cnt > 0 && !a.isEmpty()) {
            res -= bien(a);
        } else if (!a.isEmpty()) {
            res += bien(a);
        }
        System.out.println(res);
    }
}
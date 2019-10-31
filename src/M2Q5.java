import java.util.*;
public class M2Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextShort();
        String s = "";
        while (n >= 1){
            s = Integer.toString(n % 2) + s;         /* 數字轉字串 */
            n /= 2;
        }
        System.out.printf("%08d\n" , Integer.parseInt(s));
    }
}

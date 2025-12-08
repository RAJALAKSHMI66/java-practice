package High_voltage;
import java.util.*;
public class diamond_pattern {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        char n=scan.next().charAt(0);
        int rows=n-'A'+1;
        for(int i=0;i<=rows;i++){
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            for (char ch = (char)('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            for (char ch = 'B'; ch <= (char)('A' + i - 1); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

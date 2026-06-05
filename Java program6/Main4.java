import java.util.*;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        if(l == b) 
            System.out.println("Area = " + (l*b));
        else 
            System.out.println("Perimeter = " + 2*(l+b));
    }
}
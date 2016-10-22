import java.util.*;
public class Karatsuba {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstZeroes;
        int secondZeroes;
        System.out.print("Enter 1st number: ");
        String firstNumber = input.next();
        System.out.print("Enter 2nd number: ");
        String secondNumber = input.next();
       
        int a = Integer.parseInt(firstNumber.substring(0, 2));
        int b = Integer.parseInt(firstNumber.substring(2, 4));
        int c = Integer.parseInt(secondNumber.substring(0, 2));
        int d = Integer.parseInt(secondNumber.substring(2, 4));
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        int ac = a * c;
        int ad = a * d;
        int bc = b * c;
        int bd = b * d;
        int adbc = ad + bc;
        
        System.out.print(ac + " ");
        System.out.print(ad + " ");
        System.out.print(bc + " ");
        System.out.print(bd);
        
        int answer = (ac*10000) + (adbc * 100) + bd;
        System.out.println("ANSWER " + answer);
 
    }
    
}

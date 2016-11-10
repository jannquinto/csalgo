

import java.util.Scanner;

/**
 *
 * @author aalucila
 */
public class Gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input num1 ");
        num1 = sc.nextInt();
        System.out.print("Input num2 ");
        num2 = sc.nextInt();
 
        System.out.print(gcd(num1,num2));
    }
    
    static int gcd(int m, int n){
     if(n==0){
         return m;
    }
    else return gcd(n,m%n);

    }
}
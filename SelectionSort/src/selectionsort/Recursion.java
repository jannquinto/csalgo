import java.util.*;
public class Recursion {
    
    public static void main(String args[]){
        int num;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        num = input.nextInt();
        sum(num);
        System.out.println(sum(num));
    }
    
    static int sum(int num){
        if(num == 1){
            return 1;
        }
        else 
            return num + sum(num-1);
                    
    }
}

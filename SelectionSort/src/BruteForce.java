import java.util.*;
public class BruteForce {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int numberOfLetters;
        
        System.out.print("Enter number of elements: ");
        int numberOfElements = input.nextInt();
        
        String elements[] = new String[numberOfElements];
        for(int a = 0; a < numberOfElements; a++){
            System.out.print("Element "+a+":");
            elements[a] = input.next();
        }
        
        do{ 
            System.out.print("Enter number of letters: ");
            numberOfLetters = input.nextInt();
            if(numberOfLetters > numberOfElements){
                System.out.println("CANNOT BE");
            }
            else{
                String pattern[] = new String[numberOfLetters];
                for(int a = 0; a < numberOfLetters; a++){
                    System.out.print("Element "+a+":");
                    pattern[a] = input.next();
                }
            }
        }while(numberOfLetters > numberOfElements);
        
        

    }
}

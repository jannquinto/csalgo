import java.util.*;
public class CoinDemo {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double target = input.nextDouble();
        double numberOfTimesForTen = 0;
        double numberOfTimesForFive = 0;
        double numberOfTimesForOne = 0;
        double numberOfTimesForPoint25 = 0;
        System.out.println(target);    
        while((target - 10) >= 0){
            target = target - 10;
            ++numberOfTimesForTen;
            System.out.println("Number of Times For Ten: " + numberOfTimesForTen);
            System.out.println("Target: " + target);
        }
        while((target - 5) >= 0){
            target = target - 5;
            ++numberOfTimesForFive;
            System.out.println("Number of Times For Five: " + numberOfTimesForFive);
            System.out.println("Target: " + target);
        }
        while((target - 1) > 0){
            target = target - 1;
            ++numberOfTimesForOne;
            System.out.println("Number of Times For One: " + numberOfTimesForOne);
            System.out.println("Target: " + target);
        }
        while((target - .25) >= 0){
            target = target - 0.25;
            ++numberOfTimesForPoint25;
            System.out.println("Number of Times For Five: " + numberOfTimesForPoint25);
            System.out.println("Target: " + target);
        }
        System.out.println("10 Pesos bills " + numberOfTimesForTen);
        System.out.println("5 Pesos bills " + numberOfTimesForFive);
        System.out.println("1 Peso bills " + numberOfTimesForOne);
        System.out.println(".25 Cents bills " + numberOfTimesForPoint25);
    }
}

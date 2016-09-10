import java.util.*;
public class SelectionSort {
    static int[] List = {10,3,6,7,5};   
    public static void main(String[] args) {
        int temp;
        for(int a = 0; a < 5; a++){
            System.out.println(List[a]);
        }
        for(int a = 0; a < 5; a++){
            for(int z = 0; z < 5; z++){
                if(List[a] < List[z]){
                    System.out.println(a +" "+ z);
                    temp = List[a];
                    List[a] = List[z];
                    List[z] = temp;
                }
            }
        }
        System.out.println("SORTED");
        for(int a = 0; a < 5; a++){
            System.out.println(List[a]);
        }           
    }
}

import java.util.Scanner;
import java.util.Random;

public class LinearSearch {
    public int i, size, search, array[];
  
    
    public void searcher (int size) {
    array = new int[size];
    Random rand = new Random();
        for (i = 0; i < size; i++) {
            array [i] = rand.nextInt(1000);
        
        for  (i = 0; i < array.length; i++)
        if (array[i] == search) {
        }
            System.out.println("Found! \n" + search + " is at " + "array [" + i + "]");
            break;
        }
    
        if (i != size) {
            System.out.println("Not Found! \n" + search + " is not in the array");
    }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinearSearch look = new LinearSearch ();
        
            System.out.print("Enter Array Size:" );
            int size = input.nextInt();
            System.out.print("Enter Number you want to search :");
            int search = input.nextInt();
        
                look.searcher(size);    
       
        }
    }
    

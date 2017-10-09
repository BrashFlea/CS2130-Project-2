package cs2130p2;
import java.util.Scanner;

public class P2PartC {
    
    public static void main(String args[]) {
        Scanner stdin = new Scanner(System.in);
        boolean posInt = false;
        long sPoint = -1;
        long ePoint = -1;
        
        if(args.length == 2){
            sPoint = Long.parseLong(args[0]);
            ePoint = Long.parseLong(args[1]);
            if(sPoint >= 0 && ePoint >= 0) {
                posInt = true;
            }
            else {
                System.out.println("Starting and ending numbers must be positive");
            }
        }
        
        while(posInt == false) {
            System.out.println("Enter the starting number: ");
            sPoint = stdin.nextLong();
            System.out.println("Enter the ending number: ");
            ePoint = stdin.nextLong();
            if(sPoint >= 0 && ePoint >= 0) {
                posInt = true;
            }
            else {
                System.out.println("Starting and ending numbers must be positive");
            }
        }

        System.out.println("K-Numbers: ");
        for (long i = sPoint; i < ePoint + 1; i++) {
            if(KNumber(i)) {
                System.out.println(i);
            }
        }
        stdin.close();        
    }
    
    private static boolean OddInt(long x) {
        
        if(x%2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    private static boolean SquareInt(long x) {
        
        long squareRoot = (long) Math.sqrt(x);
        if (squareRoot * squareRoot == x) {
            return true;
        }
        else {
            return false;
        }
    }
    
    private static boolean SymmetricInt(long x) {
        
        long y = x;
        long z = 0;
        
        while (y != 0) {
            long temp = y % 10;
            z = z * 10 + temp;
            y = y /10;
        }
        
        if (x == z) {
            return true;
        }
        else {
            return false;
        } 
    }
    
    private static boolean KNumber(long x) {
        
        if((OddInt(x) && SquareInt(x) && SymmetricInt(x)) == true){
            return true;
        }
        else {
            return false;
        }
    }
   
} // end class

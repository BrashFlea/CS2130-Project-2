package cs2130p2;

public class P2PartB {
    public static void main(String args[]) {
        int result;
        
        System.out.println("X "+"| "+"Y "+"| "+"Z "+"| " +"W "+"| " +"F ");
        System.out.println("-----------------");
        result = LCircuit(0,0,0,0);
        System.out.println(0 +" | "+ 0 +" | "+ 0 +" | " + 0 +" | " + result);
        result = LCircuit(0,0,0,1);
        System.out.println(0 +" | "+ 0 +" | "+ 0 +" | " + 1 +" | " + result);
        result = LCircuit(0,0,1,0);
        System.out.println(0 +" | "+ 0 +" | "+ 1 +" | " + 0 +" | " + result);
        result = LCircuit(0,0,1,1);
        System.out.println(0 +" | "+ 0 +" | "+ 1 +" | " + 1 +" | " + result);
        result = LCircuit(0,1,0,0);
        System.out.println(0 +" | "+ 1 +" | "+ 0 +" | " + 0 +" | " + result);
        result = LCircuit(0,1,0,1);
        System.out.println(0 +" | "+ 1 +" | "+ 0 +" | " + 1 +" | " + result);
        result = LCircuit(0,1,1,0);
        System.out.println(0 +" | "+ 1 +" | "+ 1 +" | " + 0 +" | " + result);
        result = LCircuit(0,1,1,1);
        System.out.println(0 +" | "+ 1 +" | "+ 1 +" | " + 1 +" | " + result);
        result = LCircuit(1,0,0,0);
        System.out.println(1 +" | "+ 0 +" | "+ 0 +" | " + 0 +" | " + result);
        result = LCircuit(1,0,0,1);
        System.out.println(1 +" | "+ 0 +" | "+ 0 +" | " + 1 +" | " + result);
        result = LCircuit(1,0,1,0);
        System.out.println(1 +" | "+ 0 +" | "+ 1 +" | " + 0 +" | " + result);
        result = LCircuit(1,0,1,1);
        System.out.println(1 +" | "+ 0 +" | "+ 1 +" | " + 1 +" | " + result);
        result = LCircuit(1,1,0,0);
        System.out.println(1 +" | "+ 1 +" | "+ 0 +" | " + 0 +" | " + result);
        result = LCircuit(1,1,0,1);
        System.out.println(1 +" | "+ 1 +" | "+ 0 +" | " + 1 +" | " + result);
        result = LCircuit(1,1,1,0);
        System.out.println(1 +" | "+ 1 +" | "+ 1 +" | " + 0 +" | " + result);
        result = LCircuit(1,1,1,1);
        System.out.println(1 +" | "+ 1 +" | "+ 1 +" | " + 1 +" | " + result);
 
    }

    private static int LCircuit(int x, int y, int z, int w) {

       int l1 = ANDgate(y,NOTgate(z));
       int l2 = ORgate(NOTgate(x),w);
       int LF = ANDgate(l1, l2);
       
       int r1 = ORgate(z,x);
       int RF = ANDgate(NOTgate(y), r1);
       
       int Result = ORgate(LF,RF);
       
       return Result;
    }

    private static int ANDgate(int x, int y) {
       // Logical AND function
       char f = 0;
       if(x == 1 && y == 1) {
           f = 1;           
       }
       return f;
    }

    private static int ORgate(int x, int y) {
       // Logical OR function
        int f = 0;
        if(x == 1 || y == 1) {
            f = 1;            
        }
        return f;
    }

    private static int NOTgate(int x) {
       // Logical NOT function
        int f = 0;
        if (x == 0) {
            f = 1;
        }
        return f;
    }

} // end class

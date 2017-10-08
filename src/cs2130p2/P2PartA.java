//Program P2PartA.java
//Function: f is the truth value of a logical proposition.

package cs2130p2;

public class P2PartA {
    
    public static void main(String args[]) {
        char f = 'F';
        char t = 'T';
        char output;
        
        System.out.println("P "+"| "+"Q "+"| "+"R "+"| " + "F ");
        System.out.println("-------------");
        output = LProp(f,f,f);
        System.out.println(f +" | "+ f +" | "+ f +" | " + output);
        output = LProp(f,t,f);
        System.out.println(f +" | "+ t +" | "+ f +" | " + output);
        output = LProp(f,f,t);
        System.out.println(f +" | "+ f +" | "+ t +" | " + output);
        output = LProp(f,t,t);
        System.out.println(f +" | "+ t +" | "+ t +" | " + output);
        output = LProp(t,f,f);
        System.out.println(t +" | "+ f +" | "+ f +" | " + output);
        output = LProp(t,t,f);
        System.out.println(t +" | "+ t +" | "+ f +" | " + output);
        output = LProp(t,f,t);
        System.out.println(t +" | "+ f +" | "+ t +" | " + output);
        output = LProp(t,t,t);
        System.out.println(t +" | "+ t +" | "+ t +" | " + output);  
    }

    private static char LProp(char p, char q, char r) {
     // Logical expression 
       char l1 = ORlogic(q,p);
       char l2 = NOTlogic(l1);
       char LF = ANDlogic(r, l2);
       
       char r1 = ORlogic(r, NOTlogic(p));
       char RF = NOTlogic(r1);
       
       char Result = ORlogic(LF,RF);
       
       return Result;
    }

    private static char ANDlogic(char p, char q) {
       // Logical AND function
       char f = 'F';
       if(p == 'T' && q == 'T') {
           f = 'T';           
       }
       return f;
    }

    private static char ORlogic(char p, char q) {
       // Logical OR function
        char f = 'F';
        if(p == 'T' || q == 'T') {
            f = 'T';            
        }
        return f;
    }

    private static char NOTlogic(char p) {
       // Logical NOT function
    	char f = 'F';
    	if (p == 'F') {
    		f = 'T';
    	}
    	return f;
    }

} // end class

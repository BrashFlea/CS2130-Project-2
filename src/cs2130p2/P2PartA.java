//Program P2PartA.java
//Function: f is the truth value of a logical proposition.

package cs2130p2;

import java.io.*;

public class P2PartA {
    public static void main(String args[]) {


    }

    private static char LProp(char p, char q, char r) {
       // Logical expression
    
    
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

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import javax.swing.*;

/*
Test Data
1. 0 0 -> gcd is not defined
2. 12 0 -> gcd = 12
3. 0 6 -> gcd = 6
4. -2 4 -> input is illegal
5. 48 32 -> gcd = 16
6. 25 8 -> gcd = 1

Algorithm:
1. Repeat until input is valid:
   a.  Read two integers from the user.
   b.  If the user does not give two integers the input is invalid.
   c.  If both integers are negative the input is not valid.

2  The input is valid, call gcd method to determine the greatest common divisor.
3. Print the gcd.
*/


public class GCD01
{
  public static void main(String[] args)
  {
    boolean valid = false;
    while(!valid)
    {
       String next = JOptionPane.showInputDialog("Enter two non-negative integers");
       try
       {
            StringTokenizer tokens = new StringTokenizer(next);
            if(tokens.countTokens() != 2)
              JOptionPane.showMessageDialog(null, "You must enter two values.");
            else
            {
               String firstToken = tokens.nextToken();
               String secondToken = tokens.nextToken();
               int first = Integer.parseInt(firstToken);
               int second = Integer.parseInt(secondToken);
               if(first < 0 || second < 0)
                  JOptionPane.showMessageDialog(null, "The input cannot be negative.");
               else if(first == 0 && second == 0)
               {
                    JOptionPane.showMessageDialog(null, "The gcd is not defined since both values are zero. ");
               }
               else
               {
				   valid = true;
				   int result = gcd(first, second);
				   JOptionPane.showMessageDialog(null, "The gcd of " + first + " and " + second + " is " + result);
               }
            }
         }
         catch(NumberFormatException e)
         {
             JOptionPane.showMessageDialog(null, "Invalid input, please try again. ");
         }
       }
    }



/*
  Parameter: two integers, n and m.
  Return: an integer equal to the gcd of n and m.
  Algorithm:
1.  While m is not zero:
    a. save n in a temporary variable.
    b. replace n with m.
    c. replace m with the temporary mod n.
2.  Return n.
*/

  public static int gcd(int n, int m)
  {
	  while(m != 0)
	  {
		  int temp = n;
		  n = m;
		  m = temp % n;
	  }
	  return n;
  }
}
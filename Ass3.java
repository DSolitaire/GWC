import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import javax.swing.*;

/*
Test Data
5,3,4 - 6
16,16,2 - 16
0, 1, 2- no zeros values
-1, 0, 1- no negative values
8,3,4- sides when added are less than remaining sides

Algorithm
1. Repeat unitl input is valid:
	a.receive three values
	b.check if the values are positive and not zero
	c.check if any two of the values when added together equal less than the remaining one
2. Take vaild input and call method area to get the area of the triangle
3. print the area of the triangle
*/
public class Ass3
{
  public static void main(String[] args)
  {
 boolean valid = false;
    while(!valid)
    {
       String next = JOptionPane.showInputDialog("Enter three sides of a triangle");
       try
       {
            StringTokenizer tokens = new StringTokenizer(next, ",:; ");
            if(tokens.countTokens() != 3)
              JOptionPane.showMessageDialog(null, "You must enter three sides");
            else
            {
               String firstToken = tokens.nextToken();
               String secondToken = tokens.nextToken();
               String thirdToken = tokens.nextToken();
               int first = Integer.parseInt(firstToken);
               int second = Integer.parseInt(secondToken);
               int third = Integer.parseInt(thirdToken);
               if(first < 0 || second < 0 || third < 0)
                  JOptionPane.showMessageDialog(null, "The input cannot be negative.");

               else if(first + second < third || second + third < first || first + third < second)
                     JOptionPane.showMessageDialog(null, "The sides do not obey the triangle inequality theorem. ");
               else if(first == 0 || second == 0 || third == 0)
			 {
				  JOptionPane.showMessageDialog(null, "No sides can be zero. ");
               }
               else
               {
				   valid = true;
				   double result = area(first, second, third);
				   JOptionPane.showMessageDialog(null, "The area of the triangle is " + result);
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
  Parameter: three integers, q , r, s.
  Return: an integer equal to the area of q, r, s.
  Algorithm:
1. find the value of (q +r +s)/2 and set equal to v
2. find [v (v-q)(v-r)(v-s)] and set value to n
3.find square root of n
3. Round n to nearest interger
3.  Return m.
*/

  public static double area( double q, double r, double s)
  {
	 double v = (( q + r + s)/ 2 );
	 double n = ((v - q) * (v - r) * (v - s) * v);
	 double m = Math.sqrt(n);
     return Math.round(m);

  }
  }
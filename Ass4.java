import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import javax.swing.*;
import java.util.Random;
import java.util.Arrays;
/*
Algorithm
1. create a for loop that randomly assigns int a with intergers that fills the array
2. add those intergers to total
3. set count to number of values in array
4 Pass the array through mean method and print result
5 pass the array through median and print result
6 pass the array through mode and print result
*/

public class Ass4
{
  public static void main(String[] args)
  {

   int[] list = new int [20];
   Random rand= new Random();
   double total = 0;
   int count = 0;
   for (int a = 0; a < 20; a++)
   {
	 list[a] = rand.nextInt(1000);

	}
	for (int a : list)
	{
		total += a;
    }
   count = list.length;
   System.out.println("List of randomly generated integers:" +(Arrays.toString(list)));

		double Mean = mean( list , count , total);
		System.out.println("Mean is equal to " + Mean);
		double Median = median (list , count, total);
		System.out.println("Median is equal to " + Median);
		double Mode = mode (list);
		System.out.println("Mode  is equal to " + Mode);
		double SD = standD (list, count, total);
		System.out.println("Standard Deviation is equal to " + SD);
}
/* Parameter: find the mean

Algorithm:
1. take total sum of integers in array and divide by count of array
*/

	public static double mean(int [] table, int count, double total)
	{
	 double avg = total / count;
     return avg;
    }

/* Parameter: find median
Algorithm
1 sort the array
	a compare the value of 0 with n
	b if n is smaller replace integers and repeat until the second to last value
2 if the array length is even take the sum of length / 2 and length -1 / 2 and /2
3 if the array length is odd take length-1 /2
*/

	public static double median (int []table, int count, double total)
	{
		int locmin = 0;
		for (int n = 1; n < count; n++)
		{
			if(table [locmin] > table [n])
			{
		    locmin = n;
		    int temp = table[0];
	        table[0] = table[locmin];
	        table[locmin] = temp;
		    }
	    }
	    double median = 0;
	    if(table.length % 2 == 0)
	    {
			median= (((table.length -1) / 2) + (table.length /2)) /2;
		}
		else
		{
			median= (table.length -1) /2;
		}
        return median;
	}
/*
Parameter: find mode
Algorithm:
1 pass Possmode through list and set current count to 0
2 pass element through list if possible mode equals element increase count
3 compare current count with mode count
4 if the mode count equals current count
5 mode is the possible mode
*/
   public static double mode(int[] list)
	{
		int mCount = 0;
		int m = 0;
		int cCount = 0;
		int cElement;

		for (int PossMode : list)
		{
			cCount = 0;


			for (int element : list)
			{
				if (PossMode == element)
				{
					cCount++;
				}
			}
			if (cCount > mCount)
			{
				mCount = cCount;
				m = PossMode;
				}
		}
        return m;
	}
/*
parameter: find standard deviation
Algorithm:
1 find the mean and set int i to zero
2 square (values i to count - mean)
3 divide this value by the count
4 find the square root of this value
*/

 public static double standD( int [] list, int count, double total)
 {
	 double avg = total / count;
	 int sum = 0;
 	for ( double i= 0; i <20; i++)
 	{
		double p= Math.pow(i - avg, 2);
		double w= Math.sqrt(p / count);
        double v= Math.sqrt(w);
        sum += v;
    }
        return sum;

}
}
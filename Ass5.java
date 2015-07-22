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

public class Ass5
{
  public static void main(String[] args)
  {

   ArrayList<Integer> list = new ArrayList<Integer>();
   Random rand= new Random();
   for (int a = 0; a < 20; a++)
   {
	 int next= rand.nextInt(100);
	 list.add(next);
	}

   int count = list.size();

		double Mean = mean( list , count);

		double Median = median (list, count);
		System.out.println("Mean is equal to " + Mean);
		System.out.println("Median is equal to " + Median);
		double Mode = mode (list);
		System.out.println("Mode  is equal to " + Mode);
		double SD = standD (list, count);
		System.out.println("Standard Deviation is equal to " + SD);
}
/* Parameter: find the mean

Algorithm:
1. take total sum of integers in array and divide by count of array
*/

	public static double mean(ArrayList <Integer> table, int count)
	{
	double total =0;
	 for (int a = 0; a < 20; a++)
   {

	 total +=  table.get(a);
	}

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

	public static double median (ArrayList <Integer> table, int count)
	{

	  Collections.sort(table);

    for(int a =0; a < table.size(); a++)
   {
	 System.out.println(table.get(a));
   }
	    double median = 0;
	    if(count % 2 == 0)
	    {
			median= table.get(((count - 1) / 2) + (count / 2) /2);
		}
		else
		{
			median= table.get((count - 1) /2);
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
   public static double mode(ArrayList <Integer> list)
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

 public static double standD( ArrayList <Integer> list, int count)
 {
	 double avg =  mean (list, count);
	 double p = 0;
 	for ( double i= 0; i <20; i++)
 	{
		p += Math.pow(i - avg, 2);
    }
    	double w= Math.sqrt(p / count);
		double v= Math.sqrt(w);
        return v;

}
}
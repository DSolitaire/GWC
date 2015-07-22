import java.io.*;
import java.util.*;


public class Ass6
{
	public static void main(String[] args)
	{
	    try(
	    	  //Open files
	          FileReader reader = new FileReader("Numbers.txt");
	          Scanner in = new Scanner(reader);
	          FileWriter writer = new FileWriter("Numbers.out");
	          PrintWriter out = new PrintWriter(writer)
		   )
	    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        double total = 0;
        int count = 0;
        while(in.hasNextLine())
        {
			String next = in.nextLine();
			StringTokenizer st = new StringTokenizer(next);
			while(st.hasMoreTokens())
			{
				String s = st.nextToken();
				try
				{
					int n = Integer.parseInt(s);
					list.add(n);
					total += n;
					count++;
				}
				catch(NumberFormatException e)
				{ out.println("Error in data file: " + s);}
			}
		}
		if(count == 0)
		   out.println("No Valid Data");
		else
		{
			double average = total/count;
			out.printf("\n\n%d items were read\ntheir average is %7.2f\n", count, average);

			Collections.sort(list);
		    double median = 0;
				    if(count % 2 == 0)
				    {
						median= list.get(((count - 1) / 2) + (count / 2) /2);
					}
					else
					{
						median= list.get((count - 1) /2);
		            }
			out.printf("The median of the items is %h\n", median);

				double p = 0;
			 	for ( double i= 0; i <20; i++)
			 	{
					p += Math.pow(i - average, 2);
			    }
			    	double w= Math.sqrt(p / count);
		        double v= Math.sqrt(w);
			out.printf("The standard deviation of the items is %.3f\n", v);
	    }
	    }
	    catch(IOException e)
	    {
	    	System.out.println("Error opening the files." + e);
	    	System.exit(1);
	    }


	}



}

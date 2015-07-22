import java.util.*;

 public class MyPoint
 {
	 private int xcoordinate;
	 private int ycoordinate;

	 public MyPoint()
	 {
		 this.xcoordinate = 0;
		 this.ycoordinate = 0;
     }

     public MyPoint(int xcoordinate, int ycoordinate)
     {
		 this.xcoordinate = xcoordinate;
		 this.ycoordinate = ycoordinate;
     }

     public void setXcoordinate(int xcoordinate)
     {this.xcoordinate = xcoordinate;}

     public void setYcoordinate(int ycoordinate)
     {this.ycoordinate = ycoordinate;}

     public int getXcoordinate()
     {return xcoordinate;}

     public int getYcoordinate()
     {return ycoordinate;}

 public MyPoint getDistance(MyPoint this)
	 {
		 MyPoint temp = new MyPoint();
		 temp.xcoordinate =Math.abs(getXcoordinate() - this.xcoordinate);
		 temp.ycoordinate =Math.abs(getYcoordinate() - this.ycoordinate);
		 return temp;
     }

      public boolean equals(Object other)
	    {
	      if(other == null)
	        return false;
	      if(other == this)
	        return true;
	      if( !(other instanceof MyPoint) )
	        return false;
	        MyPoint otherMyPoint = (MyPoint)other;
	       return this.xcoordinate == otherMyPoint.xcoordinate && this.ycoordinate == otherMyPoint.ycoordinate;
		}

     public String toString()
     {
		String result;
		result = this.xcoordinate + "," + this.ycoordinate;
		return result;

      }
}

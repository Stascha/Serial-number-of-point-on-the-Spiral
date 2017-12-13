
public class Serial_number_of_point
{
	public static void main(String args[]) 
	{
	   int x = 2;
           int y = 4;

	   System.out.println("Serial number of point on the Spiral which has coordinates ("+ x +"," + y + ") is : " + solution( x , y) );
	}
	
	public static int solution(int X, int Y) 
	{
	    int serialNumberOfPointOnTheSpiral = 0;
	    int[] next = new int[2];
	   
	    while (next[0] != X || next[1] != Y){
	        next = getNextPoint(next[0], next[1]);
	       	        
	        if ( Math.abs(next[0]) > 20000 || Math.abs(next[1]) > 20000 ) 
	        	return -1;
	        
	        serialNumberOfPointOnTheSpiral++;
	    }
	    
	    return serialNumberOfPointOnTheSpiral;
	}
	
	private static int[] getNextPoint(int X, int Y) 
	{
	     int[] nextPoint = new int[2];
	     nextPoint[0] = X;
             nextPoint[1] = Y;
            
	     // Top left quadrant
             if (X <= 0 && Y >= 0){
	        if (Math.abs(X) < Math.abs(Y))
	             nextPoint[0] += 1;
	        else 
	             nextPoint[1] += 1;
	     } //Top right quadrant
	     else if (X >= 0 && Y >= 0){
	        if (Math.abs(X) < Math.abs(Y))
	             nextPoint[0] += 1;
	        else
	             nextPoint[1] -= 1;
	     } //Lower right quadrant
	     else if (X >= 0 && Y <= 0){
	        if (Math.abs(X) <= Math.abs(Y))
	             nextPoint[0] -= 1;
	        else 
	             nextPoint[1] -= 1;
	     } //Lower left quadrant
	     else if (X <= 0 && Y <= 0){
	        if (Math.abs(X) < Math.abs(Y))
	             nextPoint[0] -= 1;
	        else 
	             nextPoint[1] += 1;
	     }
	         
       	     return nextPoint;
        }
	   
}


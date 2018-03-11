package id.co.rizalahmad.parkir.controller;

public class Utility 
{
	public static boolean isPosInt(String str) 
	{
	    if(str == null) 
	    {
	        return false;
	    }
	    
	    int length = str.length();
	    
	    if(length == 0 || length > 9) 
	    {
	        return false;
	    }
	    
	    if(str.charAt(0) < '1')
	    {
	    	return false;
	    }
	    
	    for(int i=0; i<length; i++) 
	    {
	        char c = str.charAt(i);
	        
	        if(c < '0' || c > '9') 
	        {
	        	return false;
	        }
	    }
	    
	    return true;
	}
}
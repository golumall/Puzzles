
//Source
//https://www.geeksforgeeks.org/trapping-rain-water/

//https://www.geeksforgeeks.org/mobikwik-interview-experience-on-campus/

import java.io.*;
import java.util.*;

class Puzle {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	  a[i]=sc.nextInt();
	 
	System.out.println(water(a,n));
	}
	static int water(int a[],int n)
	{
	    int water=0;
	    int left[]=new int[n];
	    int right[]=new int[n];
	    left[0]=a[0];
	    for(int i=1;i<n;i++)
	    {
	        left[i]=Math.max(left[i-1],a[i]);
	    }
	    right[n-1]=a[n-1];
	    for(int i=n-2;i>=0;i--)
	    {
	        right[i]=Math.max(right[i+1],a[i]);
	    }
	    for(int i=0;i<n;i++)
	    {
	        water+=Math.min(left[i],right[i])-a[i];
	    }
	    return water;
	}
}


/*

In Tower of hanoi puzzle 3 rod and n disks are given and 
we need to transfer all disk from first rod to 3rd rod or 2nd rod
constraints we can move one disk at a time and smaller disk should be upper than larger disk.

for n disk number of minimum move required=(2^n-1)
*/
import java.io.*;
import java.util.Scanner;
class Toh{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		tohn(n,'A','C','B');
	}
	static void tohn(int n,char frod,char trod,char arod)
	{
	    if(n==1)
	    {
	        System.out.println(frod+"-->"+trod);
	        return;
	    }
	    tohn(n-1,frod,arod,trod);
	        System.out.println(frod+"-->"+trod);
	   tohn(n-1,arod,trod,frod);
	}
}


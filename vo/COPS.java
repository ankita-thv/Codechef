import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int m=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int arr[]=new int[m];
		    for(int i=0;i<m;i++){
		        arr[i]=sc.nextInt();
		    }
		    int l=x*y;
		    int count=0;
		    for(int i=1;i<=100;i++){
		        boolean house= true;
		        for(int j=0;j<m;j++){
		            int min=arr[j]-l;
		            int max=arr[j]+l;
		            if(i>=min && i<=max)
		            house=false;
		        }
		        if(house==true)
		        count+=1;
		    }
		    System.out.println(count);
		}
	}
}

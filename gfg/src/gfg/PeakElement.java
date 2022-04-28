package gfg;
import java.util.*;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println(getPeakElement(a,n));
	}
	public static int getPeakElement(int[] arr,int n)
	 {
	    //add code here.
	     int i=0;
	     int j=n-1;
	     int mid=0;
	     while(i<=j)
	     {
	         mid=(i+j)/2;
	         if ((mid==0||arr[mid]>=arr[mid-1])&&(mid==n-1||arr[mid]>=arr[mid+1]))
	         {
	             return mid;
	         }
	         else if (mid>0 && arr[mid]<arr[mid-1])
	         {
	             j=mid-1;
	         }
	         else
	         {
	             i=mid+1;
	         }
	     }
	     return mid;
	 }

}

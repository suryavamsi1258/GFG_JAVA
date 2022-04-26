package gfg;
import java.util.*;
public class MajorityElement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     int n =sc.nextInt();
	     int arr[] = new int[n];
	     for(int i = 0; i < n; i++)
	             arr[i] = sc.nextInt();        
	     System.out.println(majorityElement(arr, n)); 
	}
	static int majorityElement(int a[], int size)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		if(size==1)
		{
			return a[0];
		}
		for(int i=0;i<size;i++)
		{
			if(map.containsKey(a[i]))
			{
				int freq=map.get(a[i])+1;
				if(freq>size/2)
				{
					return a[i];
				}
				else
				{
					map.put(a[i],freq);
				}
			}
			else
			{
				map.put(a[i],1);
			}
		}
		return -1;
	}
}

package gfg;
import java.util.*;
public class ShopinCandyStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
        int K = sc.nextInt();
        int candies[]= new int[N];
        for(int i = 0; i < N; i++)
            candies[i] = sc.nextInt();
		ArrayList<Integer> cost = candyStore(candies,N,K);
        System.out.println(cost.get(0)+" "+cost.get(1));
	}
	static ArrayList<Integer> candyStore(int candies[],int N,int K){
	     // code here
	     Arrays.sort(candies);
	     int mincost=0;
	     int maxcost=0;
	     int j=0;
	     ArrayList<Integer> res=new ArrayList<>();
	     for (int i=0;i<N;i=i+K+1)
	     {
	         mincost+=candies[j];
	         maxcost+=candies[N-j-1];
	         j+=1;
	     }
	     res.add(mincost);
	     res.add(maxcost);
	     return res;
	 }

}

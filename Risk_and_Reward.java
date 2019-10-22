import java.util.*;
public class Risk_and_Reward {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc= new Scanner(System.in);
		int trader[]= new int[10000]; 
		int risk[]= new int[10000];
		int bonus[]= new int[10000];
		int n,small,Output=0 ,pos;
		n= sc.nextInt();
		for(int i=0; i< n; i++)
		{
			trader[i]= sc.nextInt();
			risk[i]= sc.nextInt();
			bonus[i]= sc.nextInt();
		}
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				int temp= risk[j];
				risk[j]= risk[j+1];
				risk[j+1]= temp;
				
				int temp1= bonus[j];
				bonus[j]= bonus[j+1];
				bonus[j+1]= temp1;
			}
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(trader[i]>=risk[j])
				{
					small= risk[j];
					pos=j;
					Output= Output + bonus[pos];
				}
			}
		}
		System.out.println("Output:");
		System.out.print(Output);
	}

}

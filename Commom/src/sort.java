
public class sort {
	public static void main(String []args)
	{
		int N=4,K=0,b=3;
		 int a[][]=new int[N][N],cnt=0,i=0,j=0;
		while(cnt<16)
			{
			if((i==K))
			{
				for(j=0;j<b;j++)
				{
				a[i][j]=cnt;
				cnt+=1;
				
				}
				
			}
			if((j==b)&&(i==K))
			{
				for(i=0;i<b;i++)
				{
				a[i][j]=cnt;
				cnt+=1;
				
				}
			}
			if((i==b)&&(j==b))
			{
				for(j=b;j>K;j--)
				{
				a[i][j]=cnt;
				cnt+=1;
				
				}
			}
			if((j==K)&&(i==b))
			{
				
				K=K+1;
				for(i=b;i>=K;i--)
				{
				a[i][j]=cnt;
				cnt+=1;
				
				}	
				b=b-1;
				i=i+1;
			}
			
				
			}
		
		for(int c=0;c<4;c++)
		{
			for(int z=0;z<4;z++)
			{
				System.out.println(a[c][z]);
			}
			System.out.println("");
		}
				  
				  
				
			  
			 
		 
	
	//System.out.println(cnt);
	/*while(low<=high)//相撞指针
	{
		
		 index=(low+high)/2;
		if(b==a[index])
		
		{
			System.out.println(""+index);
			break;
		}
		else if(b>a[index])
		{
			
			low=index+1;
			System.out.println(low);
			
		}
		else
		{
			high=index-1;
			System.out.println(high);
		}
	}
	index=-1;
	System.out.println("找不到");*/
	}

}


public class DC17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{71,2,3,4},{4,5,6,7},{7,8,9,10},{11,12,13,14}};
		int n =a.length;
		int k=n-1,sum =0,sum1=0,i,j;
				for(i=0;i<=n-1;i++)
					for(j=0;j<=n-1;j++)
					if(j<k-i)
					sum =sum +a[i][j];

				for(i=0;i<=n-1;i++)
					for(j=0;j<=n-1;j++)
					if(j>k-i)
					sum1 =sum1 +a[i][j];
				if(sum>sum1)
				{
					for(i=0;i<n-1;i++)
						for(j=0;j<n-1;j++)
							if(j<k-i)
								System.out.print(" "+a[i][j]);
				}
				else							
						for(i=0;i<=n-1;i++)
							for(j=0;j<=n-1;j++)
								if(j>k-i)
									System.out.print(" "+a[i][j]);
	}
}

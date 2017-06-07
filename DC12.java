
public class DC12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		float sum=0;
				for(int i=0;i<=n;i++)
					if(i%3==0||i%5==0)
						sum =sum+i;
				System.out.println("sum of 3 and multiples till "+n+" is "+sum);
	}

}

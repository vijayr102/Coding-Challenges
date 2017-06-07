import java.util.Scanner;

public class DC13 {

	public static void main(String[] args) {
		/*read nth,num
		big=0
		declare and initialize array
		arr =sort(array)
		for(i=n-1;i<array length;i++)
		if(Digitcheck(num,array[i]))
		big=a[i]
		break;*/
		int nth,num,big=0;
		Scanner rd =new Scanner(System.in);
		nth =rd.nextInt();
		num =rd.nextInt();
		int ar[]={10,5,20,15,30,25};
		ar=sortDes(ar);
		System.out.println(ar);
		for(int i=nth-1;i<ar.length;i++)		
			if(digitCheck(ar[i],num))
			{
				big =ar[i];
				break;
			}		
		System.out.println(big);
		rd.close();
		
	}
	public static boolean digitCheck(int n,int n1)
	{
		while(n!=0)
		{
			int temp =n%10;
			if(temp==n1)
				return false;
			n=n/10;
		}
		return true;
	}
	public static int[] sortDes(int []n)
	{
		for(int i=0;i<n.length-1;i++)
			for(int j=i+1;j<n.length;j++)
				if(n[i]<n[j])
				{
					int t= n[i];
					n[i]=n[j];
					n[j]=t;
				}
		return n;
	}

}

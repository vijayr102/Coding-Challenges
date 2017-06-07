
public class DC18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="goodlooking";
		char b[]=a.toCharArray();
		for (int i=0;i<a.length()-1;i++)
		{
			for(int j=i+1;j<a.length();j++)
			if(b[i]==b[j])
				b[j]='*';
		}
		String c=new String(b);
		c=c.replace("*", "");
		System.out.println(c);
	}

}

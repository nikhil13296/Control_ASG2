
public class Asgnment2_3 {

	public static void main(String[] args) {
	
		int i,j;
		int k=97, l=98,m=99;
		for (i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if((i==1&j==3) ||( i==2&& j==2) ||(i==2&&j==4) || (i==2 &&j==4) || (i==3&& j==1) || (i==3&& j==5)||(i==4&&j==2)||(i==4&&j==4)|| (i==5&&j==3))
					System.out.print((char)k);
				else if ((i==2&& j==3)|| (i==3&&j==2) ||(i==3 && j==2)||(i==3&&j==4)|| (i==4&&j==3))
					System.out.print((char)l);
				else if (i==3&&j==3)
					System.out.print((char)m);
				else
					System.out.print(" ");
			}
		System.out.println();
		}

	}

}

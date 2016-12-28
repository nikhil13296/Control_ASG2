
public class asg22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Rowcount= 1;
System.out.println("Pyramid");
for(int i =0;i<23;i++){
	System.out.print(" ");
}
System.out.println("0");
for( int i = 10; i > 0; i--)
{
 
	for( int j = 0; j <= i*2; j++)
	{
	System.out.print(" ");
	}
	
	for(int j=  0; j <= Rowcount; j++)
	{
	System.out.print(j+" ");
	}
	
	for(int j = Rowcount-1;j>=0;j--)
	{
	System.out.print(j+" ");
	}
	
	System.out.println();
	Rowcount++;
}

}
	}


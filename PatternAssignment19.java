
public class PatternAssignment19 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=2*(5-i);j++)
		{
			System.out.print(" ");
		}
		for(int k=i;k>=1;k--)
		{
			System.out.print(k+" ");
		}
		for(int l=2;l<=i;l++)
		{
			System.out.print(l+ " ");
		}
		System.out.println();
	}
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=9;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}

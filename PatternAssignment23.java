
public class PatternAssignment23 {
	public static void main(String[] args) {
		
		for(int i=5/2;i<5;i+=2) {
			for(int j=1;j<5-i;j+=2) {
				System.out.print(" ");
			}
			for(int j=1;j<i+1;j++) {
				System.out.print("*");
			}
			for(int j=1;j<5-i+1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i+1;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5;i>0;i--) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}

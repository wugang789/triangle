package shusu;

public class Triangle {

	public static void main(String[] args) {
//		    *
//		   * *
//		 * * * *
//	   * * * * * *
		Triangle.test(9);
		Triangle.test1(9);
	}
	private static void test1(int k) {
		int b=1;
		for(int i=k;i>=1;i--){
		//	System.out.print(" ");
			boolean flag=true;
			for(int j=1;j<=(2*i-1);j++){
				if(flag){
					ba1(b);
					flag=false;
				}
				System.out.print("*");
			}
			b++;
			System.out.println();
		}
	}
	private static void ba1(int b) {
		for(int j=1;j<b;j++){
			System.out.print(" ");
		}
		
	}
	private static void test(int k){
		int b=k;
		for(int i=1;i<=k;i++){
		//	System.out.print(" ");
			boolean flag=true;
			for(int j=1;j<=(2*i-1);j++){
				if(flag){
					ba(b);
					flag=false;
				}
				System.out.print("*");
			}
			b--;
			System.out.println();
		}
	}
	private static void ba(int b) {
		for(int i=b-1;i>=1;i--){
			System.out.print(" ");
		}
	}
}

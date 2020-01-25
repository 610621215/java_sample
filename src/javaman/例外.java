package javaman;

public class 例外 {
	public static void main(String[]args) {
		int x=1;
		int y=0;
		try {
			double sum=x/y;
		}catch(RuntimeException ex) {
			ex.printStackTrace();
			System.out.println("\"RuntimeException\" ex");
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("Exception ex");
		}finally {//無論如何皆執行了
			
			System.out.println("工人強出頭");
			
		}
		
		
	}
}

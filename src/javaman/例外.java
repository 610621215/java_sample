package javaman;

public class �ҥ~ {
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
		}finally {//�L�צp��Ұ���F
			
			System.out.println("�u�H�j�X�Y");
			
		}
		
		
	}
}

package javaman;

import java.io.IOException;

public class �ҥ~�ˬd {
	class card_ability extends Exception{
//		public void isslayed()throws IOException{//���Ӥp
//			
//			
//		} 
		public card_ability() {
			
		}
		public card_ability(String txt) {
			super(txt);
		}
		public void isslayed()throws Exception{//���Ӥp
		
		
		} 
	}
	class card extends card_ability{
		int cost=7;
		int health=3;
		int atk=3;
		public card(int cost,int health,int atk) {
			this.atk=atk;
			this.health=health;
			this.cost=cost;
		}
//		public void isslayed()throws Exception{//�����O������j
//			
//			
//		} 
//		
		public void isslayed() throws card_ability{//Exception �]�s�]��
			if(health<0) {
				throw new card_ability("�ͩR�p��0�F");
			}
			
		}
	}
	public static void main(String[]args) {	
		System.out.println("�P������");
		card onecard=new �ҥ~�ˬd().new card(7,-1,3);
		try {
			onecard.isslayed();
		}catch(ArithmeticException ex) {
			ex.printStackTrace();
		}catch(card_ability ca ){
			ca.printStackTrace();
			
		}finally {
			System.out.println("�U���C��");
			
		}
		try {
			
		}finally {
			System.out.println("finally ��W");
		}
	}
}

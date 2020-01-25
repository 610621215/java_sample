package javaman;

import java.io.IOException;

public class 例外檢查 {
	class card_ability extends Exception{
//		public void isslayed()throws IOException{//父太小
//			
//			
//		} 
		public card_ability() {
			
		}
		public card_ability(String txt) {
			super(txt);
		}
		public void isslayed()throws Exception{//父太小
		
		
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
//		public void isslayed()throws Exception{//必須是父比較大
//			
//			
//		} 
//		
		public void isslayed() throws card_ability{//Exception 包山包海
			if(health<0) {
				throw new card_ability("生命小於0了");
			}
			
		}
	}
	public static void main(String[]args) {	
		System.out.println("烈火風暴");
		card onecard=new 例外檢查().new card(7,-1,3);
		try {
			onecard.isslayed();
		}catch(ArithmeticException ex) {
			ex.printStackTrace();
		}catch(card_ability ca ){
			ca.printStackTrace();
			
		}finally {
			System.out.println("垃圾遊戲");
			
		}
		try {
			
		}finally {
			System.out.println("finally 單獨");
		}
	}
}

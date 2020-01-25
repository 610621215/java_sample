package 基礎觀念;
//內部類別的封裝範例
//內部類別的抽象類別實踐範例
//內部類別的抽象介面實踐範例
class Encap_test{
	class inner_itemA{//封裝變數
		private int price=0;
		public void setprice(int price) {
			this.price=price;
			
		}
		public int getprice() {
			
			return price;
		}
	}
	private class inner_itemB{
		public int price=0;
		public void setprice(int price) {
			this.price=price;
			
		}
		public int getprice() {
			
			return price;
		}
	}
	class inner_itemC extends abc_itemA{

		@Override
		public void name() {
			// TODO Auto-generated method stub
			System.out.println("inner_itemC");
		}
		
		
		
	}
	class inner_itemD implements first_interface{

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("inner_itemD");
		}
		
		
	}
	class inner_itemE implements second_interface{
		//同時兼具父與子的抽象方法
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("inner_itemE");
		}

		@Override
		public void secobd_interface_show() {
			// TODO Auto-generated method stub
			System.out.println("inner_itemE");
		}
		
		
	}
	public static void main(String[]args) {
		 Encap_test et=new Encap_test();
		 
		 inner_itemA itemA= et.new inner_itemA();
		 itemA.setprice(500);
		 
		 System.out.println(itemA.getprice());
		 inner_itemB item_B= et.new inner_itemB();
		 item_B.setprice(470);
		 
		 System.out.println(item_B.getprice());
		 
		 inner_itemC item_C=et.new inner_itemC();
		 item_C.name();
		 
		 inner_itemD itemD= et.new inner_itemD();
		 itemD.show();
		 inner_itemE itemE= et.new inner_itemE();
		 itemE.show();
		 itemE.secobd_interface_show();
	}
}
abstract class abc_itemA{
	
	public abstract void name();
}
interface first_interface{
	
	void show();
	
	
}
interface second_interface extends first_interface{
	
	void secobd_interface_show();
	
}


package 基礎觀念;
//與Encap_test合併
public class 抽象類別{
	class create_ab_itemA extends ab_itemA{

		@Override
		public void name() {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	public static void main(String[]args) {
		抽象類別 ver555=new 抽象類別 ();
		create_ab_itemA cai= ver555.new create_ab_itemA();
		
	}
	
	
}
abstract class ab_itemA{
	
	public abstract void name();
}

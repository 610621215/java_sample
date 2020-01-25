package 基礎觀念;

public class ClanInsVar {
	public static void main(String[]args) {
		share_variable.count=3;
		System.out.println(share_variable.count);
		share_variable sv1=new share_variable();
		share_variable sv2=new share_variable();
		sv1.count++;
		sv2.count++;
		System.out.println(sv1.count+",vs,"+sv2.count);//共用變數
		sv1.show();
		System.setProperty("1", "系統屬性");
		System.getProperty("1");	
		System.out.println(System.getProperty("1"));
		String cp=System.getProperty("java.classpath");
		System.out.println(cp);
	}
}

class share_variable{
	static int count=0;//在new之前就已經存在,line4就是最好的證明，不然照理來說應該先new後才可以使用。
	public void show() {
		System.out.println(this.toString());//利用this自己呼叫
//		this.show(0);//可以用於自己呼叫自己
	}
//	public void show(int i) {
//		try {
//			if(i<5) {
//				this.show(i++);
//			}
//		}catch(Exception ex) {
//			
//			ex.printStackTrace();
//			System.out.println(i);
//		}
//	}
	public String toString() {
		
		return "share_variable";
	}
	
	
}
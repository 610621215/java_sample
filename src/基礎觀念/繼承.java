package 基礎觀念;

public class 繼承 {
	public static void main(String[]args) {
			書籤的主題 title=new 書籤的主題();
			title.name="aa";
			title.price=50;
			title.authors="zz";
			title.isable=false;	
			String txt=title.isable?"使用":"無法使用";
			System.out.println(txt);
			title.go2();
			
			//父類別 a1=以子類別實作(這表示將子類別強制轉型)
			
			書 a1=new 書籤的主題();//子類別有的副類別不一定有，所以父類別涵蓋子類別的範圍，因此是子類別的強制轉型
			a1.go();
			System.out.println(a1.toString());
			a1.show();
			System.out.println(a1 instanceof 書籤的主題);
//			a1.go2();如第十三行的實作方法，並不存在go2

	}
}
class 書{
	String name;
	int price;
	String authors;
	final static int a=0;//成立
	public static void go() {
		
		System.out.println("書");
	
	}
	public String toString() {
		return "書";
		
	}
	public void show() {
		
		System.out.println(name);

		System.out.println(price);

		System.out.println(authors);
	}
}
class 書籤的主題 extends 書{
	boolean isable;
	public String toString() {
		
		return "書籤的主題";
	}
	public void show() {
		System.out.println("書籤的主題");
		
	}
	public void go2() {
		
//		super.go();
		super.show();
		System.out.println(isable);
	
	}
//
//	public void go() {}無法同時存在
	
}
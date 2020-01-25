package 基礎觀念;
import using_in_import.import_test;
//呼叫其他的套件
public class importingtest {
	public static void main(String[]args){
//		new 玩具.炸彈();
		import_test.show();
		new importingtest().chart("a1","a2","a3","a4");//參數列表
		System.out.println();
		new importingtest().chart("a1","a2","a3");
	}
	public void chart(String...strings) {
		for(String ob:strings) {
			System.out.println(ob+"\t");
			
		}
		
	}
//	public void error_chart(String...strings,String txt) {};
}

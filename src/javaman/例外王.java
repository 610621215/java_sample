package javaman;

import java.io.IOException;

public class 例外王 {
	class inner_exception extends Exception{
		public inner_exception(String txt) {
			// TODO Auto-generated constructor stub
			super(txt);
		}
	}
	class inner_test_exception{
		int y;
		public void show(int y) {
			try {
				int x=1;
				this.y=y;
				if(y==0) {//條件觸發型
					throw new 例外王().new inner_exception("show的例外");
				}
			}catch(inner_exception ie) {//自己接取這個例外，這是必定得加入的，否則無法成功throw
				
				ie.printStackTrace();//自己命名的例外
				
			}
			
		}
		public void showdown(int y)throws inner_exception{
			
			if(y==0)
				throw new 例外王().new inner_exception("showdown的例外");
		}
		
	}
	public static void main(String[]args) {
		inner_test_exception ite =new 例外王().new inner_test_exception();
		ite.show(0);
		try {
			ite.showdown(0);
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
}

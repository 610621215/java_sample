package javaman;

import java.io.IOException;

public class �ҥ~�� {
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
				if(y==0) {//����Ĳ�o��
					throw new �ҥ~��().new inner_exception("show���ҥ~");
				}
			}catch(inner_exception ie) {//�ۤv�����o�Өҥ~�A�o�O���w�o�[�J���A�_�h�L�k���\throw
				
				ie.printStackTrace();//�ۤv�R�W���ҥ~
				
			}
			
		}
		public void showdown(int y)throws inner_exception{
			
			if(y==0)
				throw new �ҥ~��().new inner_exception("showdown���ҥ~");
		}
		
	}
	public static void main(String[]args) {
		inner_test_exception ite =new �ҥ~��().new inner_test_exception();
		ite.show(0);
		try {
			ite.showdown(0);
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
}

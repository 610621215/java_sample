package ��¦�[��;
import using_in_import.import_test;
//�I�s��L���M��
public class importingtest {
	public static void main(String[]args){
//		new ����.���u();
		import_test.show();
		new importingtest().chart("a1","a2","a3","a4");//�ѼƦC��
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

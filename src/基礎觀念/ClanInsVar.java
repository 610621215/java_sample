package ��¦�[��;

public class ClanInsVar {
	public static void main(String[]args) {
		share_variable.count=3;
		System.out.println(share_variable.count);
		share_variable sv1=new share_variable();
		share_variable sv2=new share_variable();
		sv1.count++;
		sv2.count++;
		System.out.println(sv1.count+",vs,"+sv2.count);//�@���ܼ�
		sv1.show();
		System.setProperty("1", "�t���ݩ�");
		System.getProperty("1");	
		System.out.println(System.getProperty("1"));
		String cp=System.getProperty("java.classpath");
		System.out.println(cp);
	}
}

class share_variable{
	static int count=0;//�bnew���e�N�w�g�s�b,line4�N�O�̦n���ҩ��A���M�Ӳz�ӻ����ӥ�new��~�i�H�ϥΡC
	public void show() {
		System.out.println(this.toString());//�Q��this�ۤv�I�s
//		this.show(0);//�i�H�Ω�ۤv�I�s�ۤv
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
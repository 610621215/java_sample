package javaman;

import java.util.Random;
//�H��ʪ�KDA�Ӻt���p��Զi�U����
public class �U���^�� {
	static int k=0;
	static int d=0;
	static int a=0;
	class �ڳ����W����{
		int k=0;
		int d=0;
		int a=0;
		public void kda(int d,int k,int a) {
			this.k=k;
			this.d=d;
			this.a=a;
		}
		public void finalize() {
			
			System.out.println("�Զi�U����");
			
		}
	}
	public static void main(String[]args) {
		
		�U���^�� ggc=new �U���^��();
		�ڳ����W���� gotop=ggc.new �ڳ����W����();
		for(int i=0;i<50;i++) {
			double winrate=new Random().nextFloat();
//			System.out.println(winrate);
			if(winrate>0.3) {//�ڮ���W����70%�鱼���O��
				System.out.println("�A���S���F?");
				gotop.kda(++d, k, a);
				
			}else if(winrate<0.2&&winrate>0.1) {
				System.out.println("�ư_��,�ӯ���");
				gotop.kda(d, ++k, a);
				
			}else {
				System.out.println("�U��jg���n�m�Y,�A�S����carry");
				gotop.kda(d, k, ++a);
			}
			
			
		}
//		System.out.println("global"+d);
		System.out.println(gotop.k+"/"+gotop.d+"/"+gotop.a);
		if((gotop.k+(gotop.a/2))/gotop.d<0.1) {
			System.out.println("��~~~~~~~~~");
			gotop=null;
			System.gc();//�۰ʩI�s
		}
		
	}
}

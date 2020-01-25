package javaman;

import java.util.Random;
//以國動的KDA來演飾如何拉進垃圾車
public class 垃圾回收 {
	static int k=0;
	static int d=0;
	static int a=0;
	class 我都走上路欸{
		int k=0;
		int d=0;
		int a=0;
		public void kda(int d,int k,int a) {
			this.k=k;
			this.d=d;
			this.a=a;
		}
		public void finalize() {
			
			System.out.println("拉進垃圾車");
			
		}
	}
	public static void main(String[]args) {
		
		垃圾回收 ggc=new 垃圾回收();
		我都走上路欸 gotop=ggc.new 我都走上路欸();
		for(int i=0;i<50;i++) {
			double winrate=new Random().nextFloat();
//			System.out.println(winrate);
			if(winrate>0.3) {//我拿到上路有70%輸掉的保證
				System.out.println("你怎麼又死了?");
				gotop.kda(++d, k, a);
				
			}else if(winrate<0.2&&winrate>0.1) {
				System.out.println("滑起來,太神拉");
				gotop.kda(d, ++k, a);
				
			}else {
				System.out.println("垃圾jg不要搶頭,你又不能carry");
				gotop.kda(d, k, ++a);
			}
			
			
		}
//		System.out.println("global"+d);
		System.out.println(gotop.k+"/"+gotop.d+"/"+gotop.a);
		if((gotop.k+(gotop.a/2))/gotop.d<0.1) {
			System.out.println("齁~~~~~~~~~");
			gotop=null;
			System.gc();//自動呼叫
		}
		
	}
}

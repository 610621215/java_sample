package javaman;

public class 續2 {
	class inner_class extends Thread{
		
		public inner_class(String txt) {
			super(txt);
		}
		public void run() {
			try {
				System.out.println("名稱"+Thread.currentThread().getName());
				System.out.println("優先權"+Thread.currentThread().getPriority());
				for(int i=0;i<30;i++) {
					if(Thread.currentThread().getName()=="人物1") {
						if(i%2==0&&i>1) {
							System.out.println(Thread.currentThread().getName()+"暫停了");
							Thread.sleep(1000);
							System.out.println("過了一秒");
						}		
					}
					System.out.println("輪到"+Thread.currentThread().getName());
				}
			}catch(Exception ex) {
				ex.printStackTrace();
				
			}
		}
	}
	public static void main(String[]args) {
		續2 a2=new 續2();
		inner_class p1=a2.new inner_class("人物1");
		inner_class p2=a2.new inner_class("人物2");
		p1.start();
		p2.start();
	}
}

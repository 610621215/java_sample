package javaman;

public class ��2 {
	class inner_class extends Thread{
		
		public inner_class(String txt) {
			super(txt);
		}
		public void run() {
			try {
				System.out.println("�W��"+Thread.currentThread().getName());
				System.out.println("�u���v"+Thread.currentThread().getPriority());
				for(int i=0;i<30;i++) {
					if(Thread.currentThread().getName()=="�H��1") {
						if(i%2==0&&i>1) {
							System.out.println(Thread.currentThread().getName()+"�Ȱ��F");
							Thread.sleep(1000);
							System.out.println("�L�F�@��");
						}		
					}
					System.out.println("����"+Thread.currentThread().getName());
				}
			}catch(Exception ex) {
				ex.printStackTrace();
				
			}
		}
	}
	public static void main(String[]args) {
		��2 a2=new ��2();
		inner_class p1=a2.new inner_class("�H��1");
		inner_class p2=a2.new inner_class("�H��2");
		p1.start();
		p2.start();
	}
}

package javaman;
//�HRunnable���
public class ������ {
	class inner_class implements Runnable{

		String txt;
		public inner_class(String txt) {
			// TODO Auto-generated constructor stub
			this.txt=txt;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(txt);
		}
	}
	public static void main(String[]args) {
		try {
			������ trigger=new ������();
			inner_class ic=trigger.new inner_class("�u�{1");
			inner_class ic2=trigger.new inner_class("�u�{2");
			Thread[] thread=new Thread[2];
//			for(int i=0;i<thread.length;i++) {
				thread[0]=new Thread(ic);//�u�{1
				thread[1]=new Thread(ic2);//�u�{2
				thread[0].setPriority(Thread.MAX_PRIORITY);
				thread[1].setPriority(Thread.MIN_PRIORITY);
//				Thread main_line=Thread.currentThread();
//				main_line.setPriority("6");
				thread[0].start();
				thread[1].start();
				System.out.println("�u���v�G"+thread[0].getPriority()+"\t"+thread[1].getPriority());
				System.out.println("�D");
				}catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
}

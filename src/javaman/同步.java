package javaman;

public class �P�B {
	public static int resource=50;
	class inner_class extends Thread{
//		int resource=50; �L�k�@�ΦP�@��
		int custom;
		public inner_class(int custom,String txt) {
			// TODO Auto-generated constructor stub
			super(txt);
			this.custom=custom;
		}
		synchronized public int using_resource() {
			resource-=custom;
			return resource;
		} 
		public void run() {
			for(int i=0;i<3;i++)
				System.out.println("�u�{"+Thread.currentThread().getName()+"\t"+using_resource());
		}
	}
	class inner_class2 extends Thread{
		String name;
		int consumption;
		public inner_class2(String name,int consumption) {
			// TODO Auto-generated constructor stub
			super(name);
			this.name=name;
			this.consumption=consumption;
		}
		public void show() {
//			String name=Thread.currentThread().getName();//�b���s�I�s�A�O���I�s�̥ثe�Ҧb��������
			synchronized (inner_class2.class) {//�Pthis�ۦP
				System.out.println(name);
				for(int i=0;i<3;i++) {
					resource=resource-consumption;	
					System.out.println("name:"+name+"\t"+resource);
				}
			}
			
		}
		
	}
	public static void main(String[]args) {
		�P�B x=new �P�B();
		inner_class ic=x.new inner_class(5,"ic");
		inner_class ic2=x.new inner_class(5,"ic2");
		ic2.start();
		ic.start();
		ic.stop();
		ic2.stop();
		resource=50;
		System.out.println("�٭�:"+resource);
		//Synchronized�����ĩ����F�X�FToken�|�����槹��Token2����ɤW
		inner_class2 iteam2=x.new inner_class2("Token",5);
		inner_class2 iteam3=x.new inner_class2("Token2",3);
		Thread sktt1=new Thread(iteam2);
		iteam2.show();
		iteam3.show();
//		System.out.println(iteam2.name);
	}
}

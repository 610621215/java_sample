package javaman;

public class 同步 {
	public static int resource=50;
	class inner_class extends Thread{
//		int resource=50; 無法共用同一個
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
				System.out.println("線程"+Thread.currentThread().getName()+"\t"+using_resource());
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
//			String name=Thread.currentThread().getName();//在重新呼叫，是任呼叫者目前所在的執行續
			synchronized (inner_class2.class) {//與this相同
				System.out.println(name);
				for(int i=0;i<3;i++) {
					resource=resource-consumption;	
					System.out.println("name:"+name+"\t"+resource);
				}
			}
			
		}
		
	}
	public static void main(String[]args) {
		同步 x=new 同步();
		inner_class ic=x.new inner_class(5,"ic");
		inner_class ic2=x.new inner_class(5,"ic2");
		ic2.start();
		ic.start();
		ic.stop();
		ic2.stop();
		resource=50;
		System.out.println("還原:"+resource);
		//Synchronized的成效明顯表達出了Token會先執行完後Token2後續補上
		inner_class2 iteam2=x.new inner_class2("Token",5);
		inner_class2 iteam3=x.new inner_class2("Token2",3);
		Thread sktt1=new Thread(iteam2);
		iteam2.show();
		iteam3.show();
//		System.out.println(iteam2.name);
	}
}

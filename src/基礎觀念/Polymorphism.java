package ��¦�[��;

public class Polymorphism {
		class type_A{
			
			public void show() {
				
				System.out.println("����A");
			}
			
		}
		class type_B extends type_A{
			
			public void show() {
				
				System.out.println("����B");
			}
			
		}
		
		class type_C extends type_A{
			
			public void show() {
				
				System.out.println("����C");
			}
			
		}
		
		public static void main(String[] args) {
			Polymorphism pph=new Polymorphism();
			type_A[] ta=new Polymorphism.type_A[3];
			ta[0]=pph.new type_A();
			ta[1]=pph.new type_B();
			ta[2]=pph.new type_C();
			for(type_A tao:ta) {
				
				tao.show();//�@�Ӫ���Q��ܦ����h�ӫ��A
				
			}
		}
		
}


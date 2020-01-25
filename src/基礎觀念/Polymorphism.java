package 基礎觀念;

public class Polymorphism {
		class type_A{
			
			public void show() {
				
				System.out.println("物件A");
			}
			
		}
		class type_B extends type_A{
			
			public void show() {
				
				System.out.println("物件B");
			}
			
		}
		
		class type_C extends type_A{
			
			public void show() {
				
				System.out.println("物件C");
			}
			
		}
		
		public static void main(String[] args) {
			Polymorphism pph=new Polymorphism();
			type_A[] ta=new Polymorphism.type_A[3];
			ta[0]=pph.new type_A();
			ta[1]=pph.new type_B();
			ta[2]=pph.new type_C();
			for(type_A tao:ta) {
				
				tao.show();//一個物件被表示成為多個型態
				
			}
		}
		
}


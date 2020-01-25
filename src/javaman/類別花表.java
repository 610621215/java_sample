package javaman;
//於此執行中表現出了class能出現的各種樣式
//以及enum的使用，由於enum自帶 public static final這三種屬性，所以無論存在於類別(class)內或外皆不影響結果
//enum能可以直接圈出特殊字，並搭配switch-case使用
public class 類別花表 {
	enum type{fire,grass,water}
	class inner_class{}
	interface ss{
		void show();
		
	}
	class simulate_outer_class implements ss{
		
		public void show() {
		}
	}
	static class inner_class2{}
	class inner_class3{
		type tplist;
		public inner_class3(type tplist) {
			this.tplist=tplist;
			System.out.println(this.tplist);
		}
		
	}//結合type
	public static void main(String[]args) {
		類別花表 mymain=new 類別花表();
		mymain.new inner_class();
		new inner_class2();//不解釋吧，已經在類別花表之中先產生過一次了，就直接建立起來就好
		class method_class{
			public void show() {
				
			}
			public String toString() {
				
				return "method_class";
			}
//			public static showtime() {}//在method不能使用static這個字眼
		}
		System.out.print(new method_class().toString());
		simulate_outer_class soc=mymain.new simulate_outer_class() {	
			public void show() {
				System.out.println("\ngogog");
				
			}
		};
		soc.show();
		inner_class3 ic3=mymain.new inner_class3(type.fire);
		type_test(ic3);
		inner_class3 ic4=mymain.new inner_class3(type.grass);
		type_test(ic4);
		System.out.println(type.valueOf("fire"));//利用valueof又能是同一般字串處理
		System.gc();
		inner_class[] ic=new 類別花表.inner_class[3];//內部類別陣列
	}
	public static void type_test(inner_class3 ic3) {
		switch(ic3.tplist) {
		case  fire:
			System.out.println("不是吧，這傢伙是火屬性的");
			break;
		case  grass:
			System.out.println("不是吧，這傢伙是草屬性的");
			break;
		default:
			System.out.println("不是吧，這傢伙是無屬性的");
	}
		
	}
	
	
}

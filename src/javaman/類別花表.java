package javaman;
//�󦹰��椤��{�X�Fclass��X�{���U�ؼ˦�
//�H��enum���ϥΡA�ѩ�enum�۱a public static final�o�T���ݩʡA�ҥH�L�צs�b�����O(class)���Υ~�Ҥ��v�T���G
//enum��i�H������X�S��r�A�÷f�tswitch-case�ϥ�
public class ���O��� {
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
		
	}//���Xtype
	public static void main(String[]args) {
		���O��� mymain=new ���O���();
		mymain.new inner_class();
		new inner_class2();//�������a�A�w�g�b���O����������͹L�@���F�A�N�����إ߰_�ӴN�n
		class method_class{
			public void show() {
				
			}
			public String toString() {
				
				return "method_class";
			}
//			public static showtime() {}//�bmethod����ϥ�static�o�Ӧr��
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
		System.out.println(type.valueOf("fire"));//�Q��valueof�S��O�P�@��r��B�z
		System.gc();
		inner_class[] ic=new ���O���.inner_class[3];//�������O�}�C
	}
	public static void type_test(inner_class3 ic3) {
		switch(ic3.tplist) {
		case  fire:
			System.out.println("���O�a�A�o�å�O���ݩʪ�");
			break;
		case  grass:
			System.out.println("���O�a�A�o�å�O���ݩʪ�");
			break;
		default:
			System.out.println("���O�a�A�o�å�O�L�ݩʪ�");
	}
		
	}
	
	
}

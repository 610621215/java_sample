package ��¦�[��;

public class �~�� {
	public static void main(String[]args) {
			���Ҫ��D�D title=new ���Ҫ��D�D();
			title.name="aa";
			title.price=50;
			title.authors="zz";
			title.isable=false;	
			String txt=title.isable?"�ϥ�":"�L�k�ϥ�";
			System.out.println(txt);
			title.go2();
			
			//�����O a1=�H�l���O��@(�o��ܱN�l���O�j���૬)
			
			�� a1=new ���Ҫ��D�D();//�l���O���������O���@�w���A�ҥH�����O�[�\�l���O���d��A�]���O�l���O���j���૬
			a1.go();
			System.out.println(a1.toString());
			a1.show();
			System.out.println(a1 instanceof ���Ҫ��D�D);
//			a1.go2();�p�ĤQ�T�檺��@��k�A�ä��s�bgo2

	}
}
class ��{
	String name;
	int price;
	String authors;
	final static int a=0;//����
	public static void go() {
		
		System.out.println("��");
	
	}
	public String toString() {
		return "��";
		
	}
	public void show() {
		
		System.out.println(name);

		System.out.println(price);

		System.out.println(authors);
	}
}
class ���Ҫ��D�D extends ��{
	boolean isable;
	public String toString() {
		
		return "���Ҫ��D�D";
	}
	public void show() {
		System.out.println("���Ҫ��D�D");
		
	}
	public void go2() {
		
//		super.go();
		super.show();
		System.out.println(isable);
	
	}
//
//	public void go() {}�L�k�P�ɦs�b
	
}
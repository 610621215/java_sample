package ��¦�[��;
//�`�N�\Ū����
//��k��re-use
//re-use�Τ�kñ��
public class creating_object2{
	public static void main(String[] args) {
		book book1=new book();//(1)
		book1.authors="�Ĥ@�ӧ@��";
		book1.price=580;
		book1.discount_price(book1.price);
		book1.discount_price(book1);
		book1.show();
		System.out.println(book1.discount_price(book1.price));//(4)�Y���ϥ�(3)�Ҵ��Ѫ���ĳ�h�i�H�A���s�C�L�A�ϥ����^�ǳ��S�����D
		book book2=new book();
		book2.authors="�ĤG�ӧ@��";
		book2.price=780;
		book2.discount_price(book2.price);//�S���ק�A�o��ܤF�ϰ��ܼƪ��ͩR�g���N�O�Ȧb�Ӥ�kñ����
		book2.discount_price(book2);
		System.out.println(book2.discount_price(book2.price));//(4)�Y���ϥ�(3)�Ҵ��Ѫ���ĳ�h�i�H�A���s�C�L�A�ϥ����^�ǳ��S�����D
		//���F��`���Ѫ���N�h�ϥ�(4)
		book2.show();
		 
	}
}

class book{
	int price;
	String authors;
	int tag=0;
	
	public void show() {//��ñ���Ҧ��ݥ�������
		
		System.out.println(this.price);

		System.out.println(this.authors);
	}
	public float discount_price(int price) {
		//(2)
//		price=price*0.5;//��*��/�a���p�ƪ����e�ɷ|�]�����O�L�k�PŪ�ӳy���L�k�sĶ
		//�G�ݭn�j����w�@�ث��O
		//==================
		//(3)
		price=(int) (price*0.5);//�Y�ݭn�o�ͧ��ܫh�i�H�ϥ�this�o�Ӧr��ܬ���class
		return price;
	}
	public void discount_price(book b) {
		b.price=(int) (b.price*0.9);
	}
	public String toString(int tag) {
		return tag+"";	
	}
}
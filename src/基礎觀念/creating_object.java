package ��¦�[��;
//�إߪ���H�ΨϥΰѼƦC��
public class creating_object {
	public static void main(String[]args) {
		object book1=new object(50,"moon","bb");
		object book2=new object(100,"sun","bb");
		book1.show();
		book2.show();
	}
}

class object{
	String name;
	String authors;
	int cost;
	//(1)
	object(int cost,String...strings) {//�Y�Ĥ@�ӰѼƨϥΦW�٬�cost,�]���P�W����G�ϱo�䤴�ĥθ����O����cost
		//�]��int��initalized variable =0,�G��0,�i�H�ϥ�this.���X�Ϲj
		//�W�z���{�H���B�������A�Ѫ��ܼƾB�������ܼ�(�����)
		name=strings[0];//�]�����P�W
		authors=strings[1];
		//�Y���ϥΰѼƦC��h�ϱoname=name�|�Φ�null
		cost=cost;//���B�Ӽg�k�|�ϱo�쥻��cost�٬O�Q�έ�Ӫ�cost,�]���ܼƪ��ͩR�g�������D
		//�G
//		cost=c;
		this.cost=cost;
		
	}//�غc�����@�w�ݭnpublic
	public void show() {
		System.out.println(name);
		System.out.println(authors);
		System.out.println(cost);
		
	}
}

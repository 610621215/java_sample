package ��¦�[��;
//��������
//�`�`�]��i++��++i�x�Z���A�A���u�n���O��a�R��b�����D��
//�A���[��[���@�ˡC
public class ��l�Ÿ� {
	static int[] data=new int[3];
	static boolean arg1=true;
	static boolean arg2=false;
	public static void main(String[] args) {
		
		new ��l�Ÿ�().createdata();
		System.out.println("data[1]|data[2]"+(data[1]|data[2]));//For�줸���x�s��k
		System.out.println((arg1&arg2)+"");
		int a=1;
		int b=++a;
		System.out.println(a+"\t"+b);
		++a;
	}
	public void createdata() {
		for(int i=1;i<=2;i++) 
			data[i]=i;		
	}
	
	
}

package ��¦�[��;


public class �}�C�ǭȶǧ} {
	public static void main(String[] args) {
		int[] book1= {500,200,300};
		int[] book2=book1;
		System.out.println(book2+"\t"+book1);//��ӳ����V�P�@�ӰO�����m
		book1[0]=book1[0]*2;
		System.out.println(book2[0]+"\t"+book1[0]);//�]���O�ۦP����m�G�|�P�B�ק�
		int[][] book3= {{1,2,3},{2,3}};//�D��}���
		System.out.println(book3[1][1]);
	}
	
}

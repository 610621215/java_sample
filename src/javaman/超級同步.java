package javaman;

import java.util.Random;
import java.util.Scanner;

public class �W�ŦP�B {
	
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		company_manger cm=new company_manger();
		company one=new company(cm);
		player player=new player(cm);
		System.out.println("��J���O�̼ƶq�G");
		player.count_player=input.nextInt();
		one.start();
		player.start();
	}
}
//�w�s<20�n�Ͳ�
//�w�s<5�n�ʫP
//�Y�w�s�p���ʶR�h������O
class company_manger{
	private int inventory=0;
	synchronized public void create(int create_num) {
		while(inventory<25) {
			inventory+=2;
		}
		try {
			System.out.println("�����F"+inventory);
			wait();//�i�J����,��ܤw�g�������F
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("�_���ʶR�O");
		notify();//�M������ʶR�O��

		System.out.println("�ثe�s�f:"+inventory);//�@����_�캡��
	}
	synchronized public void purchase(int request) {
		try {
			while(request>inventory) {
				System.out.println("���O�O�L�j");
				wait();//�i�J���ݭY���F�|�Q���
			}
			inventory-=request;
			System.out.println("���ɦ���:"+inventory+"\trequest:"+request);
			if(request<5) {
				System.out.println("�s�q�L�C");
				notify();//����s�@
			}
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		
	}
}
class company extends Thread{
	company_manger cm;
	public company(company_manger cm) {
		this.cm=cm;
	}
	public void run() {
		while(true)
			cm.create(4);
	}
}

class player extends Thread{
	company_manger cm;
	static int count_player=50;
	public  player(company_manger cm) {
		this.cm=cm;
	}
	public void run() {
		for(int i=0;i<count_player;i++) {
			int request=new Random().nextInt(5)+1;
			System.out.println("���a#"+i+"���O"+request);
			cm.purchase(request);
		}
		System.out.println("�Ҧ����O�̤w�g���O����");
	}
	
}
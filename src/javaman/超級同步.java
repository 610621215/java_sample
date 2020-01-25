package javaman;

import java.util.Random;
import java.util.Scanner;

public class 超級同步 {
	
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		company_manger cm=new company_manger();
		company one=new company(cm);
		player player=new player(cm);
		System.out.println("輸入消費者數量：");
		player.count_player=input.nextInt();
		one.start();
		player.start();
	}
}
//庫存<20要生產
//庫存<5要催促
//若庫存小於購買則停止消費
class company_manger{
	private int inventory=0;
	synchronized public void create(int create_num) {
		while(inventory<25) {
			inventory+=2;
		}
		try {
			System.out.println("做夠了"+inventory);
			wait();//進入等待,表示已經做完成了
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("復活購買力");
		notify();//專門喚醒購買力的

		System.out.println("目前存貨:"+inventory);//一次恢復到滿檔
	}
	synchronized public void purchase(int request) {
		try {
			while(request>inventory) {
				System.out.println("消費力過強");
				wait();//進入等待若夠了會被喚醒
			}
			inventory-=request;
			System.out.println("此時此刻:"+inventory+"\trequest:"+request);
			if(request<5) {
				System.out.println("存量過低");
				notify();//喚醒製作
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
			System.out.println("玩家#"+i+"消費"+request);
			cm.purchase(request);
		}
		System.out.println("所有消費者已經消費完成");
	}
	
}
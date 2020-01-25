package 基礎觀念;
//建立物件以及使用參數列表
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
	object(int cost,String...strings) {//若第一個參數使用名稱為cost,因為同名的原故使得其仍採用該類別內的cost
		//因為int的initalized variable =0,故為0,可以使用this.做出區隔
		//上述的現象為遮蔽效應，由近的變數遮蔽遠的變數(指行數)
		name=strings[0];//因為不同名
		authors=strings[1];
		//若不使用參數列表則使得name=name會形成null
		cost=cost;//此處該寫法會使得原本的cost還是利用原來的cost,因為變數的生命週期的問題
		//故
//		cost=c;
		this.cost=cost;
		
	}//建構式不一定需要public
	public void show() {
		System.out.println(name);
		System.out.println(authors);
		System.out.println(cost);
		
	}
}

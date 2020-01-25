package 基礎觀念;
//注意閱讀順序
//方法的re-use
//re-use及方法簽章
public class creating_object2{
	public static void main(String[] args) {
		book book1=new book();//(1)
		book1.authors="第一個作者";
		book1.price=580;
		book1.discount_price(book1.price);
		book1.discount_price(book1);
		book1.show();
		System.out.println(book1.discount_price(book1.price));//(4)若不使用(3)所提供的建議則可以再重新列印，反正有回傳都沒有問題
		book book2=new book();
		book2.authors="第二個作者";
		book2.price=780;
		book2.discount_price(book2.price);//沒有修改，這表示了區域變數的生命週期就是僅在該方法簽章內
		book2.discount_price(book2);
		System.out.println(book2.discount_price(book2.price));//(4)若不使用(3)所提供的建議則可以再重新列印，反正有回傳都沒有問題
		//為了遵循本書的原意則使用(4)
		book2.show();
		 
	}
}

class book{
	int price;
	String authors;
	int tag=0;
	
	public void show() {//此簽章模式需先有實體
		
		System.out.println(this.price);

		System.out.println(this.authors);
	}
	public float discount_price(int price) {
		//(2)
//		price=price*0.5;//當*或/帶有小數的內容時會因為型別無法判讀而造成無法編譯
		//故需要強迫選定一種型別
		//==================
		//(3)
		price=(int) (price*0.5);//若需要發生改變則可以使用this這個字表示為該class
		return price;
	}
	public void discount_price(book b) {
		b.price=(int) (b.price*0.9);
	}
	public String toString(int tag) {
		return tag+"";	
	}
}
package 基礎觀念;


public class 陣列傳值傳址 {
	public static void main(String[] args) {
		int[] book1= {500,200,300};
		int[] book2=book1;
		System.out.println(book2+"\t"+book1);//兩個都指向同一個記憶體位置
		book1[0]=book1[0]*2;
		System.out.println(book2[0]+"\t"+book1[0]);//因為是相同的位置故會同步修改
		int[][] book3= {{1,2,3},{2,3}};//非方陣表示
		System.out.println(book3[1][1]);
	}
	
}

package javaman;

import java.util.*;
//物件泛型
//泛型展示
public class 集合 {
	class inner_object{
		int a=0;
		public void show() {
			System.out.println("inner_object");
			
		}
		public String toString() {
			
			return "inner_object";
		}
	}
	class inner_object2{
		
		public void show() {
			List list=new ArrayList<String>();
			list.add("AA");
			list.add("Aa");
			list.add("a");
			list.add("aa");
			
			Collections.sort(list);
			for(Object txt: list)
				System.out.println(txt);
			
		}	
	}
	class inner_object3<T>{
		T price;
		public inner_object3(T price){
			this.price=price;
		}
		public T getprice() {
			return price;
		}
		public void finalize() {
			System.out.println(price);
		}
	}
	class extends_inner_item{
		int highlgiht=0;
		
		
	}
	class test5 extends extends_inner_item{}
	class inner_object4<T>{
		T bk;
		public inner_object4(extends_inner_item eii){
			System.out.println(eii.highlgiht);
			
		}
		
	} 
	public static void main(String[]args) {
		Collection collection=new ArrayList();
		collection.add(1);
		inner_object iob=new 集合().new inner_object();
		inner_object iob2=new 集合().new inner_object();
		collection.add(iob);
		collection.add(iob2);
		collection.add(true);
		for(Object o:collection) {
			System.out.println(o);
			
		}
		collection.remove(iob2);
		Iterator it=collection.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		new 集合().new inner_object2().show();
		new 集合().new inner_object3(233).finalize();
		new 集合().new inner_object3(233.33).finalize();
		new 集合().new inner_object3("*233-").finalize();
		extends_inner_item[] eii=new 集合.extends_inner_item[3];
		for(int i=0;i<eii.length;i++) {
			eii[i]=new 集合().new extends_inner_item();
			eii[i].highlgiht=i;
		}
		for(int i=0;i<eii.length;i++)
			new 集合().new inner_object4(eii[i]);
	}
}

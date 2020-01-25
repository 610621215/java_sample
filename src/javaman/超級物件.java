package javaman;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class 超級物件 {
	
	class item{
		int t=0;
		public item(int code) {
			this.t=code;
			
		}
		public int hashCode() {
			return t;
		}
		public boolean equals(Object o) {
			if(this==o) {//比較hashcode
				return true;
			}
			if((o==null))
				return false;
			if(!(o instanceof item))
				return false;
			item o2=(item)o;
			Integer super_t=new Integer(t);
			Integer super_t2=new Integer(o2.t);
			return (super_t.equals(super_t2));
		}
	}
	class item2 implements Comparable<item2>{
		int t=0;
		@Override
		public int compareTo(item2 o) {//原句為 public int compareTo(T o);,故什麼型態皆可以
			//由TreeSet呼叫的排列式集合
			// TODO Auto-generated method stub
			Integer the_it=new Integer(this.t);
			Integer outer_it=new Integer(o.t);
			return the_it.compareTo(outer_it);
		}
		
		
		
	}
	public static void main(String[]args) {
		超級物件 it=new 超級物件();
		item testing_item=it.new item(233);
		item testing_item2=it.new item(233);
		item2 testing_itemm=it.new item2();
		System.out.println("Hashcode1:"+testing_item.hashCode());
		System.out.println("Hashcode2:"+testing_item2.hashCode());
		System.out.println("相同的物件:"+testing_item.equals(testing_item2));
		System.out.println("相同的Hashcode:"+(testing_item.hashCode()==testing_item2.hashCode()));
		Set<item> bag=new HashSet<item>();//可以由泛型決定是否給予新增欸
//		bag.add(null);
		System.out.println(bag.add(testing_item));
		System.out.println(bag.add(testing_item2));//因為有一樣的t值
		System.out.println("null的新增"+bag.add(null));
//		System.out.println("品種"+testing_item.equals(testing_itemm));
		testing_item2=testing_item;
		System.out.println(bag.add(testing_item2));
		//^^改寫hashcode與equals
		Set<item2> it_set=new TreeSet<item2>();
//		Set<item2> sort_it_set=new SortedSet<item2>(); 
		testing_itemm.t=234;
		item2 testing_itemm2=it.new item2();
		testing_itemm2.t=333;
		item2 testing_itemm3=it.new item2();
		testing_itemm3.t=-23;
		it_set.add(testing_itemm);
		it_set.add(testing_itemm3);
		it_set.add(testing_itemm2);
		//^^物件TreeSet
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(3);
		ts.add(4);
		ts.add(1);
		ts.add(2);
		TreeSet<Integer> sub_ts=(TreeSet<Integer>) ts.subSet(1,true,3,false);//Set強制轉型成TreeSet
		Iterator it2=sub_ts.iterator();
		while(it2.hasNext()) {
			System.out.println("Tree: "+it2.next());
		}
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(3);
		ls.add(33);
		ls.add(43);
		ls.add(0,40);//若超過index的範圍，會出現錯誤
		// java.lang.IndexOutOfBoundsException <=泛指所有超過範圍的例外
		for(Integer is:ls) {
			System.out.println(is);
			
		}
		Queue<String> qq=new PriorityQueue<String>();//具備排列特性
		//千萬記得字數少的放後面,
		//小寫放後面
		qq.offer("ss");
		qq.offer("s");
		qq.offer("SS");
		qq.offer("Ss");
		Iterator itqq=qq.iterator();
		System.out.println(qq.peek());
		while(itqq.hasNext()) {
			System.out.println(itqq.next());
		}
		System.out.println("poll出第一個"+qq.poll());
		System.out.println("\n");
		itqq=qq.iterator();//需要重新定義，由此可以知道若null時則Iterator也會變成null
		//為實際檢所
		while(itqq.hasNext()) {
			System.out.println("poll過的"+itqq.next());//先拔過第一個了，因此後印三者
		}
		String temp="";
		//用peek以及poll的combo完成取出佇列
		while((temp=qq.peek())!=null) {
			System.out.println(temp);
			qq.poll();
			
		}
		//
		System.out.println("完全移除了："+qq.size());
		Map gomap=new HashMap<String,Integer>();
		gomap.put("A", 11);
		gomap.put("B", 12);
		gomap.put("b", 11);
		System.out.println("map elements:"+gomap);
		gomap.remove("A");
		System.out.println("map elements:"+gomap);
		Set mykey=new TreeSet(gomap.keySet());
		Collection myvalue=new ArrayList(gomap.values());
		Iterator temp_it=mykey.iterator();
		while(temp_it.hasNext()) {
			System.out.println(temp_it.next());//小寫置後
		}
		for(Object values:myvalue) {//所有集合與串鏈的萬能取法
			System.out.println(values);
		}
	}
}

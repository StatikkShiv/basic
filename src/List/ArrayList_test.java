package List;
import java.util.*;

public class ArrayList_test {
/*
 * Arraylist支持3个构造方法
 * Arraylist() 构造一个空的链表
 * ArrayList(Collection<? extends E> c) 这个构造方法构造了一个包含指定元素集合的链表
 * ，注意，这里的字符E是一个标记，用来表示集合中元素的类型。至于具体是什么类型，需要你在使用这个构造方法的时候来指定。
 * ArrayList(int initialCapacity) 构造了一个指定大小但内容为空的链表。initialCapacity参数就是初始容量大小。
 * 默认是10
 * 需要说明的是，遍历ArrayList时，通过索引值遍历效率最高，for循环遍历次之，迭代器遍历最低。
 */
	public static void main(String[] args) {
	 
		 ArrayList<String> list = new ArrayList<String>();
		
		 list.add("Item1");
		 list.add("Item2");
		 list.add(2,"Item3");//// 此条语句将会把“Item3”字符串增加到list的第3个位置。
		 list.add("Item4");
		 
		 //迭代器遍历
		 Iterator<String> it=list.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());	
		 }
	}
}

package collection;
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
 * 不是线程安全
 */
	public static void main(String[] args) {
	 
		 ArrayList<String> list = new ArrayList<String>();
		
		 list.add("Item1");
		 list.add("Item2");
		 list.add(2,"Item3");//// 此条语句将会把“Item3”字符串增加到list的第3个位置。
		 list.add("Item4");
		 
		 //索引遍历 速度最快
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
		 
		 //for循环遍历 速度第二
		 for(String s:list) {
			 System.out.println(s);
		 }
		 
		//迭代器遍历 速度最慢
		 Iterator<String> it=list.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());	
		 }
		 
		 //检查元素的位置
		 int pos=list.indexOf("Item2");
		 System.out.println("The index of Item2:"+pos);
		 
		 //检查数组链表是否为空
		 boolean check=list.isEmpty();
		 System.out.println("Checing if the arraylist is empty");
		 
		 //获取链表的大小
		 int size=list.size();
		 System.out.println("The size of the list is: "+size);
		 
		 //检查数组链表中是否包含某元素
		 boolean element=list.contains("Item2");
		 System.out.println("Checking if the arraylist contains the object Item2");
		 
		 //获取指定位置上的元素
		 String item=list.get(0);
		 System.out.println("The item is the index 0 is: "+item);
		 
		 //替换元素
		 list.set(0, "NewItem");
		 
		 //移除指定位置的元素
		 list.remove(0);
		 
		 //移除第一次找到的Item3元素
		 list.remove("Item3");
		 
		 System.out.println("The final contents of the arraylist are: " + list);
		 
		// 清空ArrayList
         list.clear();
		 
		 //有时候，当我们调用ArrayList中的 toArray()，可能遇到过抛出java.lang.ClassCastException异常的情况，这是由于toArray() 返回的是 Object[] 数组，将 Object[] 转换为其它类型(如，将Object[]转换为的Integer[])则会抛出java.lang.ClassCastException异常，因为Java不支持向下转型。 
		 // toArray用法
         // 第一种方式(最常用)
         String[] integer = list.toArray(new String[0]);

         // 第二种方式(容易理解)
         String[] integer1 = new String[list.size()];
         list.toArray(integer1);

         // 抛出异常，java不支持向下转型
         //Integer[] integer2 = new Integer[arrayList.size()];
         //integer2 = arrayList.toArray();
         System.out.println();
         
         
		 
	}
}

package defaultpackage;
import java.util.*;
public class CollectionAssisted {
public static void main(String[] args) {
System.out.println("ArrayList");
ArrayList<String> array = new ArrayList<String>();
array.add("Malathi");
array.add("Vishnu");
System.out.println(array);
System.out.println();
System.out.println("Vector");
Vector<String> vector = new Vector();
vector.add("Welcome");
vector.addElement("Happy");
System.out.println(vector);
System.out.println();
System.out.println("LinkedList");
LinkedList<Integer> list = new LinkedList<Integer>();
list.add(10);
list.add(20);
System.out.println(list);
System.out.println();
System.out.println("Hashset");
HashSet<Integer> set = new HashSet<Integer>();
set.add(100);
set.add(200);
System.out.println(set);
System.out.println();
System.out.println("LinkedHashSet");
LinkedHashSet<Integer> hashset = new LinkedHashSet<Integer>();
hashset.add(300);
hashset.add(400);
System.out.println(hashset);
}
}
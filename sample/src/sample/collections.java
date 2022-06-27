package sample;
import java.util.*;
public class collections {


	public static void main(String[] args) {
		//var list=new pract1<>();
		//Array list
		List list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//getting element
		System.out.println(list.get(2));
		//removing element
		System.out.println(list.remove(1));
		
		//linked list
		List num=new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		System.out.println(num);
		System.out.println(num.get(1));
		System.out.println(num.remove(0));
		//array list
		ArrayList<String>list2=new ArrayList<>();
		list2.add("Java");
		list2.add("python");
		list2.add("html");
		list2.set(1, "Javascript");
		System.out.println(list2);
		Vector<String>nam1=new Vector<>();
		nam1.add("ui");
		nam1.add("fg");
		nam1.add("jkj");
		System.out.println(nam1);
		//iterator
		Iterator<String> it = nam1.iterator();
		System.out.println("elements");
		while(it.hasNext())
		{
			System.out.println(it.next());  
			//set
			HashSet<String> set = new HashSet();
			set.add("Ram");
			set.add("Sita");
			set.add("Raghu");
			set.add("Devi");
			
			//System.out.println();
			
			//MAP
			Map<String,Integer>map=new HashMap<>();
			//inserting the values to the map
			map.put("Rama",109);
			map.put("Sita",110);
			map.put("Raju",111);
			map.put("Vani",112);
			map.remove("Vani");
			
			for(String key:map.keySet())
			System.out.println(key);
			
			System.out.println(map.get("Rama"));
			System.out.println(map.keySet());
			System.out.println(map.entrySet());
			System.out.println(map.values());
			//Tree Map
			Map<Integer,String>values=new TreeMap<>();
			values.put(10,"Usha");
			values.put(11,"Rani");
			values.put(12,"Kity");
			values.put(13,"Devi");
			
			System.out.println(values.get(12));
			System.out.println(values.keySet());
			System.out.println(values.entrySet());
			System.out.println(values.values());
			
			//Map<>values=new TreeMap<Character, Integer>();
			//values.put('a',11);
			//values.put('e',12);
			//System.out.println(map.);
			
			//Hash map
			
			HashMap<Integer, String>languages=new HashMap<>();
			languages.put(101,"C");
			languages.put(102,"Java");
			languages.put(103,"Python");
			
			System.out.println(languages.get(103));
			System.out.println(languages.keySet());
			System.out.println(languages.entrySet());
			System.out.println(languages.values());
			
			
			
			
			
		}
	}
}
      
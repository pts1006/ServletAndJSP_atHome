package arrayList18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	/*
		ArrayList, set(), get()
	 */
	
	public static void main(String[] args) {
		Main main = new Main();
		main.mapExample();
		System.out.println(main.returnArray());
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("18");
		str.add("24");
		Map<String, Object> map = new HashMap<>();
		map.put("arr1", str);
		
		System.out.println(main.returnArray(str, map));
		//main.arrayExample();
	}
	
	public void arrayExample() {

		ArrayList<String> asd = new ArrayList<>();
		ArrayList<Integer> sad = new ArrayList<>();
		
		asd.add("year");
		asd.set(0, "년");
		asd.add("month");
		asd.set(1, "Moon");
		asd.add("day");
		asd.set(2, " D ");
		
		sad.add(1);
		sad.add(2);
		sad.add(3);
		sad.add(4);
		sad.add(5);
		
		System.out.print(asd.get(1) + asd.get(2));
		System.out.println(sad.get(1) * sad.get(3) + sad.get(1) * sad.get(4) + asd.get(0));
	}
	
	public void mapExample() {
		/*
	 	Map이란?
	 	Map<Key, Value> 다.
	 	Map은 Object 이기에 Key값은 사실상 String으로 고정적으로 생각해라. Object 해도 의미없다.
	 	array는 배열 공간안에 각 방마다 오브젝트가 들어있다.[{}, {}]
	 	map은 오브젝트 공간만 있다. {}
	 	Map에다가 배열을 넣는다고? ㅅㅂ? ㅇㅇ 가능ㅋ
	 	{"arr1":[{18}, {24}]}
	 	
		*/
//		Map<Object, String> ma3 = new HashMap<>();
//		Map<String, String> map2 = new HashMap<>();
//		Map<String, ArrayList<String>> map4 = new HashMap<>();
		ArrayList<String> str = new ArrayList<String>();
		str.add("18");
		str.add("24");
		Map<String, Object> map = new HashMap<>();
		map.put("arr1", str);
		
		// {"a":{},"b":[],"c":{"g":[]}}
		System.out.println(map.toString());
//		System.out.println(map.get(str.get(1)));
		
		// [18, 24] arr1이라는 key 값에 value를 가지고온다. 우리는 위에서 ArrayList str를 map에 삽입했기때문.
		System.out.println(map.get("arr1")); 
		
		ArrayList<String> str2 = (ArrayList<String>) map.get("arr1");
		System.out.println(str2);
		
		System.out.println((ArrayList<String>) map.get("arr1"));
	}
	
	/*
	오버로딩(overloading) : 같은 함수명인데 () 매개변수가 다르고 여러 같은 함수명칭을 뭐라한다?
	
	*/
	public ArrayList<String> returnArray() {
		ArrayList<String> str = new ArrayList<String>();
		str.add("18");
		str.add("24");
		Map<String, Object> map = new HashMap<>();
		map.put("arr1", str);
		ArrayList<String> str2 = (ArrayList<String>) map.get("arr1");
		return str2;
	}
	
	public ArrayList<String> returnArray(ArrayList<String> str, Map<String, Object> map) {
		return (ArrayList<String>) map.get("arr1");
	}

}

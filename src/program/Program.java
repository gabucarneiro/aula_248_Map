package program;

import java.util.LinkedHashMap;
//import java.util.HashMap;
//import java.util.TreeMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		//Map<K,V> mapName = new TreeMap<>();
		
		Map<String, String> cookies = new LinkedHashMap<>();
		
		cookies.put("userName", "Gabriel");
		cookies.put("email", "gabriel@none.com");
		cookies.put("phone", "70992234525");
		
		for(String s : cookies.keySet()) {
			System.out.println(s + " - " + cookies.get(s));
		}
	}
}

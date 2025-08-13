package Demo;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		
		
		Map<Integer, String> test = new HashMap();
		test.put(1, "Abhsihek");
		test.put(2, "rajput");
		System.out.println(test.get(2));
		System.out.println(test.containsKey(1));
		System.out.println(test.getOrDefault(1, "No value found"));
	}

}

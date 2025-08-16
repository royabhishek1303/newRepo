package Demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		
		
//		Map<Integer, String> test = new HashMap();
//		test.put(1, "Abhsihek");
//		test.put(2, "rajput");
//		System.out.println(test.get(2));
//		System.out.println(test.containsKey(1));
//		System.out.println(test.getOrDefault(1, "No value found"));
//		System.out.println("testing");
		
		//String[] words = s.split("\\s+");
		
//		StringBuilder rev = new StringBuilder();
//		for(String word:words) {
//			StringBuilder sb = new StringBuilder(word);
//			rev.append(sb.reverse()).append(" ");
//		}
//		System.out.println(rev.toString().trim());
		
//		String s = "mynameisabhishek";
//	
//		Set<Character> s1= new LinkedHashSet<>();
//		for(int i=0; i<=s.length()-1; i++) {
//		//char c = s.charAt(i);
//		s1.add(s.charAt(i));
//			
//		}
//		for(char c:s1) {
//			System.out.print(c+" ");
//		}
		
//		String s="ab91231234103db923";
//		int num=0;
//for(int i =0; i<=s.length()-1; i++) {
//	char c=s.charAt(i);
//			if(Character.isDigit(c)) {
//
//				
//				num=Character.getNumericValue(c);
//				if(num%2!=0) {
//					System.out.println(num);
//
//				}

		int num []= {1,3,4,2,13,4,21,1,4,7,8,44,6,2,3,4};
		
		Arrays.sort(num);
		
		for(int i=0; i<num.length-1; i++) {
			int count = 1;

		
			for(int j=i+1; j<num.length-1; j++) {
				if(num[i]==num[j]) {
					count++;
				}else {
					break;
				}
					
				}
			System.out.println("Elements|Count");
			System.out.println(num[i] + " -> " +    count);
			i+=(count-1);

			}



	
	
}
		
		
//		StringBuilder rev = sb.reverse();
//		System.out.println(rev);
//		String rev="";
//		for( String words:word) {
//			String revWord="";
//
//		for(int i=words.length()-1; i>=0; i--) {
//		revWord = revWord+words.charAt(i);
//		
//		
//		}
//		rev=revWord+rev;
//		}
			
		//	System.out.println(rev);
			
}			//char c= s.charAt(i);
	

	//		rev +=word[i] + " ";
//		
//		
//		// testing main branch
//		
//		//abhishek
//	}
//		System.out.print(rev.trim());
//	}
	


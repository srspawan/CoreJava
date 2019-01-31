package com.hs.program;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringExample {
	// this is the code of frequency method which is in Collection interface
	public static int countNoOfWords(Collection<?> c, Object word) {
        int result = 0;
        if (word == null) {
            for (Object e : c)
                if (e == null)
                    result++;
        } else {
            for (Object e : c)
                if (word.equals(e))
                    result++;
        }
        return result;
    }
	public static void main(String[] args) {
		String s1 = "abc def ghi jkl abc def kls nmk abc";
		String[] str = s1.split(" ");
		List<String> list  = Arrays.asList(str);
		Set<String> set = new HashSet<String>(list);
		for(String word:set){
			System.out.println(word + " comes " + countNoOfWords(list, word) + " times");			
		}
		
		// to reverse the string
		/*String s1 = "Hare";
		char s = 0;
		for(int i=s1.length()-1;i>=0;i--){
			s =  s1.charAt(i);
			System.out.print(s);
		}*/
		
		
		
			/*String s1 = "abc";
			s1.concat("fed");
			System.out.println(s1); // abc
			System.out.println(s1.concat("cde"));*/ // abcfed
		
	}
	
	
	
	
}

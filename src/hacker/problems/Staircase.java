package hacker.problems;

import java.util.ArrayList;
import java.util.List;

public class Staircase {

	
	static void staircase(int n) {

		List<String> list = prepareString(n);
    for (String s : list) {
    	System.out.println(s.format("%1$" + n + "s", s));
	}
    }
	
	static List<String> prepareString(int n){
	
		StringBuffer sb = new StringBuffer();
		List<String> list = new ArrayList<String>();
		while(n>0) {
			sb.append("#");
			list.add(sb.toString());
			n--;
		}
		
		return list;
	}
	
	
 public static void main(String[] args) {
	// System.out.println(prepareString(5));
	 staircase(10);
}
}

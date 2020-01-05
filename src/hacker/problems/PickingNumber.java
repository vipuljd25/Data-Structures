package hacker.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class PickingNumber {

	public static int pickingNumbers(List<Integer> list) {
		Collections.sort(list);
		
		LinkedHashMap<Integer, Integer> map= new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < list.size(); i++) {
			int k=list.get(i);
			if(map.containsKey(k)) {
				map.put(k, map.get(k)+1);
			}else {
				map.put(k, 1);
			}
}
		return findSum(map);
		
	    }
	
	static int findSum(Map<Integer,Integer> map){
		
		int sum=0;
		int lastsum=0;
		List<int[]> list = new ArrayList<int[]>();
		for (Entry<Integer, Integer> set : map.entrySet()) {
		list.add(new int[] {set.getKey(),set.getValue()});
	}
		//System.out.println(map);
		if(list.size()>1) {
		for (int i = 0; i < list.size()-1; i++) {
			int[] f = list.get(i);
			int[] s = list.get(i+1);
			int v=f[0]-s[0];
			if(Math.abs(v)<=1) {
				sum=f[1]+s[1];
				if(sum>lastsum) {
					lastsum=sum;
					sum=0;
			}
			}else if(f[1]>sum && lastsum < f[1]) {
				lastsum=f[1];
			}else if(s[1] > sum && lastsum < s[1]) {
				lastsum=s[1];
			}
		}}else {
			int[] is = list.get(0);
			//System.out.println(is[1]);
			return is[1];
		}
		//System.out.println(lastsum);
		return lastsum;
		
	}
	
	public static void main(String[] args) {
		//String str="4 97 5 97 97 4 97 4 97 97 97 97 4 4 5 5 97 5 97 99 4 97 5 97 97 97 5 5 97 4 5 97 97 5 97 4 97 5 4 4 97 5 5 5 4 97 97 4 97 5 4 4 97 97 97 5 5 97 4 97 97 5 4 97 97 4 97 97 97 5 4 4 97 4 4 97 5 97 97 97 97 4 97 5 97 5 4 97 4 5 97 97 5 97 5 97 5 97 97 97";
		String str= "4 2 3 4 4 9 98 98 3 3 3 4 2 98 1 98 98 1 1 4 98 2 98 3 9 9 3 1 4 1 98 9 9 2 9 4 2 2 9 98 4 98 1 3 4 9 1 98 98 4 2 3 98 98 1 99 9 98 98 3 98 98 4 98 2 98 4 2 1 1 9 2 4";
		String[] split = str.split(" ");
		int[] array = Arrays.asList(split).stream().mapToInt(Integer :: parseInt).toArray();
		pickingNumbers(Arrays.stream(array).boxed().collect(Collectors.toList()));
	}
}

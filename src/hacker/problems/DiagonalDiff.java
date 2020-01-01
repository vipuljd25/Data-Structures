package hacker.problems;
import java.util.ArrayList;
import java.util.List;


public class DiagonalDiff {

	  public static int diagonalDifference(List<List<Integer>> arr) {
		  int k=arr.size();

		  
		  int int1=0;
		  int int2=0;
		  
		  for (int i = 0; i < k; i++) {
			
			  List<Integer> list = arr.get(i);
			  
			  int1=int1+list.get(i);
			  int2=int2+list.get(k-(i+1));
		}
		  
		return Math.abs(int1-int2);
		    // Write your code here

		    }
	
	public static void main(String[] args) {
		
		
		List<List<Integer>> list = new ArrayList(); 
		List<Integer> list1= new ArrayList<Integer>();
		list1.add(11);
		list1.add(2);
		list1.add(4);
		List<Integer> list2= new ArrayList<Integer>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		List<Integer> list3= new ArrayList<Integer>();
		list3.add(10);
		list3.add(8);
		list3.add(-12);
		list.add(list1);
		list.add(list2);
		list.add(list3);
		System.out.println(diagonalDifference(list));
		
		
		
		
	}
}

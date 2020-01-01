package hacker.problems;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class PlusMinus {
	
	static void plusMinus(int[] arr) {

		int l=arr.length;
		
		int pos=0;
		int zer=0;
		int neg=0;
		for (int i = 0; i < l; i++) {
			
			if(arr[i]>0){
				pos=pos+1;
			}else if(arr[i]<0){
				neg=neg+1;
			}else{
				zer=zer+1;
			}
		}
		
		
		double r1=(double)pos/(double)l;
		double r2=(double)neg/(double)l;
		double r3=(double)zer/(double)l;
		
	
		
		System.out.println(getString(String.valueOf(r1)));
		System.out.println(getString(String.valueOf(r2)));
		System.out.println(getString(String.valueOf(r3)));

    }
	
	static String getString(String s){
		
		int index = s.indexOf('.');
		
		String sub=s.substring(index+1);
		
		if(sub.length()==6){
			return s;
		}else if (sub.length()<6){
			
			int r= 6-(sub.length());
			String rs="";
			for (int i = 0; i < r; i++) {
			rs=rs+"0";
			}
			return s+rs;
		}else{
			return getRoundOf(s.substring(0,index+7));
		}
	}
	
	
	static String getRoundOf(String s){
	
	/*	BigDecimal bd = new BigDecimal(Double.valueOf(s)).setScale(5, RoundingMode.HALF_UP);
        double salary = bd.doubleValue();
      //  return String.valueOf(salary);
*/        
        String sub = s.substring(s.length()-1);

        int ld=Integer.parseInt(sub);
        if(ld>5){
        	ld=ld+1;
        	String newStr=s.substring(0, s.length()-1);
        	return newStr + ld;
        }else{
        	return s;
        }
        
        
		
	//return s.substring(s.length()-1);	
		//return String.valueOf(Math.round(d));
	}
	public static void main(String[] args) {
		
		
		plusMinus(new int[]{-4, 3, -9, 0, 4, 1});
		//System.out.println(getString("0.500000"));
	//	System.out.println(getRoundOf("0.166666"));
		
		//System.out.println(1d/3d);
	}
}

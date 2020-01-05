package hacker.problems;

public class TimeConversion {

	static String timeConversion(String s) {
        
		if(s.endsWith("PM")) {
			
			String[] split = s.replace("PM", "").split(":");
			
			String hh = split[0];
			if(hh.equals("12")) {
				return s.replace("PM", "");
			}else {
				int hr=Integer.parseInt(hh)+12;
				return String.valueOf(hr)+":"+split[1]+":"+split[2];
			}
			
		}else {
			String[] split = s.replace("AM", "").split(":");
			
			String hh = split[0];
			if(hh.equals("12")) {
				return "00"+":"+split[1]+":"+split[2];
			}else {
				return s.replace("AM", "");
			}
		}
    }
	
	public static void main(String[] args) {
		System.out.println(timeConversion("12:40:22AM"));
	}
}

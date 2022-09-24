package LeetCode.Strings;

public class DefangingIPAddress {

	public static void main(String[] args) {
		
		System.out.println(defangIPaddr("192.168.1.2"));

	}
	
	 public static String defangIPaddr(String address) {
	        
        String s1="";
        
        String[] arr = address.split("\\.");
        
        for(int i=0;i<arr.length-1;i++)
            s1 = s1 + arr[i] +"[.]";
        
        s1 = s1 + arr[arr.length-1];
        return s1;
	}

}

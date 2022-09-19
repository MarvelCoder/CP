package Crio.DSA1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MostFrequent {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Object[] ans = mostFrequent(s);
        System.out.println(ans[0] + " " + ans[1]);
        sc.close();
    }

    static Object[] mostFrequent(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        Set<Entry<Character, Integer>> entrySet = map.entrySet();

        int maxCount = 0;
        char maxChar = 0;

        for(Entry<Character, Integer> entry : entrySet)
        {
        	 if(entry.getValue() > maxCount)
             {
        		 maxCount = entry.getValue();
                 maxChar = entry.getKey();
        		
                 if(entry.getKey() > 64 && entry.getKey() < 91) {
        			 char ch = entry.getKey();
        			 ch = (char) (ch + 32);
        			 
        			 if(map.get(ch)!=null && map.get(ch)>=maxCount) {
        				 maxCount = entry.getValue();
                         maxChar = entry.getKey();
        			 }
        		 }
        	}
         }

        return new Object[]{maxChar,maxCount};
    
    }
}

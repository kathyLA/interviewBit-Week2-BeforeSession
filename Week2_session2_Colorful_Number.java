public class Solution {
    public int colorful(int a) {
        HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
        String s = Integer.toString(a);
        int length = 1;
        while(length <= s.length()) {
            for(int i=0; i< s.length(); i++) {
                if((i+length) <= s.length()) {
                    String subSequence =  s.substring(i,i+length);
                    int sum = 1;
	                   for(int k =0; k<subSequence.length(); k++ ){
                           sum = sum* (subSequence.charAt(k)-'0');
                       }
	                   if (map.containsKey(sum)) {
                           return 0;
                       }else {
                           map.put(sum,1);
                       }
                }else {
                    break;
                }
            }
            length ++;
        }     
        return 1;
    }
}

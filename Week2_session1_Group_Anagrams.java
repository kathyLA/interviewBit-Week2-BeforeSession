public class Solution {
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        LinkedHashMap<String, ArrayList<Integer>> map = new LinkedHashMap<String , ArrayList<Integer>>();
        
        for(int i=0; i< a.size() ; i++) {
	           char [] chararray = a.get(i).toCharArray();
	           Arrays.sort(chararray);
	           String key = new String(chararray);
	           ArrayList<Integer> list = map.get(key);
	           if (list == null) {
                   list = new ArrayList<Integer>();
                   map.put(key,list);
               }
	           list.add(i+1);
        }
        for(String key: map.keySet()) {
            result.add(map.get(key));
        }
        return result;
    }
    
}

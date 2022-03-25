package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Num49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(String stemp:strs){
            char[] chartemp = stemp.toCharArray();
            Arrays.sort(chartemp);
            String key = new String(chartemp);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(stemp);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}

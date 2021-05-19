package Anagrams;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public Anagram() {}

    // O(n)
    public boolean isAnagram(String s1, String s2) {

        s1 = trim(s1);
        s2 = trim(s2);
        Map<String, Integer> ang = new HashMap<>();
        String _char;

        for (int i = 1; i <= s1.length(); i++) {
            _char = s1.substring(i-1,i);
            ang.put(_char,ang.getOrDefault(_char,0)+1);
        }

        int _count;

        for (int i = 1; i <= s2.length(); i++) {
            _char = s2.substring(i-1,i);
            _count = ang.getOrDefault(_char,0)-1;
            if (_count < 0) return false;
            else ang.put(_char,_count);
        }

        for (Integer v : ang.values())
            if (v != 0) return false;

        return true;
    }

    // format: trim blank spaces and use all in lower case
    private static String trim(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\s", "");
        return s;
    }

}

package Anagrams;

import java.util.HashMap;
import java.util.Map;

public class AnagramTest {

    public static void main(String[] args) {

        Anagram a = new Anagram();

        String s1 = "aaataaaaatadtd";
        String s2 = "ddaaaaTTTaaaaa";
        System.out.println(a.isAnagram(s1,s2));


        //System.out.println(s.substring(1,2));
        //String s1 = "asa";
        //Map<String, Integer> aux = new HashMap<>();
        //aux.put(s1.substring(0,1),1);
        //aux.replace("a",aux.get("a")+1);

        //aux.put("e",2);
        //aux.put("e",1222);
        //System.out.println(aux.getOrDefault("e",0));
        //Integer c;

        //c = aux.getOrDefault("w",0) - 1;

        //System.out.println(c > 0);

    }

}

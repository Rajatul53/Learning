package org.example;

import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String args[]){
            System.out.println(isIsomorphic("foo","bar"));
        }
        public static boolean isIsomorphic(String s, String t) {
            HashMap<Character,Character> map = new HashMap<>();
            StringBuilder sb = new StringBuilder();
            for(int i =0;i<s.length();i++){
                if(map.containsKey(s.charAt(i)))
                    sb.append(map.get(s.charAt(i)));
                else
                    sb.append(t.charAt(i));
            }
            return t.equals(sb.toString());
        }
    }

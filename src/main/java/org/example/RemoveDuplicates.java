package org.example;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args){

        String a="abccddeeef";
        String res="";
        Set<Character> s=new HashSet<>();

        for(int i=0;i<a.length();i++){
            if(!s.contains(a.charAt(i))){
                s.add(a.charAt(i));
                res=res+a.charAt(i);
            }
        }

        System.out.println(res);

    }
}

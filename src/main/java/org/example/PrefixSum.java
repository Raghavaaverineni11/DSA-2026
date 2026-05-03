package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/// Keepin in Mind Just multiply left subarray Eith right Subarray
public class PrefixSum {

    public static List<Integer> productArray(List<Integer> arr){
        // 2 3 4 5
        // res=1 2 6 24
        List<Integer> res=new ArrayList<>();
        res.add(1);
        int prefix=1;
        for(int i=1;i<arr.size();i++)
        {
            prefix=prefix*arr.get(i-1);                //  For prefixArray
            res.add(prefix);

        }
         int suffix=1;
        for(int i=arr.size()-1;i>=0;i--){
            res.set(i,res.get(i)*suffix);              // Not creating suffix array just storing value of suffix array i suffix variable
            suffix=suffix*arr.get(i);
        }

        return res;


    }

    public static void main(String[] args){
        List<Integer> a= Arrays.asList(2,3,4,5,7,9);
        System.out.println(productArray(a));
    }


}

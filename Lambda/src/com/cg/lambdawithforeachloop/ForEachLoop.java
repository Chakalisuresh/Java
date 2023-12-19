package com.cg.lambdawithforeachloop;


import java.util.*;  
public class ForEachLoop{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
        
        System.out.println("names" + list);
        
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  
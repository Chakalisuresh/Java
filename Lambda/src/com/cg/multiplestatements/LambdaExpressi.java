package com.cg.multiplestatements;


interface Sayable{  
    String say(String message);  
}  
  
public class LambdaExpressi{  
    public static void main(String[] args) {  
      
        // You can pass multiple statements in lambda expression  
        Sayable person = (message)-> {  
            String str1 = "Hi, ";  
            String str2 = str1 + message;   
            return str2;  
        };  
            System.out.println(person.say("time is very precious."));  
    }  
}  
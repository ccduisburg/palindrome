package com.concon.palindrome;



public class PalindromeApplication {
    public static String reverse(String word) {
        String reverse="";
        String newword=word.trim();
        for (int i = newword.length() - 1; i >= 0; i-- ){
            reverse = reverse + word.charAt(i);}
        return reverse;
    }


    public static void main(String[] args) {
        String str="ababba kaka";
        int i=0;
        String rr= reverse(str);
        while (i < str.length()) {
            i++;
            if(rr.substring(0,i).equals(str.substring(0,i))&&i==rr.length()){
                System.out.println(i+" "+str.substring(0,i)+"="+rr.substring(0,i));
            }else if(i==rr.length()){
                System.out.println("Palindrome was not found");
            }
        }
    }



}

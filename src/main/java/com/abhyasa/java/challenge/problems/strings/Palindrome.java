package com.abhyasa.java.challenge.problems.strings;

public class Palindrome {
    /**
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
     * removing all non-alphanumeric characters, it reads the same forward and backward.
     * Alphanumeric characters include letters and numbers.
     *
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * Explanation: "amanaplanacanalpanama" is a palindrome.
     * **/
    public boolean isPalindromeForAlphaNumeric(String s) {
        boolean isPalindromeString = true;
        char[] strChar = s.toCharArray();
        for(int i=0, j=s.length()-1; i<j; i++, j--) {
            while(!Character.isLetterOrDigit(strChar[i]) && i<j) {
                i++;
            }
            while(!Character.isLetterOrDigit(strChar[j]) && j>i) {
                j--;
            }
            strChar[i] = Character.isUpperCase(strChar[i]) ? Character.toLowerCase(strChar[i]) : strChar[i];
            strChar[j] = Character.isUpperCase(strChar[j]) ? Character.toLowerCase(strChar[j]) : strChar[j];
            if(strChar[i]!=strChar[j]) {
                isPalindromeString = false;
                break;
            }
        }
        return isPalindromeString;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindromeForAlphaNumeric("race a car"));
    }
}

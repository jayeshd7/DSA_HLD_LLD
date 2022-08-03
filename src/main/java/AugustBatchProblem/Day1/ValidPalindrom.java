package AugustBatchProblem.Day1;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class ValidPalindrom {

    public static void main(String[] args) {
        String s = "a.";

        StringBuilder str = new StringBuilder("");
        StringBuilder strStart = new StringBuilder("");
        StringBuilder strLast = new StringBuilder("");

        for(int i = 0; i < s.length(); i++)
            if(Character.isLetterOrDigit(s.charAt(i))) {
                str.append((s.charAt(i) + "").toLowerCase());
            }

        if(str.length() <=2) {
            if(str.length() == 1) System.out.println("true");
            for(int i = 0;i<str.length()-1;i++){
                if(str.charAt(i) != str.charAt(i+1)) System.out.println("");
                else {
                    System.out.println();}
            }
        }

        int mid = str.length()/2;
        for(int i = 0; i< mid ;i++){
            strStart.append(str.charAt(i));
        }
        for(int i = str.length()-1; i>= mid+1 ;i--){
            strLast.append(str.charAt(i));
        }
        if(strStart.length() == strLast.length()){
            for(int i =0; i<strStart.length();i++){
                if(strStart.charAt(i) != strLast.charAt(i)){
                    System.out.println("not valid");
                }
                else {
                    System.out.println("valid");
                }
            }
        }else {
            System.out.println("not valid");
        }
        }

    }


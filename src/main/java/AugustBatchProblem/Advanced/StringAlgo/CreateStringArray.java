package AugustBatchProblem.Advanced.StringAlgo;

import java.util.regex.Pattern;

public class CreateStringArray {

    public static void main(String[] args) {

        String str = "Enter your name and address";

        String output = "";
        char ch;

        String my_pattern = "\\s";

        // Step 2: Create a pattern using compile method
        Pattern pattern = Pattern.compile(my_pattern);

        // Step 3: Create an array of strings using the
        // pattern we already defined
        String[] string_array = pattern.split(str);

        // Getting the Set of String

        for(int i = 0; i< string_array.length;i++){

            String value =string_array[i];
            if(value.length() %2 == 1){
                for(int j = value.length()-1; j>=0;j--){
                    ch= str.charAt(j); //extracts each character
                    output += ch;
                }
            }
            else {
                output += " ";
                output += string_array[i];
                output += " ";
            }

        }

        System.out.println(output);
    }
}

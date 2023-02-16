package a;

/*
Find common parent for given two childids
Given file containing the following format

childId:motherId:fatherid

1001:100:101
1002:200:201
1003:100:101
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Relationship {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter child id 1");
        String child1 = sc.nextLine();
        System.out.println("Enter child id 2");
        String child2 = sc.nextLine();
        findRelationship(child1,child2);
    }

    private static void findRelationship(String child1, String child2) throws IOException {
       BufferedReader br = new BufferedReader(new FileReader("src/main/java/a/input.txt"));

        for(String line; (line = br.readLine()) != null; ) {

            String[] split = line.split(":");
            if(split[0].equals(child1)){
                String mother1 = split[1];
                String father1 = split[2];
                for(String line2; (line2 = br.readLine()) != null; ) {
                    String[] split2 = line2.split(":");
                    if(split2[0].equals(child2)){
                        String mother2 = split2[1];
                        String father2 = split2[2];
                        if(mother1.equals(mother2) || father1.equals(father2)){
                            System.out.println("They are siblings");
                        }else {
                            System.out.println("They are not siblings");
                        }
                    }
                }
            }

        }

    }
}

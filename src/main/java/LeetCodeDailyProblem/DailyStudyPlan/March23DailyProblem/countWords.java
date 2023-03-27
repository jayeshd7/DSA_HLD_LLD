package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class countWords {

    public static void main(String[] args) {
        String s = "AX5550-132 #\n" +
                "AX5550-132 # show version\n" +
                "Product name:      MAS [licensed]\n" +
                "Product model:     FireEyeAX5550\n" +
                "Product release:   MAS (MAS) 9.0.2.925635\n" +
                "Build ID:          #925635\n" +
                "Build date:        2020-10-23 02:40:12\n" +
                "Build arch:        x86_64\n" +
                "Built by:          root@vta441\n" +
                "Version summary:   mas MAS (MAS) 9.0.2.925635 #925635 2020-10-23 02:40:12 x86_64 build@vta441:FireEye/9.0.2-denali-dev (eng)\n" +
                "Content Version:   1078.106\n" +
                " \n" +
                "Appliance ID:      AC1F6B1C3542\n" +
                "Host ID:           cbb4c049fa99\n" +
                "System serial num: FM1737QA04C\n" +
                "System UUID:       00000000-0000-0000-0000-ac1f6b1c3542\n" +
                "Asset Type:        Internal Fixed Asset (4)\n" +
                "Customer Name:     CHANDAN.KRISHNEGOWDA'S ORG 971211800 @ VPS2.FIREEYE.COM\n" +
                "Customer ID:       971211800\n" +
                " \n" +
                "Uptime:            4d 0h 30m 43.936s\n" +
                "CPU load averages: 0.06 / 0.08 / 0.09\n" +
                "Number of CPUs:    8\n" +
                "System memory:     7900 MB used / 56307 MB free / 64207 MB total\n" +
                "Swap:              2 MB used / 65534 MB free / 65536 MB total\n" +
                "AX5550-132 #\n" +
                "AX5550-132 #\n" +
                "AX5550-132 #";
        findKeyAndValue(s);
    }

    public static void findKeyAndValue(String s){
        StringBuilder sb = new StringBuilder(s);
        TreeMap<String, String> map = new TreeMap<>();
        String substring = sb.substring(0, sb.length() - 1);
        System.out.println(substring);
        String [] split = substring.split("\n");

        System.out.println("line by line " + Arrays.toString(split));

       for(int i = 0; i < split.length; i++) {
            if (split[i].contains(":")) {
                 String[] split1 = split[i].split(": ");

                 map.put(split1[0], split1[1]);

            }
        }

        System.out.println("key and value are:" + map);



    }
    }


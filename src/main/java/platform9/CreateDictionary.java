package platform9;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

/*


  Dict = {‘Jayesh’: 30, ‘Piyush’:37, ‘Amit’:15}

  {Zebra,Amit, Piyush}
  {z,e,b,r,a} , {a,m,i,t} , {p,i,y,u,s,h}




 */
public class CreateDictionary {
    public static void main(String[] args) {
        createDictionary();

    }

    private static void createDictionary() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Zebra", 30);
        map.put("Piyush", 37);
        map.put("Amit", 15);
        for (int i = 0; i<map.size(); i++) {
            Map.Entry<String, Integer> entry = map.entrySet().stream().sorted(comparingByValue()).collect(Collectors.toList()).get(i);
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }
}

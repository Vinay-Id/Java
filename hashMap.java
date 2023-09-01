import java.util.HashMap;

public class hashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println(map);
        for (String i : map.keySet()) {
            System.out.println("key: " + i + " values: " + map.get(i));
        }
    }
}

package map;

import java.util.HashMap;

/**
 * @Classname HashMapTest
 * @Description TODO
 * @Date 2023/11/10 17:56
 * @Author ywh
 */
public class HashMapTest {

    public static void main(String[] args) {
        String key = "1";
        System.out.println(key.hashCode());
        int h;
        int a =  (h = key.hashCode()) ^ (h >>> 16);
        System.out.println(h + "");
        System.out.println(a);


        HashMap<String, String> map = new HashMap<>();
        map.put("1", "yangtao");


    }
}

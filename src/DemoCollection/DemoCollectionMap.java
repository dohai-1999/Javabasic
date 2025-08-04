package DemoCollection;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {

        //Khai báo kiểu dữ liêu map
        //KHông lưu đuọc 2 key trùng lặp
        Map<String, String> map1 = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();

        //Thêm dữ liệu

        map1.put("language", "Java");
        map1.put("framework", "TestNG");
        map1.put("library", "Selenium");
        //Update value
        map1.put("library", "Playwight");

        map2.put(1, 111D);
        map2.put(2, 222D);

        System.out.println("Map1:"+map1);
        System.out.println("Map2:"+map2);

        System.out.println(map1.containsKey("language"));
        System.out.println(map1.containsValue("language"));
        map1.remove("library");

        //Duyệt kiêu dữ liệu Map
        //Get hết giá trị của key và value
        for (Map.Entry<String, String> entry : map1.entrySet()) {  //for cải tiến
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

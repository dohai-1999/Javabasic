package DemoCollection;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {

        //Khai báo kiểu dữ liệu Set
        Set<String> menu = new HashSet<>();

        //Thêm dữ liệu
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Tasks");
        menu.add("Sales");
        menu.add("Project");
        menu.add("Project");

        System.out.println(menu.contains("Task"));
        menu.remove("Sales");
        System.out.println("Size: "+menu.size()); //.size() là trả số phần tử trong danh sách

        System.out.println("Các phần tử của Set");
        System.out.print("\t" + menu + "\n");

        System.out.println("\n==========");

        //Duyệt giá trị trong set
        // Show set through Iterator
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        // Show set through for-each
        System.out.println("\n==========");
        for (String obj : menu) {  // for cải tiến
            System.out.print(obj + ", "); //println là xuống dòng
        }


    }
}

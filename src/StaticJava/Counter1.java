package StaticJava;

public class Counter1 {
    int count = 0; // sẽ lấy bộ nhớ mới khi khởi tạo lại class or khi gọi lại biến này

    Counter1() {
        count++;
        System.out.println(count);
    }


    public static void main(String args[]) {

        Counter1 c1 = new Counter1();// Khởi tạo lần 1
        Counter1 c2 = new Counter1();// Khởi tạo lần 2
        Counter1 c3 = new Counter1();// Khởi tạo lần 3

    }
}

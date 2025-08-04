package StaticJava;

public class Counter2 {
    static int count = 0; // sẽ lấy bộ nhớ mới khi khởi tạo lại class or khi gọi lại biến này

    Counter2() {
        count++;
        System.out.println(count);
    }


    public static void main(String args[]) {

        Counter2 c1 = new Counter2();// Khởi tạo lần 1
        Counter2 c2 = new Counter2();// Khởi tạo lần 2
        Counter2 c3 = new Counter2();// Khởi tạo lần 3

    }
}

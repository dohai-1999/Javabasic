public class Bien {

    String address = "Can Tho"; // Đây là biên toàn cuục

    static String phone = "0998823848"; // Đây l biến static
    // Hàm thứ nhất
    public void sayHello(){
        int n = 10;       // Đây là biến cục bộ
        System.out.println("Gia tri cua n la:"+n);
        //System.out.println(name);
    }

    //Hàm thứ hai
    public void getInfo(){
        System.out.println(address);
        //System.out.println(n);
    }

    public static void main(String[] args) {

        //cach thuc de goi mot thanh phan trong 1 class vao 1 ham bat ky
        Bien bien = new Bien();
        System.out.println( bien.address); //khai báo đôi tuong class

        //System.out.println(address);
        System.out.println(phone);

        int number1 = 123456;   // biến cục bộ
        int number2 = 789;

        String name = "Nhung";
        String ten = "Linh";
        String email = "admin@example.com";

        // In giá trị của biến ra màn hình
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(name);
        System.out.println(ten);

    }
}

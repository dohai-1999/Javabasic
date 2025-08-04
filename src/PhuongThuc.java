public class PhuongThuc {
    double sum;  // biến toàn cục
    double res;

    //hàm KHÔNG trả về kết quả- không có tham số
    public void cong2so() {
        int a = 5;
        int b = 10;
        sum = a + b;
        System.out.println(sum);
    }

    //Hàm có tham số
    public void cong2so(int number1, int number2) {
        System.out.println("Tính tổng hàm có tham số: " + (number1 + number2));
    }

    //hàm KHÔNG trả về kết quả- không có tham số
    public void loginCRM() {
        System.out.println("Navigate to url ");
        System.out.println("Enter email and password");
        System.out.println("Click Login button");
        System.out.println("Verify login success");
    }

    public void addNewCustomer() {
        //code auto để add new 1 customer
    }


    // Hàm có trả về kết quả
    public double nhan2so() {
        int a = 5;
        int b = 10;
        res = a * b;
        return res;
    }

    public long nhan3So(int a, int b, int c) {
        //System.out.println(a*b*c);
        return a * b * c;
    }

    public static void main(String[] args) {
        PhuongThuc phuongThuc = new PhuongThuc();
        phuongThuc.cong2so();
        phuongThuc.nhan2so();
        System.out.println(phuongThuc.nhan2so());
        System.out.println(phuongThuc.nhan2so() + 10);
        phuongThuc.cong2so(20, 50);
        System.out.println(phuongThuc.nhan3So(2,5,10));
        //phuongThuc.nhan3So(2,5,10);
        //System.out.println(phuongThuc.cong2so()+5); // hàm này không trả về vì là hàm void

        phuongThuc.loginCRM();
    }
}

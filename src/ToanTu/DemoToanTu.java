package ToanTu;

public class DemoToanTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        double d, e, f;
        d = e = f = 100;

        // Toán tử số học
        System.out.println("a/b = " + (a / b));
        System.out.println("a%b =" + (a % b));
        System.out.println(a++); // 10 a=a+1  đang tăng giá trị lên 1 để cho lần sau dùng
        System.out.println(a); // 11
        System.out.println("a = " + (a += 5)); // 16

        // Toán tử so sánh và logic
        System.out.println("So sánh a > b: " + (a > b));
        System.out.println("So sánh and: " + ((a > b) && (b > c)));
        System.out.println("So sánh or: " + ((a > b) || (b > c)));

        System.out.println("So sánh or: " + (((a<b)&&(b>c))||((a<b)&&(a<c))));

    }
}

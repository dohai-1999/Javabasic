package Arrays;

public class DemoMang2 {
    public static void main(String[] args) {

        //Khai báo và gán giá trị
        int number2[] = {5, 7, 10, 20, 30};  //không cần ch định kích cỡ mảng ban đầu

        number2[2] = 100;

        System.out.println("Lenght: " + number2.length); //.length trả số phần t trong mảng
        System.out.println(number2[4]);
        System.out.println("===========");

        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }

        String dataCustomerName[]={"Hoa","Hồng", "Huệ"};
        System.out.println(dataCustomerName[0]); //Test lần 1
        System.out.println(dataCustomerName[1]); //Test lần 2
        System.out.println(dataCustomerName[2]); //Test lần 3

        boolean check = true; // tạo biến trung gian để kiểm tra
        for (int i = 0; i < dataCustomerName.length; i++) {
            if (dataCustomerName[i].equals("Huệ")){
                check = true;
                break;
            }else {
                check = false;
            }
            //System.out.println(dataCustomerName[i]);
        }
        if(check==true){
            System.out.println("TÌM THẤY");
        }else {
            System.out.println("Không tìm thấy");
        }
    }
}

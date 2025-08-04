package Arrays;

public class DemoMang1 {
    public static void main(String[] args) {

        //khai báo mảng rỗng, chưa mang giá tr
        int number1[] = new int[6];

        //Gán giá trị cho mảng
        number1[0] = 40;
        number1[1] = 20;
        number1[2] = 30;
        number1[3] = 5;
        number1[4] = 10;
        number1[5] = 99;

        System.out.println("Độ dài mảng:"+number1.length);

        //Duyệt mảng để lấy giá trị
        for (int i = 0; i < number1.length; i++) { //for basic có thể duyêt theo vị trí chỉ đích để chủ động giới hạn 1 khoảng nào đ
            System.out.println(number1[i]); //ếu c giá trị thì in ra còn k có giá trị th ấy giá trị mặc định cảu kiêểu dữ liê

        }

        for (int i = 3; i < 5; i++) {
            System.out.println(number1[i]);

        }

        System.out.println("===============");
        for (int number:number1){ //for cải tiến k giới hạn được sẽ duyệt  từ đầu đến cuối
            System.out.println();
        }
    }
}

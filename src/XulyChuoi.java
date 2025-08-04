public class XulyChuoi {
    public static void main(String[] args) {

        String s1 = "Lorem ipsum dolor sit amet consectetur adipiscing elit.";
        String s2 = "Quisque faucibus ex sapien vitae pellentesque sem placerat. ";
        String s3= "    Test auto     ";

        //Cắt chuỗi
        System.out.println(s1.substring(10));
        System.out.println(s1.substring(6, 11));

        //Ghép chỗi
        System.out.println(s1 + "---" + s2);

        //Chuyển kiểu in hoa thường
        System.out.println(s2.toLowerCase());// chuyển về chữ thường
        System.out.println(s2.toUpperCase());// chuyển về chữ in hoa

        //Xoá kí tự khoảng trắng 2 đầu
        System.out.println(s3.trim());

        //Độ dài chuỗi

        System.out.println("Độ dài chuỗi"+s2.length());

        //Tìm kiếm ki tự
        System.out.println(s1.charAt(6));

        //Tìm kiếm vị trí
        System.out.println(s1.indexOf("m"));

        //So sánh chuỗi
        String s4 ="Test auto";
        String s5 ="test auto";

        System.out.println(s3.equals(s4)); // so sánh bằng
        System.out.println(s4.contains("Test1")); // so sánh chuỗi

        //So sánh bỏ qua hoa thường
        System.out.println(s4.equalsIgnoreCase(s5));

    }
}

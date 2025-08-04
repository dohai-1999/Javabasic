public class SwitchCase2 {
    public static void main(String[] args) {

        String brower ="  Firefox";
        //hàm toLowerCase() dùng chuyển chuỗi về chữ thường
        //hàm toUpperCase() dùng chytển chuỗi ề chữ in hoa
        //hàm trim() dùng để cắt bỏ khoẳng trắng 2 àầu của chuỗi
        switch (brower.trim().toLowerCase()){
            case "Chrome":
                System.out.println("Chạy test với trình duyệt Chrome");

            case"edge":
                System.out.println("Chạy test với trình duyệt Edge");

            case"firefox":
                System.out.println("Chạy test với trình duyệt Firefox");

            default:
                System.out.println("Chạy test với trình duyệt Chrome mặc định");
                break;
        }
    }
}
//Khi không có break thì sẽ đi kiểm tra từng case nếu gặp case không thoả mãn
// thì sẽ ktra đk tiếp, còn nếu thoả mãn thì sẽ chạy qua và in ra ở các case tiếp theo mà k cần ktra đk nữa

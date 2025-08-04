package StaticJava;

public class WebUI {
    // Khai báo biến toàn cục để lưu gtr  chung
    public static String url = "https://crm.anhtester.com/admin/authentication";
    public static String email = "admin@example.com";
    public static String password = "123456";

    // KHai báo hàm xlý chung
    public static void openURL(String url){
        System.out.println(url);
    }
    public static void clickElement(String elementName){
        System.out.println("Click element:"+elementName);
    }
    public static void setText(String text){
        System.out.println("Set text:"+text);
    }
    public static String getElementText(){
        return "text";
    }

    //Gọi trực tiếp
    public static void main(String[] args) {
        openURL(url);
        setText(email);
        setText(password);
        clickElement("Login button");
    }
}

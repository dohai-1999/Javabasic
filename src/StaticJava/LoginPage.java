package StaticJava;

// Ở nơi khác thì gọi class chấm gọi và k cần khởi tạo
public class LoginPage {
    public static void main(String[] args) {
        WebUI.openURL("https://crm.anhtester.com/admin/authentication");
        WebUI.setText(WebUI.email);
        WebUI.setText(WebUI.password);
        WebUI.clickElement("");
    }
}

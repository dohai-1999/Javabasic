package VongLapFor;

public class DemoForCaiTien {
    public static void main(String[] args) {
        int arr[] = {12, 23, 44, 56, 78};
        for (int i : arr) {
            System.out.println(i);
        }

        //vòng for thuần tuý
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        String menu[] = {"dashboard", "customer", "project", "task"};
        for (String menuName : menu) {
            System.out.println(menuName);
        }
    }
}

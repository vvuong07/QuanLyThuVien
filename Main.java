import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho va ten cua ban: ");
        String hoTen = sc.nextLine();

        System.out.println("Ho va ten cua ban la: " + hoTen);
    }
}
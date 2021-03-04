import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so thu nhat:");
        int number1 = scanner.nextInt();
        System.out.println("Nhap so thu hai: ");
        int number2 = scanner.nextInt();
        int sum = number1+number2;
        System.out.println("Tong cua 2 so la: " +sum);
    }
}

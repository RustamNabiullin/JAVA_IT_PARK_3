import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
		for (int i = 0; i < 999; i++) {
		int x = scanner.nextInt();
			if (x<=1000){
				sum1 = sum1 + x;
			}
			else {
				sum1 = sum1;
			}
		}
		int y = 0;
		for (int i = 0; i < 1000; i++) {	
			if (y<=1000) {
				y = y + 1;
				sum2 = sum2 + y;
			}
			else {
				sum2 = sum2;
			}
		}
		int z =  sum2 - sum1;
            System.out.println("Otvet: " + z);
    }
}
package day1_homework_15;

public class Main {

	public static void main(String[] args) {
		
		// Girilen Sayi Asal Mi
		int number = -1;
		
		if (number<0) {
			System.out.println("0 Dan Buyuk Pozitif Sayi Giriniz");
		}else if (number<2) {
			System.out.println("2 Den Kucuk Sayi Giremezsiniz");
		}else {
			boolean isPrime = true;
			
			for (int i = 2 ; i < number ; i++) {
				if (number % i == 0) {
					isPrime = false;
				}
			}
			
			if (isPrime) {
				System.out.println("Sayi Asaldir");
			}else {
				System.out.println("Sayi Asal Degildir");
			}
		}
	}
}
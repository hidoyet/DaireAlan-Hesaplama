package daireAlaniHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// daire alan�n� hesaplayan program
		
		Scanner scanner=new Scanner(System.in);
		double pi,alan,yaricap;
		int derece;
		pi=3.14;
		System.out.println("Dairenin yar��ap�n� giriniz");
		yaricap=scanner.nextDouble();
		System.out.println("Dairenin alan�n� hesaplamak istedi�iniz derecesinizi giriniz");
		derece=scanner.nextInt();
		alan=(pi*(yaricap*yaricap)*derece)/360;
		System.out.println("Girdi�iniz daire diliminin alan�:" + alan);
	}

}

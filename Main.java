package daireAlaniHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// daire alanýný hesaplayan program
		
		Scanner scanner=new Scanner(System.in);
		double pi,alan,yaricap;
		int derece;
		pi=3.14;
		System.out.println("Dairenin yarýçapýný giriniz");
		yaricap=scanner.nextDouble();
		System.out.println("Dairenin alanýný hesaplamak istediðiniz derecesinizi giriniz");
		derece=scanner.nextInt();
		alan=(pi*(yaricap*yaricap)*derece)/360;
		System.out.println("Girdiðiniz daire diliminin alaný:" + alan);
	}

}

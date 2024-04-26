package javabasic;

public class LoopExer {

	public static void main(String[] args) {

		// 별찍기 1
		//*
		//**
		//***
		//****
		//*****
		for (int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 별찍기 2
		//oooo*
		//ooo**
		//oo***
		//o****
		//*****
		for (int i=0; i<5; i++) {
			for (int k=0; k<4-i; k++) {
				System.out.print("o");
			}
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 별찍기 3
		//*****
		//****
		//***
		//**
		//*
		for (int i=5; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 별찍기 4
		//*****
		//*ooo*
		//*ooo*
		//*ooo*
		//*****
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i%4==0 || j%4==0) {
					System.out.print("*");
				} else {
					System.out.print("o");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 별찍기 5
		//*****
		//**o**
		//*o*o*
		//**o**
		//*****
//		for (int i=0; i<5; i++) {
//			for (int j=0; j<5; j++) {
//				if (i%4==0 || j%4==0 || i==j || i*j==3) {
//					System.out.print("*");
//				} else {
//					System.out.print("o");
//				}
//			}
//			System.out.println();
//		}
		
//		int keynum = 4;
//		for (int i=0; i<keynum+1; i++) {
//			for (int j=0; j<keynum+1; j++) {
//				if (i%keynum==0 || j%keynum==0) {
//					System.out.print("*");
//				} else {
//					System.out.print("o");
//				}
//			}
//			System.out.println();
//		}
//		
		System.out.println();
		
		// 별찍기 6
		//*****
		//ooo*o
		//oo*oo 
		//o*ooo  
		//*****
//		int keynum = 4;
//		for (int i=0; i<keynum+1; i++) {
//			for (int j=0; j<keynum+1; j++) {
//				if (i%keynum==0 || i+j==keynum) {
//					System.out.print("*");
//				} else {
//					System.out.print("o");
//				}
//			}
//			System.out.println();
//		}
		
		System.out.println();

		
		// 별찍기 7
		//*ooo*
		//*ooo*
		//***** 
		//*ooo*
		//*ooo*
//		int keynum = 4;
//		for (int i=0; i<keynum+1; i++) {
//			for (int j=0; j<keynum+1; j++) {
//				if (j%keynum==0 || i==keynum/2) {
//					System.out.print("*");
//				} else {
//					System.out.print("o");
//				}
//			}
//			System.out.println();
//		}
		
		System.out.println();
		
		
		// 별찍기 8 (다이아몬드)
		//oo*oo
		//o***o
		//***** 
		//o***o
		//oo*oo
		int keynum = 4;
		for (int i=0; i<keynum+1; i++) {
			for (int j=0; j<keynum+1; j++) {
				if (i==keynum/2 || j==keynum/2) {
					System.out.print("*");
				} else {
					System.out.print("o");
				}
			}
			System.out.println();
		}
		
		
	} // main

} // class

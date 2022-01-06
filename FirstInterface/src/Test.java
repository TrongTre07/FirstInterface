import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		CasioFX casio = new CasioFX();
		VinacalVX vinacal = new VinacalVX();

//		System.out.println("Test a");
//		System.out.println("Addition of Casio: " + casio.addition(12, 11));
//		System.out.println("Addtion of Vinacal: " + vinacal.addition(11, 12));
//
//		System.out.println("Test b");
//		double a[] = new double[] { 2, 7, 9, 1, 5, 7, 8, 2, 4 };
//		InsertionSort insertionSort = new InsertionSort();
//		BubbleSort bubbleSort = new BubbleSort();
//		System.out.println("Sort Descending:");
//		System.out.println("INSERTION SORT:");
//		insertionSort.sortDescending(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
//		System.out.println("BUBBLE SORT:");
//		bubbleSort.sortDescending(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}

		double b[] = new double[] { 1, 5, 8, 2, 5, 7, 1 };
		AppCalculation app = new AppCalculation();
		System.out.println("Addition: " + app.addition(11, 12));
		System.out.println("Sort Descending:");
		app.sortDescending(b);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("Sort Up Ascending:");
		app.sortUpAscending(b);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}

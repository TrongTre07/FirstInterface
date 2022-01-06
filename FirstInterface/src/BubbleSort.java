
public class BubbleSort implements Sort{

	@Override
	public void sortDescending(double[] a) {
		int n= a.length;
		boolean haveSwap= true;
		for (int i=0; i<n-1; i++) {
			haveSwap = false;
			for (int j=0; j<n-i-1; j++) {
				if (a[j]>a[j+1]) {
					double swap= a[j+1];
					a[j+1]=a[j];
					a[j]=swap;
					haveSwap = true;
				}
				if(haveSwap=false) {
					break;
				}
			}
		}
		
	}

	@Override
	public void sortUpAscending(double[] a) {
		int n= a.length;
		boolean haveSwap= true;
		for (int i=0; i<n-1; i++) {
			haveSwap = false;
			for (int j=0; j<n-i-1; j++) {
				if (a[j]<a[j+1]) {
					double swap= a[j+1];
					a[j+1]=a[j];
					a[j]=swap;
					haveSwap = true;
				}
				if(haveSwap=false) {
					break;
				}
			}
		}
		
	}

}

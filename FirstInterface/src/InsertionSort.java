
public class InsertionSort implements Sort{

	@Override
	public void sortDescending(double[] a) {
		int n= a.length;
		int j;
		double check;
		for (int i=1; i<n; i++) {
			check=a[i];
			j=i-1;
			
			while (j>=0 && a[j]<check) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=check;
		}
	}

	@Override
	public void sortUpAscending(double[] a) {
		int n= a.length;
		int j;
		double check;
		for (int i=1; i<n; i++) {
			check=a[i];
			j=i-1;
			
			while (j>=0 && a[j]>check) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=check;
		}
		
	}

}

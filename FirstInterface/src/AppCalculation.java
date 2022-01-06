
public class AppCalculation implements MayTinhBoTuiInterface, Sort {

	@Override
	public double addition(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double subtraction(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double multiplication(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double division(double a, double b) {
		// TODO Auto-generated method stub
		return a / b;
	}

	@Override
	public void sortDescending(double[] a) {
		int n= a.length;
		int j;
		double key;
		for (int i=1; i<n; i++) {
			key=a[i];
			j=i-1;
			
			while (j>=0 && a[j]<key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

	@Override
	public void sortUpAscending(double[] a) {
		int n= a.length;
		int j;
		double key;
		for (int i=1; i<n; i++) {
			key=a[i];
			j=i-1;
			
			while (j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		
	}

	
	

}

package lab1;

public class jhk implements jhh {
	@Override
	public int add(int n, int m) {
		return n+m;
	}
	@Override
	public float div(int n, int m) {
		if(n!=0) {
			return (float) n/m;
		}
		else {
			return 0;
		}
	}

}


public class MyClass1<T> {
	private T var1;
	private T var2;
	private int x;
	
	public MyClass1() {
		
	}
	
	public MyClass1(T var1, T var2, int x) {
		this.var1 = var1;
		this.var2 = var2;
		this.x = x;
	}

	public T getVar1() {
		return var1;
	}

	public void setVar1(T var1) {
		this.var1 = var1;
	}

	public T getVar2() {
		return var2;
	}

	public void setVar2(T var2) {
		this.var2 = var2;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
	
	
}

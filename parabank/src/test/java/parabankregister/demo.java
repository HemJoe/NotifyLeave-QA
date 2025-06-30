package parabankregister;

public class demo {
	int b= 5; 
	
	void addtwonum(int a,int b) {
		System.out.println(a+this.b);
		
	}
	
	public static void main(String[] args) {
		demo san = new demo();
		san.addtwonum(10, 15);
		
	}

}

package express;

public record Point(int x, int y) implements A, B, C {

	public void callAll() {
		this.printA();
		this.printB();
		C.super.printC();
	}

//	public static void main(String[] args) {
////		Point p = new Point(10, 20);
////		p.callAll();
//		System.out.println("Hello\rWorld");
//		System.out.println("jkhd");
//	}
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i <= 5; i++) {
		    System.out.print("\rCount: " + i);
		    Thread.sleep(500);
		}
	}
}

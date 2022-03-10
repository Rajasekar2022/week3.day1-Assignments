package week3.day1.org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop Size - Desktop");
	}
	
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopSize();
		d.computerModel();
	}

}

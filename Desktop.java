package week3.Day2;

public class Desktop implements Hardware, Software{
	public void desktopModel() {
		System.out.println("ASUS");
		System.out.println("Lenovo");
		System.out.println("MAC"); 
	}
	public void hardwareResources() {
		System.out.println("Keyboard");
		System.out.println("Mouse");
		System.out.println("CPU");
	}
	public void softwareResources() {
		System.out.println("Windows");
		System.out.println("MS Office");
		System.out.println("Eclipse");
	}
	public static void main(String[] args) {
		
		Desktop D = new Desktop();
		System.out.println("Dektop--------");
		D.desktopModel();
		System.out.println("Hardware------------");
		D.hardwareResources();
		System.out.println("Softwares----------");
		D.softwareResources();
		
	}
	
}

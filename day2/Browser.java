package week1.day2;

public class Browser {

	public String launchBrowser(String browserName) {
		return browserName;
		
	}
	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser SS=new Browser();
		String launchBrowser = SS.launchBrowser("Browser launched successfully");
		System.out.println(launchBrowser);
		SS.loadUrl();
	}

}

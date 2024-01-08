package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser Obj=new Browser();
		String launchBrowser = Obj.launchBrowser("Browser launched successfully");
		System.out.println(launchBrowser);
		Obj.loadUrl();
	}

}

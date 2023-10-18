package trainingMO.day1;

public class SwitchDemo {

	public static void main(String[] args) {
	String browser="";
	switch(browser){
		case "IE" :
		System.out.println("Launch IE browser");
		break;
		case "firefox":
			System.out.println("Launch firefox browser");
			break;
		case "Chrome":
			System.out.println("Launch Chrome browser");
			break;
		case "Edge":
			System.out.println("Launch Edge browser");
			break;
			default :
			System.out.println("No Browser mentioned");
			break;
	}
	
	

	}

}

package rays.com.Test;

import java.util.ResourceBundle;

public class TestApp {
	public static void main (String []args) {
		ResourceBundle rb =  ResourceBundle.getBundle("com.rays.Bundle.app");
		
		System.out.println(rb.getString("Driver"));
		System.out.println(rb.getString("url"));
		System.out.println(rb.getString("user"));
		System.out.println(rb.getString("password"));
		//System.out.println(rb.getString("Initial"));
		System.out.println(Integer.parseInt(rb.getString("initail")));
	}

}

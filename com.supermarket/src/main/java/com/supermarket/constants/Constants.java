package com.supermarket.constants;

public class Constants {

	public static final String CONFIGURE_FILE_PATH = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\configure.properties";
	public static final String EXTENT_REPORT = System.getProperty("user.dir") + "\\ExtentReport";
	public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir") + "\\ScreenShots\\";

	// **loginpage**//
	public static final String expectedRememberMeText = "Remember Me";
	public static final String EXPECTEDUSERNAME = "Admin";
	public static final String INVALIDUSERALERT = "Invalid Username/Password";

	// **homepage**//
	public static final String expectedBoxOneText = "Manage Pages";
	public static final String expectedColorOfBox1 = "rgba(0, 0, 0, 0)";
	public static final String expectedLinkurl = "https://groceryapp.uniqassosiates.com/admin/list-page";
	public static final String expectedManageContentPageText = "List Pages";

	// ** managecontent**//
	public static final String EXPECTEDPRODUCT = "Noodles";

	// **manageorders**//
	public static final String EXPECTEDSTATUS = "OUT FOR DELIVERY";
	public static final String EXPECTEDDATEUPDATESTATUS = "Delivery Date Updated Successfully";
}

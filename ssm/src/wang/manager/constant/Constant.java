package wang.manager.constant;


public class Constant {
	public static final String XConfigPath = "Config/XConfig.config";
	public static final String WEBROOTPATH = Constant.class
	.getProtectionDomain().getCodeSource().getLocation().getPath()
	.indexOf("WEB-INF") > 0 ? Constant.class
	.getProtectionDomain()
	.getCodeSource()
	.getLocation()
	.getPath()
	.substring(
			0,
			Constant.class.getProtectionDomain().getCodeSource()
					.getLocation().getPath().indexOf("WEB-INF/classes"))
	: Constant.class.getProtectionDomain().getCodeSource()
			.getLocation().getPath();
}

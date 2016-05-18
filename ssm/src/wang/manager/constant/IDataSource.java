package wang.manager.constant;

import java.lang.annotation.*;

@Target( { ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IDataSource {
	String name() default IDataSource.master;
	
	public static String master = "MYSQL";

	public static String slave1 = "MYSQL2";

}

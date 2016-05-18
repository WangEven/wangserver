package wang.manager.util;

public class DataSourceSwitchUtil {
	// / 定义数据源标识,和applicationContext.xml中 DataSources 的 targetDataSources 的key对应
	public static final String MYSQL = "MYSQL";
	public static final String ORACLE = "ORACLE";
	private static final ThreadLocal contextHolder = new ThreadLocal();
	public static void setDataSourceType(String dataSourceType) {
		contextHolder.set(dataSourceType);
	}

	public static String getDataSourceType() {
		return (String) contextHolder.get();
	}

	public static void clearDataSourceType() {
		contextHolder.remove();
	}
}

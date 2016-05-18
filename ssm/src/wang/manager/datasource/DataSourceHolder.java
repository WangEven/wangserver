package wang.manager.datasource;

import org.aspectj.lang.JoinPoint;

public class DataSourceHolder implements IDataSourceHolder {
	// 线程本地环境
	private static final ThreadLocal<String> dataSources = new ThreadLocal<String>();

	// 清除数据源
	public void clear() {
		dataSources.remove();
	}

	// 获取数据源
	public String get() {
		return dataSources.get();
	}

	// 还原数据源
	public void restore(JoinPoint join) {
		dataSources.set(DEFAULT_SOURCE); // 设置null数据源
	}

	// 设置数据源
	public void set(String source) {
		dataSources.set(source);
	}
}

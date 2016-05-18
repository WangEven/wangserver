package wang.manager.datasource;

import java.sql.SQLFeatureNotSupportedException;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


/**
 * 数据源切换 依赖于spring配置
 * 
 * */
public class DynamicDataSource extends AbstractRoutingDataSource {
	private DataSourceHolder dataSourceHolder;
	@Override
	protected Object determineCurrentLookupKey() {
		return this.dataSourceHolder.get();
	}

	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	// 设置默认的数据源
	@Override
	public void setDefaultTargetDataSource(Object defaultTargetDataSource) {
		super.setDefaultTargetDataSource(defaultTargetDataSource);
	}

	// 设置数据源集合.
	@Override
	public void setTargetDataSources(Map targetDataSources) {
		super.setTargetDataSources(targetDataSources);
	}
}

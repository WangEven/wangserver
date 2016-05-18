package wang.manager.util;

import wang.manager.constant.Constant;
import wang.manager.entity.WangConfig;

public class WeblogicUtil {
	private static long lastUpdateConfigTime = System.currentTimeMillis() - 100;
	private static WangConfig wc;

	// 获取配置文件信息
	public static WangConfig getConfig() {
		try {
			if (null == wc
					|| (lastUpdateConfigTime + 2 * 60 * 1000) < System
							.currentTimeMillis()) {
				wc = XmlUtil.xmlFileToBean(Constant.WEBROOTPATH
						+ Constant.XConfigPath, WangConfig.class, "UTF-8");
				lastUpdateConfigTime = System.currentTimeMillis();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return wc;
	}
}

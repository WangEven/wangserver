package wang.manager.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;


import wang.manager.util.RedisUtil;
import wang.manager.util.WeblogicUtil;

public class InitConfigServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3119960606241254686L;
	private static Logger log = Logger.getLogger(InitConfigServlet.class);
	public InitConfigServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void init() throws ServletException {
		// Put your code here
		try {
			// 初始化配置文件
			if(WeblogicUtil.getConfig().getRedisCacheIP().length() > 0){
				log.info("get redisip correctly : " + WeblogicUtil.getConfig().getRedisCacheIP());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			RedisUtil.initPool();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

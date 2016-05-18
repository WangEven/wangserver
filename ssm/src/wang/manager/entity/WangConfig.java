package wang.manager.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("WangConfig")
public class WangConfig {
	private String redisCacheIP = "";
	private int redisCachePort = 0;
	private int redisCacheTimeOut = 0;
	private int redisCacheTime = 0;
	/**
	 * @return the redisCacheIP
	 */
	public String getRedisCacheIP() {
		return redisCacheIP;
	}
	/**
	 * @param redisCacheIP the redisCacheIP to set
	 */
	public void setRedisCacheIP(String redisCacheIP) {
		this.redisCacheIP = redisCacheIP;
	}
	/**
	 * @return the redisCachePort
	 */
	public int getRedisCachePort() {
		return redisCachePort;
	}
	/**
	 * @param redisCachePort the redisCachePort to set
	 */
	public void setRedisCachePort(int redisCachePort) {
		this.redisCachePort = redisCachePort;
	}
	/**
	 * @return the redisCacheTimeOut
	 */
	public int getRedisCacheTimeOut() {
		return redisCacheTimeOut;
	}
	/**
	 * @param redisCacheTimeOut the redisCacheTimeOut to set
	 */
	public void setRedisCacheTimeOut(int redisCacheTimeOut) {
		this.redisCacheTimeOut = redisCacheTimeOut;
	}
	/**
	 * @return the redisCacheTime
	 */
	public int getRedisCacheTime() {
		return redisCacheTime;
	}
	/**
	 * @param redisCacheTime the redisCacheTime to set
	 */
	public void setRedisCacheTime(int redisCacheTime) {
		this.redisCacheTime = redisCacheTime;
	}
	
}

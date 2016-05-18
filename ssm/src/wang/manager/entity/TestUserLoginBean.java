package wang.manager.entity;

import java.io.Serializable;

public class TestUserLoginBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4831720213733548153L;
	private Integer userid; // 用户id
	private String username; // 用户名
	private String userpassword; // 用户密码

	/**
	 * @return the userid
	 */
	public Integer getUserid() {
		return userid;
	}

	/**
	 * @param userid
	 *            the userid to set
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the userpassword
	 */
	public String getUserpassword() {
		return userpassword;
	}

	/**
	 * @param userpassword
	 *            the userpassword to set
	 */
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

}

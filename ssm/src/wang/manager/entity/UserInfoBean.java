package wang.manager.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class UserInfoBean implements Serializable {
	/**
	 * 
	 */
	public static UserInfoBean getDefaultBean() {
		UserInfoBean defaultBean = new UserInfoBean();
		defaultBean.setNormalAccount("Guest");
		defaultBean.setID(0L);
		return defaultBean;
	}
	private static final long serialVersionUID = -4933972645854159466L;
	@JsonProperty("ID")
	private Long ID; // 帐号ID
	@JsonProperty("NormalAccount")
	private String NormalAccount; // 帐号
	@JsonProperty("GamePassword")
	private String GamePassword; // 密码(MD5)
	@JsonProperty("EnableTime")
	private Integer EnableTime; // 封禁日期
	@JsonProperty("WebCash")
	private float WebCash; // 当前金钱
	@JsonProperty("LockCash")
	private float LockCash; // 被锁住的金钱
	@JsonProperty("TotalCash")
	private float TotalCash; // 总共充值金钱
	@JsonProperty("EnableReason")
	private String EnableReason; // 被封禁理由
	@JsonProperty("RegistIP")
	private String RegistIP; // 注册IP
	@JsonProperty("RegistDate")
	private String RegistDate; // 注册时间
	@JsonProperty("Sex")
	private int Sex; // 性别
	@JsonProperty("Marriage")
	private int Marriage; // 是否已婚
	@JsonProperty("Address")
	private String Address; // 地址
	@JsonProperty("PostCode")
	private Long PostCode; // 邮编
	@JsonProperty("Telphone")
	private String Telphone; // 电话
	@JsonProperty("IMType")
	private int IMType; // 即时通讯类型
	@JsonProperty("IMAccount")
	private String IMAccount; // 即时通讯帐号
	@JsonProperty("RegisterEMail")
	private String RegisterEMail; // 邮件
	@JsonProperty("LastLoginIP")
	private String LastLoginIP; // 最后访问IP
	@JsonProperty("LastLoginTime")
	private String LastLoginTime; // 最后访问日期
	@JsonProperty("LoginCount")
	private Long LoginCount; // 登入数次
	@JsonProperty("MobileNumber")
	private String MobileNumber; // 手机号码
	@JsonProperty("QuestionA")
	private String QuestionA; // 安全问题A
	@JsonProperty("AnswerA")
	private String AnswerA; // 安全答案A
	@JsonProperty("QuestionB")
	private String QuestionB; // 安全问题B
	@JsonProperty("AnswerB")
	private String AnswerB; // 安全答案B
	@JsonProperty("UserName")
	private String UserName; // 用户名
	@JsonProperty("Identity")
	private String Identity; // 身份证号
	@JsonProperty("IsMobileValid")
	private Boolean IsMobileValid = false; // 电话是否有效0:flase
	@JsonProperty("IsEMailValid")
	private Boolean IsEMailValid = false; // 邮件是否有效
	@JsonProperty("IsQuestionValid")
	private Boolean IsQuestionValid = false; // 安全问题是否有效
	@JsonProperty("IsIdentityValid")
	private Boolean IsIdentityValid = false; // 身份证是否有效
	@JsonProperty("PayPassword")
	private String PayPassword; // 支付密码
	@JsonProperty("Password")
	private String Password; // 密码
	@JsonProperty("RegistSource")
	private int RegistSource;
	@JsonProperty("RegisterTime")
	private long RegisterTime;
	@JsonProperty("IsLostUser")
	private Boolean IsLostUser;

	@JsonProperty("ActivityID")
	private int ActivityID;

	@JsonProperty("Key")
	private Long Key = 0L; // 验证码
	@JsonProperty("NewQuestionA")
	private String NewQuestionA;
	@JsonProperty("NewQuestionB")
	private String NewQuestionB;
	@JsonProperty("NewAnswerA")
	private String NewAnswerA;
	@JsonProperty("NewAnswerB")
	private String NewAnswerB;
	@JsonProperty("QuestionValid")
	private Boolean QuestionValid = false;
	@JsonProperty("CanUpdatePassword")
	private Boolean CanUpdatePassword = false;
	@JsonProperty("MoneyCash")
	private float MoneyCash; // 零钱
	/**
	 * @return the registSource
	 */
	@JsonIgnore
	public int getRegistSource() {
		return RegistSource;
	}

	/**
	 * @param registSource
	 *            the registSource to set
	 */
	@JsonIgnore
	public void setRegistSource(int registSource) {
		RegistSource = registSource;
	}

	/**
	 * @return the registerTime
	 */
	@JsonIgnore
	public long getRegisterTime() {
		return RegisterTime;
	}

	/**
	 * @param registerTime
	 *            the registerTime to set
	 */
	@JsonIgnore
	public void setRegisterTime(long registerTime) {
		RegisterTime = registerTime;
	}

	/**
	 * @return the isLostUser
	 */
	@JsonIgnore
	public Boolean getIsLostUser() {
		return IsLostUser;
	}

	/**
	 * @param isLostUser
	 *            the isLostUser to set
	 */
	@JsonIgnore
	public void setIsLostUser(Boolean isLostUser) {
		IsLostUser = isLostUser;
	}

	/**
	 * @return the activityID
	 */
	@JsonIgnore
	public int getActivityID() {
		return ActivityID;
	}

	/**
	 * @param activityID
	 *            the activityID to set
	 */
	@JsonIgnore
	public void setActivityID(int activityID) {
		ActivityID = activityID;
	}

	/**
	 * @return the canUpdatePassword
	 */
	@JsonIgnore
	public Boolean getCanUpdatePassword() {
		return CanUpdatePassword;
	}

	/**
	 * @param canUpdatePassword
	 *            the canUpdatePassword to set
	 */
	@JsonIgnore
	public void setCanUpdatePassword(Boolean canUpdatePassword) {
		CanUpdatePassword = canUpdatePassword;
	}

	@JsonIgnore
	public Long getID() {
		return ID;
	}

	@JsonIgnore
	public void setID(Long iD) {
		ID = iD;
	}

	@JsonIgnore
	public String getNormalAccount() {
		return NormalAccount;
	}

	@JsonIgnore
	public void setNormalAccount(String normalAccount) {
		NormalAccount = normalAccount;
	}

	@JsonIgnore
	public String getGamePassword() {
		return GamePassword;
	}

	@JsonIgnore
	public void setGamePassword(String gamePassword) {
		GamePassword = gamePassword;
	}

	@JsonIgnore
	public Integer getEnableTime() {
		return EnableTime;
	}

	@JsonIgnore
	public void setEnableTime(Integer enableTime) {
		EnableTime = enableTime;
	}

	@JsonIgnore
	public float getWebCash() {
		return WebCash;
	}

	@JsonIgnore
	public void setWebCash(float webCash) {
		WebCash = webCash;
	}

	@JsonIgnore
	public float getLockCash() {
		return LockCash;
	}

	@JsonIgnore
	public void setLockCash(float lockCash) {
		LockCash = lockCash;
	}

	@JsonIgnore
	public float getTotalCash() {
		return TotalCash;
	}

	@JsonIgnore
	public void setTotalCash(float totalCash) {
		TotalCash = totalCash;
	}

	@JsonIgnore
	public String getEnableReason() {
		return EnableReason;
	}

	@JsonIgnore
	public void setEnableReason(String enableReason) {
		EnableReason = enableReason;
	}

	@JsonIgnore
	public String getRegistIP() {
		return RegistIP;
	}

	@JsonIgnore
	public void setRegistIP(String registIP) {
		RegistIP = registIP;
	}

	@JsonIgnore
	public String getRegistDate() {
		return RegistDate;
	}

	@JsonIgnore
	public void setRegistDate(String registDate) {
		RegistDate = registDate;
	}

	@JsonIgnore
	public int getSex() {
		return Sex;
	}

	@JsonIgnore
	public void setSex(int sex) {
		Sex = sex;
	}

	@JsonIgnore
	public int getMarriage() {
		return Marriage;
	}

	@JsonIgnore
	public void setMarriage(int marriage) {
		Marriage = marriage;
	}

	@JsonIgnore
	public String getAddress() {
		return Address;
	}

	@JsonIgnore
	public void setAddress(String address) {
		Address = address;
	}

	@JsonIgnore
	public Long getPostCode() {
		return PostCode;
	}

	@JsonIgnore
	public void setPostCode(Long postCode) {
		PostCode = postCode;
	}

	@JsonIgnore
	public String getTelphone() {
		return Telphone;
	}

	@JsonIgnore
	public void setTelphone(String telphone) {
		Telphone = telphone;
	}

	@JsonIgnore
	public int getIMType() {
		return IMType;
	}

	@JsonIgnore
	public void setIMType(int iMType) {
		IMType = iMType;
	}

	@JsonIgnore
	public String getIMAccount() {
		return IMAccount;
	}

	@JsonIgnore
	public void setIMAccount(String iMAccount) {
		IMAccount = iMAccount;
	}

	@JsonIgnore
	public String getRegisterEMail() {
		return RegisterEMail;
	}

	@JsonIgnore
	public void setRegisterEMail(String registerEMail) {
		RegisterEMail = registerEMail;
	}

	@JsonIgnore
	public String getLastLoginIP() {
		return LastLoginIP;
	}

	@JsonIgnore
	public void setLastLoginIP(String lastLoginIP) {
		LastLoginIP = lastLoginIP;
	}

	@JsonIgnore
	public String getLastLoginTime() {
		return LastLoginTime;
	}

	@JsonIgnore
	public void setLastLoginTime(String lastLoginTime) {
		LastLoginTime = lastLoginTime;
	}

	@JsonIgnore
	public Long getLoginCount() {
		return LoginCount;
	}

	@JsonIgnore
	public void setLoginCount(Long loginCount) {
		LoginCount = loginCount;
	}

	@JsonIgnore
	public String getMobileNumber() {
		return MobileNumber;
	}

	@JsonIgnore
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	@JsonIgnore
	public String getQuestionA() {
		return QuestionA;
	}

	@JsonIgnore
	public void setQuestionA(String questionA) {
		QuestionA = questionA;
	}

	@JsonIgnore
	public String getAnswerA() {
		return AnswerA;
	}

	@JsonIgnore
	public void setAnswerA(String answerA) {
		AnswerA = answerA;
	}

	@JsonIgnore
	public String getQuestionB() {
		return QuestionB;
	}

	@JsonIgnore
	public void setQuestionB(String questionB) {
		QuestionB = questionB;
	}

	@JsonIgnore
	public String getAnswerB() {
		return AnswerB;
	}

	@JsonIgnore
	public void setAnswerB(String answerB) {
		AnswerB = answerB;
	}

	@JsonIgnore
	public String getUserName() {
		int length = null != UserName ? UserName.length() : 0;
		return length > 1 ? "****" + UserName.substring(length - 1, length)
				: UserName;
	}

	@JsonIgnore
	public void setUserName(String userName) {
		UserName = userName;
	}

	@JsonIgnore
	public String getIdentity() {
		int length = null != Identity ? Identity.length() : 0;
		return length > 1 ? Identity.substring(0, 6) + "************"
				: Identity;
	}

	@JsonIgnore
	public void setIdentity(String identity) {
		Identity = identity;
	}

	@JsonIgnore
	public Boolean isIsMobileValid() {
		return IsMobileValid;
	}

	@JsonIgnore
	public void setIsMobileValid(Boolean isMobileValid) {
		IsMobileValid = isMobileValid;
	}

	@JsonIgnore
	public Boolean isIsEMailValid() {
		return IsEMailValid;
	}

	@JsonIgnore
	public void setIsEMailValid(Boolean isEMailValid) {
		IsEMailValid = isEMailValid;
	}

	@JsonIgnore
	public Boolean isIsQuestionValid() {
		return IsQuestionValid;
	}

	@JsonIgnore
	public void setIsQuestionValid(Boolean isQuestionValid) {
		IsQuestionValid = isQuestionValid;
	}

	@JsonIgnore
	public Boolean isIsIdentityValid() {
		return IsIdentityValid;
	}

	@JsonIgnore
	public void setIsIdentityValid(Boolean isIdentityValid) {
		IsIdentityValid = isIdentityValid;
	}

	@JsonIgnore
	public String getPayPassword() {
		return PayPassword;
	}

	@JsonIgnore
	public void setPayPassword(String payPassword) {
		PayPassword = payPassword;
	}

	@JsonIgnore
	public Long getKey() {
		return Key;
	}

	@JsonIgnore
	public void setKey(Long key) {
		Key = key;
	}

	@JsonIgnore
	public String getPassword() {
		return Password;
	}

	@JsonIgnore
	public void setPassword(String password) {
		Password = password;
	}

	@JsonIgnore
	public String getNewQuestionA() {
		return NewQuestionA;
	}

	@JsonIgnore
	public void setNewQuestionA(String newQuestionA) {
		NewQuestionA = newQuestionA;
	}

	@JsonIgnore
	public String getNewQuestionB() {
		return NewQuestionB;
	}

	@JsonIgnore
	public void setNewQuestionB(String newQuestionB) {
		NewQuestionB = newQuestionB;
	}

	@JsonIgnore
	public String getNewAnswerA() {
		return NewAnswerA;
	}

	@JsonIgnore
	public void setNewAnswerA(String newAnswerA) {
		NewAnswerA = newAnswerA;
	}

	@JsonIgnore
	public String getNewAnswerB() {
		return NewAnswerB;
	}

	@JsonIgnore
	public void setNewAnswerB(String newAnswerB) {
		NewAnswerB = newAnswerB;
	}

	@JsonIgnore
	public Boolean getQuestionValid() {
		return QuestionValid;
	}

	@JsonIgnore
	public void setQuestionValid(Boolean questionValid) {
		QuestionValid = questionValid;
	}

	/**
	 * @return the moneyCash
	 */
	@JsonIgnore
	public float getMoneyCash() {
		return MoneyCash;
	}

	/**
	 * @param moneyCash the moneyCash to set
	 */
	@JsonIgnore
	public void setMoneyCash(float moneyCash) {
		MoneyCash = moneyCash;
	}
	
}

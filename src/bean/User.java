package bean;

public class User {
	private int userId;
	private String userName;
	private String password;
	private String realName;
	private int sex;
	private int roleId;

	public User(int userId, String userName, String password, String realName, int sex,int roleId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.realName = realName;
		this.roleId = roleId;
	}

	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
    
}

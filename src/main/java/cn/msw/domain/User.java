package cn.msw.domain;

import java.util.Date;

/**
 * @author 86188
 */
public class User {
	private Integer id; //id
	private String userName; //用户名称
	private Date birthday;  //出生日期
	private String sex;   //电话
	private String address; //地址

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", userName='" + userName + '\'' +
				", birthday=" + birthday +
				", sex='" + sex + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}

package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="user")
public class UserEntity {

	public UserEntity() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "USER_TITLE")
	private String userTitle;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "USER_PASSWORD")
	private String userPassword;

	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;

	@Column(name = "EMAIL_ID")
	private String emailId;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "USER_IMAGE")
	private byte[] userImage;

	@Column(name = "ROLE_ID")
	private int roleId;

	@Column(name = "ROLE_NAME")
	private String roleName;

	@Column(name = "CDATETIME")
	private LocalDateTime cDatetime=LocalDateTime.now();

	@Column(name = "USER_IS_DELETED")
	private int userIsDeleted;
	
	@Transient
	protected String userPhotoImageIn64Base;
	
	@Transient
	protected String jwtToken;

	public UserEntity(int userId, String firstName, String lastName, String userTitle, String userName,
			String userPassword, String contactNumber, String emailId, String gender, byte[] userImage, int roleId,
			String roleName, LocalDateTime cDatetime, int userIsDeleted, String userPhotoImageIn64Base,
			String jwtToken) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userTitle = userTitle;
		this.userName = userName;
		this.userPassword = userPassword;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.gender = gender;
		this.userImage = userImage;
		this.roleId = roleId;
		this.roleName = roleName;
		this.cDatetime = cDatetime;
		this.userIsDeleted = userIsDeleted;
		this.userPhotoImageIn64Base = userPhotoImageIn64Base;
		this.jwtToken = jwtToken;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserTitle() {
		return userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public byte[] getUserImage() {
		return userImage;
	}

	public void setUserImage(byte[] userImage) {
		this.userImage = userImage;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public LocalDateTime getcDatetime() {
		return cDatetime;
	}

	public void setcDatetime(LocalDateTime cDatetime) {
		this.cDatetime = cDatetime;
	}

	public int getUserIsDeleted() {
		return userIsDeleted;
	}

	public void setUserIsDeleted(int userIsDeleted) {
		this.userIsDeleted = userIsDeleted;
	}

	public String getUserPhotoImageIn64Base() {
		return userPhotoImageIn64Base;
	}

	public void setUserPhotoImageIn64Base(String userPhotoImageIn64Base) {
		this.userPhotoImageIn64Base = userPhotoImageIn64Base;
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
}

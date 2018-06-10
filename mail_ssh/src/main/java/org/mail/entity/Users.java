/***********************************************************************
 * Module:  Users.java
 * Author:  VIC
 * Purpose: Defines the Class Users
 ***********************************************************************/
package org.mail.entity;

/** 用户 */
public class Users {
	
	public static final String DISABLED  = "DISABLED";
	public static final String ENABLED  = "ENABLED";
   /** 用户ID */
   public double uid;
   /** 用户名 */
   public java.lang.String uname;
   /** 用户登录账号 */
   public java.lang.String uaccount;
   /** 用户登录密码 */
   public java.lang.String upassword;
   /** 用户性别 */
   public java.lang.String usex;
   /** 用户年龄 */
   public double uage;
   /** 用户头像 */
   public java.lang.String uhead;
   /** 用户邮箱 */
   public java.lang.String uemail;
   /** 用户手机 */
   public double uphone;
   /** 用户状态 */
   public java.lang.String state;
   /** 注册时间 */
   public Object createtime;
public double getUid() {
	return uid;
}
public void setUid(double uid) {
	this.uid = uid;
}
public java.lang.String getUname() {
	return uname;
}
public void setUname(java.lang.String uname) {
	this.uname = uname;
}
public java.lang.String getUaccount() {
	return uaccount;
}
public void setUaccount(java.lang.String uaccount) {
	this.uaccount = uaccount;
}
public java.lang.String getUpassword() {
	return upassword;
}
public void setUpassword(java.lang.String upassword) {
	this.upassword = upassword;
}
public java.lang.String getUsex() {
	return usex;
}
public void setUsex(java.lang.String usex) {
	this.usex = usex;
}
public double getUage() {
	return uage;
}
public void setUage(double uage) {
	this.uage = uage;
}
public java.lang.String getUhead() {
	return uhead;
}
public void setUhead(java.lang.String uhead) {
	this.uhead = uhead;
}
public java.lang.String getUemail() {
	return uemail;
}
public void setUemail(java.lang.String uemail) {
	this.uemail = uemail;
}
public double getUphone() {
	return uphone;
}
public void setUphone(double uphone) {
	this.uphone = uphone;
}
public java.lang.String getState() {
	return state;
}
public void setState(java.lang.String state) {
	this.state = state;
}
public Object getCreatetime() {
	return createtime;
}
public void setCreatetime(Object createtime) {
	this.createtime = createtime;
}
@Override
public String toString() {
	return "Users [uid=" + uid + ", uname=" + uname + ", uaccount=" + uaccount + ", upassword=" + upassword + ", usex="
			+ usex + ", uage=" + uage + ", uhead=" + uhead + ", uemail=" + uemail + ", uphone=" + uphone + ", state="
			+ state + ", createtime=" + createtime + "]";
}
   
}
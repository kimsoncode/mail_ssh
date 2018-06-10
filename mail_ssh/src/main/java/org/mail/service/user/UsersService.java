package org.mail.service.user;

import java.sql.Timestamp;

import org.mail.entity.Users;
import org.mail.jdbc.JdbcTemplate;
import org.mail.util.MD5Util;

/**
 * 用户业务类
 * @author VIC
 *
 */
public class UsersService extends JdbcTemplate<Users> {

	public boolean checkedEmail(String email) {
		return exists("select * from users where uemail=?", email);
	}
	
	public boolean checkedPhone(String email) {
		return exists("select * from users where uphone=?", email);
	}

	public int registerEmail(String email, String password) {
		 
		return execute("insert into USERS values(USER_SEQ.nextval,?,?,?,?,?,?,?,?,?,?)", "example","example",MD5Util.encryptMD5(password),"男",29,"head.jpg",email,"1388888",Users.DISABLED,new Timestamp(System.currentTimeMillis()));
	}

	public int registerPhone(String phone, String password) {
		return execute("insert into USERS values(USER_SEQ.nextval,?,?,?,?,?,?,?,?,?,?)", "USER_SEQ.nextval","example","example",MD5Util.encryptMD5(password),"男",28,"head.jpg","example@163.com",phone,Users.DISABLED,new Timestamp(System.currentTimeMillis()));
	}

}

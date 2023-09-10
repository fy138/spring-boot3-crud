package com.example.demo.dao.entries;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="t_user")
@Entity
@Data
public class TUser {


	@Id
	private Long id;
	private String loginName ;
	private String nickName;
	private String passwd;
	
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "TUser [id=" + id + ", loginName=" + loginName + ", nickName=" + nickName + ", passwd=" + passwd + "]";
	}
/*
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         sb.append("id:"+this.id);
         sb.append("loginName:"+this.loginName);
         sb.append("nickName:"+this.nickName);
         sb.append("passwd:"+this.passwd);
         
        return sb.toString();
    }
    */
}

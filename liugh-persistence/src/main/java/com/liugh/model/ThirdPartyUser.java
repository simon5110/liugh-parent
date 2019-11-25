/**
 * 第三方用户实体类
 */
package com.liugh.model;


import lombok.*;

import java.io.Serializable;

/**
 * @author liugh
 * @version 2018年7月26日 下午3:26:23
 */
@SuppressWarnings("serial")
@Builder
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ThirdPartyUser implements Serializable {
	private String account;// 用户
	private String username;// 用户昵称
	private String avatarUrl;// 用户头像地址
	private String gender;// 用户性别
	private String token;// 用户认证
	private String openid;// 用户第三方id
	private String provider;// 用户类型
	private Integer userId;// 用户id
	private Long userThirdpartyId;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Long getUserThirdpartyId() {
		return userThirdpartyId;
	}

	public void setUserThirdpartyId(Long userThirdpartyId) {
		this.userThirdpartyId = userThirdpartyId;
	}
}

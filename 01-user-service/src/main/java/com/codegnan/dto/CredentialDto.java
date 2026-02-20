package com.codegnan.dto;

import com.codegnan.models.RoleBasedAuthority;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CredentialDto {

	private String username;
	private String password;
	private RoleBasedAuthority roleBasedAuthority;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public RoleBasedAuthority getRoleBasedAuthority() {
		return roleBasedAuthority;
	}
	public void setRoleBasedAuthority(RoleBasedAuthority roleBasedAuthority) {
		this.roleBasedAuthority = roleBasedAuthority;
	}
	public CredentialDto(String username, String password, RoleBasedAuthority roleBasedAuthority) {
		super();
		this.username = username;
		this.password = password;
		this.roleBasedAuthority = roleBasedAuthority;
	}
	
}

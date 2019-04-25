package telran.accounting.api;

import java.util.HashSet;

public class AccountDto {
	public String username;
	public String password;
	public HashSet<String> roles;

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public HashSet<String> getRoles() {
		return roles;
	}

	public AccountDto(String username, String password, HashSet<String> roles) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
	}

	public AccountDto() {
	}
}

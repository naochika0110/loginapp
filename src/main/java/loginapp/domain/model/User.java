package loginapp.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "usr")
public class User {
	@Id
	private String userId;
	private String password;
	
	// JPA requirement
    protected User() {}
    
	public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
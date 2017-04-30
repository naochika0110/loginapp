package loginapp.app.login;

import javax.validation.constraints.Size;

public class EntryForm {
	
	private String username;

    @Size(min=8, max=255)
    private String password;
	
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
	
	
}
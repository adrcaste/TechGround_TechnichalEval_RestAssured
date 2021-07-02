package model;

public class User {
    private String email;
    private String name;
    private String username;
    public User (String name,String username, String email) {
        this.name = name;
        this.username= username;
        this.email = email;

    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }
}

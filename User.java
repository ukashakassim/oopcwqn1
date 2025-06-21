package users;

public abstract class User {
    private final String userId;
    private String name;
    private String email;

    public User(String userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public abstract void requestTransport();

    // Getters and setters
    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    protected void setPassword(String password) {}
}
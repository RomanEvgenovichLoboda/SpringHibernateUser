package Models;

public class User {
    int Id;
    String Login;
    String Password;
    public User(){}
    public User(String login,String password){
        this.Id=0;
        this.Login=login;
        this.Password= String.valueOf(password.hashCode());
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = String.valueOf(password.hashCode());
    }
}

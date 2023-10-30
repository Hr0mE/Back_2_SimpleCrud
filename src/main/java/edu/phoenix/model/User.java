package edu.phoenix.model;

public class User {
  private String name;
  private String login;
  private String password;

  public User(String name, String login, String password) {
    this.name = name;
    this.login = login;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public String getLogin() {
    return login;
  }

  public String getPassword() {
    return password;
  }

  public Boolean setUser(User user){
    try{
      this.name = user.getName();
      this.login = user.getLogin();
      this.password = user.getPassword();
      return true;
    }
    catch (OutOfMemoryError e){
      System.out.println("Память кончилась!");
      return false;
    }
  }
}

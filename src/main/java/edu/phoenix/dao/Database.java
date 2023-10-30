package edu.phoenix.dao;

import edu.phoenix.model.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
  public static List<User> dataBase = new ArrayList<>();

  public static void addUser(String name, String login, String password) {
    User user = new User(name, login, password);
    if (!dataBase.contains(user)) {
      dataBase.add(user);
    } else {
      System.out.println("Такой пользователь уже существует!");
    }
  }

  public static User getUser(String login, String password) {
    for (User user : dataBase) {
      if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
        return user;
      }
    }
    return null;
  }

  public static void deleteUser(String login) {
    dataBase.removeIf(user -> (login.equals(user.getLogin())));
  }

  public static void updateUser(User user) {
    User curUser = getUser(user.getLogin(), user.getPassword());
    if (curUser != null) {
      curUser.setUser(user);
    }
  }

  public static void showDB() {
    /*
    for (User user: dataBase) {
      for(String elem: user){
        System.out.println(elem);}
    }
  }

     */
  }
}

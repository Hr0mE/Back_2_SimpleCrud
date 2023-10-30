package edu.phoenix;

import edu.phoenix.dao.Database;
import edu.phoenix.model.User;

import java.util.ArrayList;
import java.util.List;

public class Application {

  public static void main(String[] args) {

    Database.addUser("SOMENAME", "SOMELOGIN", "SOMEPASSWORD");
    Database.updateUser(new User("newName", "SOMELOGIN", "SOMEPASSWORD"));
    Database.deleteUser("SOMELOGIN");

    Database.showDB();
  }
}

package service;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        users.add(new User("hung","123","HungDZ","hung@gmail.com",28));
        users.add(new User("thinh","123","ThinhDZ","hung@gmail.com",28));
        users.add(new User("trung","123","TrungDZ","hung@gmail.com",28));
    }
    public User checkLogin(Login login){
        for (User u: users) {
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}

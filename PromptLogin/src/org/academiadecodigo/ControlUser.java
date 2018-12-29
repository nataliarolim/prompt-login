package org.academiadecodigo;
import java.util.HashSet;
import java.util.Set;

public class ControlUser {

    private Set<User> userList;


    ControlUser() {
        userList = new HashSet<>();
    }


    public void addUser(User userName) {

        if (!userList.contains(userName.getName())) {
            userList.add(userName);
        }
    }

    public boolean testUser(String name, String pass) {

        for (User user : userList) {

            if ((user.getName().equals(name)) && (user.getPassword().equals(pass))){
                return true;
            }
        }
        return false;
    }
}
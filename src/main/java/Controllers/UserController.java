package Controllers;

import Models.User;

import java.util.ArrayList;

public class UserController {
    ArrayList<User>list=new ArrayList<User>();
    public UserController(){
        list.add(new User("roma","loboda"));
        list.add(new User("valik","lola"));
        list.add(new User("evgen","bogomolov"));
        list.add(new User("zinadin","lzidan"));
    }
    public void addUser(User user){
        list.add(user);
    }
    public void remuveUser(String login){
        for (User us:list) {
            if(us.getLogin().equals(login)){
                list.remove(us);
            }

        }

    }
    public ArrayList<User>getList(){
        return list;
    }
}

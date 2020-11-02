package edu.sdust.moon.Entity;

public class Group extends User {




    public Group(){
        super();
    }

    public Group(long id, String nick) {
        super(id, nick);
    }

    public Group(net.mamoe.mirai.contact.Group group) {
        super();
    }
}

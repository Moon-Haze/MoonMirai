package edu.sdust.moon.Entity;

public class User {
    /**
     * QQ 号码
     */
    private long id;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 头像下载链接
     */
    private String avatarUrl;

    public User() {
    }

    public User(long id, String nick) {
        this.id = id;
        this.nick = nick;
        this.avatarUrl = "http://q1.qlogo.cn/g?b=qq&nk=" + id + "&s=640";
    }

}

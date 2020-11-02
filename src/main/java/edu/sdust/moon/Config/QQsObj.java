package edu.sdust.moon.Config;

public class QQsObj {
    private long QQ;
    private String password;

    public long getQQ () {
        return QQ;
    }

    public String getPassword () {
        return password;
    }

    public QQsObj (long QQ, String password) {
        this.QQ = QQ;
        if (password == null) {
            this.password = "Please type in your password.";
        } else {
            this.password = password;
        }
    }
    @Override
    public String toString () {
        return "QQsObj{" +
                "QQ=" + QQ +
                ", Password='" + password + '\'' +
                '}';
    }
}

package edu.sdust.moon.Config;

import java.util.ArrayList;
import java.util.List;

public class ConfigObj {
    private List<QQsObj> QQs;
    private boolean Pack;
    private int Type;

    public List<QQsObj> getQQs () {
        return QQs;
    }

    public void setQQs (List<QQsObj> QQs) {
        this.QQs = QQs;
    }

    public boolean isPack () {
        return Pack;
    }

    public void setPack (boolean pack) {
        Pack = pack;
    }

    public int getType () {
        return Type;
    }

    public void setType (int type) {
        Type = type;
    }

    public ConfigObj () {
        QQs = new ArrayList<> () {{
            add (new QQsObj (0, null));
        }};
        Pack = true;
        Type = 0;
    }

    public ConfigObj (List<QQsObj> QQs, boolean pack, int type) {
        this.QQs = QQs;
        Pack = pack;
        Type = type;
    }

    @Override
    public String toString () {
        return "ConfigObj{" +
                "QQs=" + QQs +
                ", Pack=" + Pack +
                ", Type=" + Type +
                '}';
    }
}

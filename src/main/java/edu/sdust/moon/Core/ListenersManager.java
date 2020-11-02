package edu.sdust.moon.Core;

import edu.sdust.moon.Annotation.ExcludeInClass;
import edu.sdust.moon.Annotation.ExclusiveInClass;
import edu.sdust.moon.EventListeners.EventListener;

import java.util.ArrayList;
import java.util.HashMap;

public class ListenersManager {
    private final HashMap<Long,QQ> QQs;

    public ListenersManager(HashMap<Long,QQ> QQs){
        this.QQs=QQs;
    }

    public void addListener(Class<? extends EventListener> clazz) {
       ArrayList<Long> ids=getIds(clazz);
       for (Long id:ids){
           QQs.get(id).registerEventListeners(clazz);
       }
    }

    private ArrayList<Long> getIds(Class<? extends EventListener> clazz){
        ArrayList<Long> list = new ArrayList<>();
        ExclusiveInClass[] exclusives = clazz.getAnnotationsByType(ExclusiveInClass.class);
        if (exclusives.length != 0) {
            for (ExclusiveInClass exclusive : exclusives) {
                for (long id : exclusive.values()) {
                    list.add(id);
                }
            }
        } else {
            list.addAll(QQs.keySet());
        }
        if (list.size()!=0){
            ExcludeInClass[] otherFriends = clazz.getAnnotationsByType(ExcludeInClass.class);
            if (otherFriends.length != 0) {
                for (ExcludeInClass annotation : otherFriends) {
                    for (long id : annotation.values()) {
                        list.remove(id);
                    }
                }
            }
        }
        return list;
    }
}
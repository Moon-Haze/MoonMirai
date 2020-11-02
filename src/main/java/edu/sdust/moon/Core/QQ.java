package edu.sdust.moon.Core;

import edu.sdust.moon.Annotation.ExcludeInMethod;
import edu.sdust.moon.Annotation.ExclusiveInMethod;
import edu.sdust.moon.EventListeners.EventListener;
import net.mamoe.mirai.Bot;
import net.mamoe.mirai.contact.Group;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class QQ {
    private final Bot bot;
    private final EventPool pool = new EventPool();

    public QQ(Bot bot){
        this.bot=bot;
    }

    /**
     * 向 QQ 中注册事件监听器。并且将事件分类。
     * @param clazz
     */
    public void registerEventListeners(Class<? extends EventListener> clazz) {
        ArrayList<Long> list = null;
        for (Method method : clazz.getDeclaredMethods()) {
            list = getIds(method);
            try {
                EventListener eventListener=clazz.getConstructor().newInstance();
                pool.addListener(list,
                        Enum.valueOf(
                                eventListener.getType(),
                                method.getName().toUpperCase()
                        ),
                        eventListener
                );
            } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    private ArrayList<Long> getIds(Method method) {
        ArrayList<Long> list = new ArrayList<>();
        ExcludeInMethod[] exclusiveAnnotations = method.getAnnotationsByType(ExcludeInMethod.class);
        if (exclusiveAnnotations.length != 0) {
            for (ExcludeInMethod annotation : exclusiveAnnotations) {
                for (long id : annotation.values()) {
                    list.add(id);
                }
            }
        } else {
            for (Group f : bot.getGroups()) {
                list.add(f.getId());
            }
        }
        if (list.size()!=0){
            ExcludeInMethod[] otherFriends = method.getAnnotationsByType(ExcludeInMethod.class);
            if (otherFriends.length != 0) {
                for (ExcludeInMethod annotation : otherFriends) {
                    for (long id : annotation.values()) {
                        list.remove(id);
                    }
                }
            }
        }
        return list;
    }

    public Bot getBot(){
        return bot;
    }
}
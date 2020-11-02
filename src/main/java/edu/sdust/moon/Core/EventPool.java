package edu.sdust.moon.Core;


import edu.sdust.moon.Enum.*;
import edu.sdust.moon.EventListeners.EventListener;

import java.util.ArrayList;
import java.util.HashMap;

public class EventPool {
    private final HashMap<Long, EventMap> friendEvents = new HashMap<>();
    private final HashMap<Long, EventMap> memberEvents = new HashMap<>();
    private final HashMap<Long, EventMap> groupEvents = new HashMap<>();
    private final HashMap<Long, EventMap> botEvents = new HashMap<>();
    private final HashMap<Long, EventMap> affairEvents = new HashMap<>();

    HashMap< Class<? extends Enum<?>>, HashMap<Long, EventMap>> enumMap = new HashMap<>();

    public EventPool() {
        enumMap.put(AffairsEventType.class,affairEvents);
        enumMap.put(BotEventType.class,botEvents);
        enumMap.put(GroupEventType.class,groupEvents);
        enumMap.put(MemberEventType.class,memberEvents);
        enumMap.put(FriendEventType.class,friendEvents);
    }

    public void addListener(ArrayList<Long> ids, Enum<?> type, EventListener listener) {
        HashMap<Long, EventMap>events =enumMap.get(type.getDeclaringClass());
        for (long id : ids) {
            EventMap listeners = events.get(id);
            if (listeners != null) {
                listeners.put(type, listener);
            }
        }
    }

    public ArrayList<EventListener> getFriendEvents(long id, Enum<FriendEventType> type) {
        return friendEvents.get(id).get(type);
    }

    public ArrayList<EventListener> getMemberEvents(long id, Enum<MemberEventType> type) {
        return memberEvents.get(id).get(type);
    }

    public ArrayList<EventListener> getGroupEvents(long id, Enum<GroupEventType> type) {
        return groupEvents.get(id).get(type);
    }

    public ArrayList<EventListener> getBotEvents(long id, Enum<BotEventType> type) {
        return botEvents.get(id).get(type);
    }

    public ArrayList<EventListener> getAffairEvents(long id, Enum<AffairsEventType> type) {
        return affairEvents.get(id).get(type);
    }

    public HashMap<Long, EventMap> getFriendEvents() {
        return friendEvents;
    }

    public HashMap<Long, EventMap> getMemberEvents() {
        return memberEvents;
    }

    public HashMap<Long, EventMap> getGroupEvents() {
        return groupEvents;
    }

    public HashMap<Long, EventMap> getBotEvents() {
        return botEvents;
    }
}
package edu.sdust.moon.Core;


import edu.sdust.moon.EventListeners.EventListener;

import java.util.*;

public class EventMap {
    HashMap<Enum<?>, ArrayList<EventListener>> eventListener=new HashMap<>();

    public boolean put(Enum<?> key,EventListener listener){
        if (eventListener.containsKey(key)){
            return eventListener.get(key).add(listener);
        }
        return false;
    }

    public int allSize(){
        int num=0;
        for (ArrayList<EventListener> item: eventListener.values()){
            num+=item.size();
        }
        return num;
    }

    public int size() {
        return eventListener.size();
    }

    public ArrayList<EventListener> get(Enum<?> key) {
        return eventListener.get(key);
    }

    public boolean containsKey(Enum<?> key) {
        return eventListener.containsKey(key);
    }

    public ArrayList<EventListener> put(Enum<?> key, ArrayList<EventListener> value) {
        return eventListener.put(key, value);
    }

    public ArrayList<EventListener> remove(Enum<?> key) {
        return eventListener.remove(key);
    }

    public void clear() {
        eventListener.clear();
    }

    public Collection<ArrayList<EventListener>> values() {
        return eventListener.values();
    }

    public Set<Map.Entry<Enum<?>, ArrayList<EventListener>>> entrySet() {
        return eventListener.entrySet();
    }

    public boolean remove(Enum<?> key, ArrayList<EventListener> value) {
        return eventListener.remove(key, value);
    }

    public boolean replace(Enum<?> key, ArrayList<EventListener> oldValue, ArrayList<EventListener> newValue) {
        return eventListener.replace(key, oldValue, newValue);
    }

    public ArrayList<EventListener> replace(Enum<?> key, ArrayList<EventListener> value) {
        return eventListener.replace(key, value);
    }
}
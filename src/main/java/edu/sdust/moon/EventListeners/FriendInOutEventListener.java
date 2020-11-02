package edu.sdust.moon.EventListeners;

import edu.sdust.moon.Enum.FriendEventType;
import edu.sdust.moon.Event.FriendInOutEvent;

public class FriendInOutEventListener extends EventListener {

    /**
     * [机器人]一个账号请求添加机器人为好友（事件）
     *
     * @param event
     */
    
    public void NewFriendRequestEvent(FriendInOutEvent event) {
        
    }

    /**
     * [机器人]成功添加了一个新好友（事件）
     *
     * @param event
     
     */
    
    public void FriendAddEvent(FriendInOutEvent event) {
        
    }

    /**
     * [机器人]好友已被删除（事件）
     *
     * @param event
     
     */
    
    public void FriendDeleteEvent(FriendInOutEvent event) {
        
    }

    @Override
    public Class getType() {
        return FriendEventType.class;
    }
}

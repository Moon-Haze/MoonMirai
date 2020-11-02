package edu.sdust.moon.EventListeners;


import edu.sdust.moon.Enum.AffairsEventType;
import edu.sdust.moon.Event.MessageRecallEvent;

public class MessageRecallEventListener extends EventListener {

    /**
     * [机器人]好友消息撤回（事件）
     *
     * @param event
     
     */
    
    public void MessageFriendRecallEvent(MessageRecallEvent event) {
        
    }

    /**
     * [机器人]群消息撤回事件（事件）
     *
     * @param event
     
     */
    
    public void MessageGroupRecallEvent(MessageRecallEvent event) {
        
    }

    @Override
    public Class getType() {
        return AffairsEventType.class;
    }
}

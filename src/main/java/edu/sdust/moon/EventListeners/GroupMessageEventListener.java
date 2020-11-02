package edu.sdust.moon.EventListeners;

import edu.sdust.moon.Enum.GroupEventType;
import edu.sdust.moon.Event.GroupMessageEvent;

public class GroupMessageEventListener extends EventListener {
    /**
     * [机器人]收到群消息（事件）
     *
     * @param event
     */

    public void GroupMessageEvent(GroupMessageEvent event) {

    }

    /**
     * [机器人]在群消息发送后广播（事件）
     *
     * @param event
     */

    public void GroupMessagePostSendEvent(GroupMessageEvent event) {

    }

    /**
     * [机器人]在发送群消息前广播（事件）
     *
     * @param event
     */
    public void GroupMessagePreSendEvent(GroupMessageEvent event) {

    }



    @Override
    public Class getType() {
        return GroupEventType.class;
    }
}

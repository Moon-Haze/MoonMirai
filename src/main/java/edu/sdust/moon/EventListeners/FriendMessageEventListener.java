package edu.sdust.moon.EventListeners;

import edu.sdust.moon.Enum.FriendEventType;
import edu.sdust.moon.Event.FriendMessageEvent;

public class FriendMessageEventListener extends EventListener {
    /**
     * [机器人]收到朋友消息（事件）
     *
     * @param event
     */

    public void FriendMessageEvent(FriendMessageEvent event) {

    }

    /**
     * [机器人]好友输入状态改变（事件）
     *
     * @param event
     */
    public void FriendInputStatusChangedEvent(FriendMessageEvent event) {

    }

    /**
     * [机器人]在好友消息发送后广播（事件）
     *
     * @param event
     */

    public void FriendMessagePostSendEvent(FriendMessageEvent event) {

    }

    /**
     * [机器人]在发送好友消息前广播（事件）
     *
     * @param event
     */

    public void FriendMessagePreSendEvent(FriendMessageEvent event) {

    }

    @Override
    public Class getType() {
        return FriendEventType.class;
    }
}

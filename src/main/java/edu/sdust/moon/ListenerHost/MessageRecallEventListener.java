package edu.sdust.moon.ListenerHost;

import net.mamoe.mirai.event.EventHandler;
import net.mamoe.mirai.event.ListeningStatus;
import net.mamoe.mirai.event.events.MessageRecallEvent;

public class MessageRecallEventListener extends EventListener {

    /**
     * [机器人]好友消息撤回（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus MessageFriendRecallEvent(MessageRecallEvent.FriendRecall event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * [机器人]群消息撤回事件（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus MessageGroupRecallEvent(MessageRecallEvent.GroupRecall event) {
        return ListeningStatus.LISTENING;
    }
}

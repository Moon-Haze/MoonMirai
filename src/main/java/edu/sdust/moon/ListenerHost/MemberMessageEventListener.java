package edu.sdust.moon.ListenerHost;

import net.mamoe.mirai.event.EventHandler;
import net.mamoe.mirai.event.ListeningStatus;
import net.mamoe.mirai.event.events.TempMessagePostSendEvent;
import net.mamoe.mirai.event.events.TempMessagePreSendEvent;

public class MemberMessageEventListener extends EventListener {
    /**
     * [机器人]在群临时会话消息发送后广播（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus TempMessagePostSendEvent(TempMessagePostSendEvent event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * [机器人]在发送群临时会话消息前广播（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus TempMessagePreSendEvent(TempMessagePreSendEvent event) {
        return ListeningStatus.LISTENING;
    }
}

package edu.sdust.moon.ListenerHost;

import net.mamoe.mirai.event.ListeningStatus;
import net.mamoe.mirai.event.events.BotNudgedEvent;
import net.mamoe.mirai.event.events.MemberNudgedEvent;

public class NudgedEventListener extends EventListener {

    /**
     * Member 被 [戳]的事件.
     *
     * @param event
     * @return
     */
    public ListeningStatus MemberNudgedEvent(MemberNudgedEvent event) {
        return ListeningStatus.LISTENING;
    }
    /**
     * Bot 被[戳]的事件.
     *
     * @param event
     * @return
     */
    public ListeningStatus BotNudgedEvent(BotNudgedEvent event) {
        return ListeningStatus.LISTENING;
    }
}

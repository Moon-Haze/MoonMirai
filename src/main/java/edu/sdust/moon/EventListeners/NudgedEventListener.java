package edu.sdust.moon.EventListeners;

import edu.sdust.moon.Enum.AffairsEventType;
import edu.sdust.moon.Event.NudgedEvent;

public class NudgedEventListener extends EventListener {

    /**
     * Member 被 [戳]的事件.
     *
     * @param event
     */
    public void MemberNudgedEvent(NudgedEvent event) {

    }

    /**
     * Bot 被[戳]的事件.
     *
     * @param event
     */
    public void BotNudgedEvent(NudgedEvent event) {

    }

    @Override
    public Class getType() {
        return AffairsEventType.class;
    }
}

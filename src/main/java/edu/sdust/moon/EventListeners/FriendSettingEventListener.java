package edu.sdust.moon.EventListeners;


import edu.sdust.moon.Enum.FriendEventType;
import edu.sdust.moon.Event.FriendSettingEvent;

public class FriendSettingEventListener extends EventListener {


    /**
     * 昵称改变事件, 在此事件广播时好友已经完成改名
     *
     * @param event
     */

    public void FriendNickChangedEvent(FriendSettingEvent event) {

    }


    /**
     * 好友昵称改变事件. 目前仅支持解析 (来自 PC 端的修改).
     *
     * @param event
     */

    public void FriendRemarkChangeEvent(FriendSettingEvent event) {

    }

    /**
     * 头像被修改. 在此事件广播前就已经修改完毕.
     *
     * @param event
     */

    public void FriendAvatarChangedEvent(FriendSettingEvent event) {

    }

    @Override
    public Class getType() {
        return FriendEventType.class;
    }
}

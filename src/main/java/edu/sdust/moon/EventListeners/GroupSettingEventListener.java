package edu.sdust.moon.EventListeners;


import edu.sdust.moon.Enum.GroupEventType;
import edu.sdust.moon.Event.GroupSettingEvent;

public class GroupSettingEventListener extends EventListener {


    /**
     * 群 "匿名聊天" 功能状态改变（事件）
     *
     * @param event
     
     */
    
    public void GroupAllowAnonymousChatEvent(GroupSettingEvent event) {
        
    }

    /**
     * [机器人]群 "坦白说" 功能状态改变（事件）
     *
     * @param event
     
     */
    
    public void GroupAllowConfessTalkEvent(GroupSettingEvent event) {
        
    }

    /**
     * [机器人]群 "允许群员邀请好友加群" 功能状态改变（事件）
     *
     * @param event
     
     */
    
    public void GroupAllowMemberInviteEvent(GroupSettingEvent event) {
        
    }

    /**
     * [机器人]入群公告改变（事件）
     *
     * @param event
     
     */
    
    public void GroupEntranceAnnouncementChangeEvent(GroupSettingEvent event) {
        
    }

    /**
     * [机器人]群名改变（事件）
     *
     * @param event
     
     */
    
    public void GroupNameChangeEvent(GroupSettingEvent event) {
        
    }

    /**
     * [机器人]群 "全员禁言" 功能状态改变（事件）
     *
     * @param event
     
     */
    
    public void GroupMuteAllEvent(GroupSettingEvent event) {
        
    }

    @Override
    public Class getType() {
        return GroupEventType.class;
    }
}
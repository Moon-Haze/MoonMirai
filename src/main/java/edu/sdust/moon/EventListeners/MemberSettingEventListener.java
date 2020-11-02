package edu.sdust.moon.EventListeners;

import edu.sdust.moon.Enum.MemberEventType;
import edu.sdust.moon.Event.MemberSettingEvent;

public class MemberSettingEventListener extends EventListener {

    /**
     * [机器人]成员群名片改动（事件）
     *
     * @param event
     
     */
    
    public void MemberCardChangeEvent(MemberSettingEvent event) {
        
    }

    /**
     * [机器人]成员群头衔改动（事件）
     *
     * @param event
     
     */
    
    public void MemberSpecialTitleChangeEvent(MemberSettingEvent event) {
        
    }

    /**
     * [机器人]群成员被禁言（事件）
     *
     * @param event
     
     */
    
    public void MemberMuteEvent(MemberSettingEvent event) {
        
    }

    /**
     * [机器人]群成员被取消禁言（事件）
     *
     * @param event
     
     */
    
    public void MemberUnmuteEvent(MemberSettingEvent event) {
        
    }

    /**
     * [机器人]成员权限改变（事件）
     *
     * @param event
     
     */
    
    public void MemberPermissionChangeEvent(MemberSettingEvent event) {
        
    }

    @Override
    public Class getType() {
        return MemberEventType.class;
    }
}
package edu.sdust.moon.EventListeners;

import edu.sdust.moon.Enum.MemberEventType;
import edu.sdust.moon.Event.MemberInOutEvent;

public class MemberInOutEventListener extends EventListener {
    /**
     * 一个账号请求加入群事件, [Bot] 在此群中是管理员或群主.（事件）
     *
     * @param event
     
     */
    
    public void MemberJoinRequestEvent(MemberInOutEvent event) {
        
    }

    /**
     * 成员被邀请加入群（事件）
     *
     * @param event
     
     */
    
    public void MemberInviteJoinEvent(MemberInOutEvent event) {
        
    }

    /**
     * 成员主动加入群（事件）
     *
     * @param event
     
     */
    
    public void MemberActiveJoinEvent(MemberInOutEvent event) {
        
    }

    /**
     * 成员被踢出群（事件）
     *
     * @param event
     
     */
    
    public void MemberKickEvent(MemberInOutEvent event) {
        
    }

    /**
     * 成员主动离开（事件）
     *
     * @param event
     
     */
    
    public void MemberQuitEvent(MemberInOutEvent event) {
        
    }

    /**
     * 原群主通过 https://huifu.qq.com/ 恢复原来群主身份并入群
     *
     * @param event
     
     */
    
    public void MemberJoinRetrieveEvent(MemberInOutEvent event) {
        
    }
    
    public void BotInvitedJoinGroupRequestEvent(MemberInOutEvent event){
        
    }

    @Override
    public Class getType() {
        return MemberEventType.class;
    }
}

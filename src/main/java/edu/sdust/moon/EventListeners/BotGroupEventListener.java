package edu.sdust.moon.EventListeners;


import edu.sdust.moon.Enum.BotEventType;
import edu.sdust.moon.Event.BotGroupEvent;

public class BotGroupEventListener extends EventListener {


    /**
     * 登录完成, 好友列表, 群组列表初始化完成（事件）
     *
     * @param event
     */
    
    public void BotOnlineEvent(BotGroupEvent event) {
        
    }
    /**
     * 头像被修改（通过其他客户端修改了头像）（事件）
     *
     * @param event
     * @return
     */
    
    public void BotAvatarChangedEvent(BotGroupEvent event) {
        
    }

    /**
     * 昵称被改变事件, 在此事件触发时 bot 已经完成改名
     * @param event
     * @return
     */
    
    public void BotNickChangedEvent(BotGroupEvent event){
        
    }

    /**
     * 主动或被动重新登录（事件）
     *
     * @param event
     * @return
     */
    
    public void BotReloginEvent(BotGroupEvent event) {
        
    }

    /**
     * 主动离线（事件）
     *
     * @param event
     * @return
     */
    
    public void BotActiveOfflineEvent(BotGroupEvent event) {
        
    }

    /**
     * 被挤下线（事件）
     *
     * @param event
     * @return
     */
    
    public void BotForceOfflineEvent(BotGroupEvent event) {
        
    }

    /**
     * 被服务器断开（事件）
     *
     * @param event
     * @return
     */
    
    public void BotMsfOfflineEvent(BotGroupEvent event) {
        
    }

    /**
     * 因 returnCode = -10008 等原因掉线
     * @param event
     * @return
     */
    public void PacketFactory10008(BotGroupEvent event){
        
    }

    /**
     * 因网络问题而掉线
     *
     * @param event
     * @return
     */
    
    public void BotDroppedOfflineEvent(BotGroupEvent event) {
        
    }

    /**
     * 服务器主动要求更换另一个服务器（事件）
     *
     * @param event
     * @return
     */
    
    public void BotRequireReconnectOfflineEvent(BotGroupEvent event) {
        
    }
    /**
     * 被禁言（事件）
     *
     * @param event
     */
    
    public void BotMuteEvent(BotGroupEvent event) {
        
    }

    /**
     * 被取消禁言（事件）
     *
     * @param event
     * @return
     */
    
    public void BotUnmuteEvent(BotGroupEvent event) {
    }

    /**
     * 主动退出一个群（事件）
     *
     * @param event
     * @return
     */
    
    public void BotQuitGroupEvent(BotGroupEvent event) {
        
    }

    /**
     * 被管理员或群主踢出群（事件）
     *
     * @param event
     * @return
     */
    
    public void BotKickGroupEvent(BotGroupEvent event) {
        
    }

    /**
     * 成功加入了一个新群（不确定. 可能是主动加入）（事件）
     *
     * @param event
     * @return
     */
    
    public void BotActiveJoinGroupEvent(BotGroupEvent event) {
        
    }

    /**
     * 成功加入了一个新群（机器人被一个群内的成员直接邀请加入了群）（事件）
     *
     * @param event
     * @return
     */
    
    public void BotInviteJoinGroupEvent(BotGroupEvent event) {
        
    }

    /**
     * 被邀请加入一个群（事件）
     *
     * @param event
     * @return
     */
    
    public void BotInvitedJoinGroupRequestEvent(BotGroupEvent event) {

    }

    /**
     * 原群主通过 https://huifu.qq.com/ 恢复原来群主身份并入群, Bot 是原群主
     * @param event
     * @return
     */
    public void BotRetrieveJoinGroupEvent(BotGroupEvent event) {
        
    }

    /**
     * 在群里的权限被改变. 操作人一定是群主（事件）
     *
     * @param event
     * @return
     */
    
    public void BotGroupPermissionChangeEvent(BotGroupEvent event) {
        
    }

    @Override
    public Class getType() {
        return BotEventType.class;
    }
}
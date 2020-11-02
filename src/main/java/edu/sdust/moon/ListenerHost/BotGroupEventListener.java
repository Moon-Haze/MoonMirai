package edu.sdust.moon.ListenerHost;

import net.mamoe.mirai.event.EventHandler;
import net.mamoe.mirai.event.ListeningStatus;
import net.mamoe.mirai.event.events.*;

public class BotGroupEventListener extends EventListener {


    /**
     * 登录完成, 好友列表, 群组列表初始化完成（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotOnlineEvent(BotOnlineEvent event) {
        return ListeningStatus.LISTENING;
    }
    /**
     * 头像被修改（通过其他客户端修改了头像）（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotAvatarChangedEvent(BotAvatarChangedEvent event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * 昵称被改变事件, 在此事件触发时 bot 已经完成改名
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotNickChangedEvent(BotNickChangedEvent event){
        return ListeningStatus.LISTENING;
    }

    /**
     * 主动或被动重新登录（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotReloginEvent(BotReloginEvent event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * 主动离线（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotActiveOfflineEvent(BotOfflineEvent.Active event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * 被挤下线（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotForceOfflineEvent(BotOfflineEvent.Force event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * 被服务器断开（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotMsfOfflineEvent(BotOfflineEvent.MsfOffline event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * 因 returnCode = -10008 等原因掉线
     * @param event
     * @return
     */
    public ListeningStatus PacketFactory10008(BotOfflineEvent.PacketFactory10008 event){
        return ListeningStatus.LISTENING;
    }

    /**
     * 因网络问题而掉线
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotDroppedOfflineEvent(BotOfflineEvent.Dropped event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * 服务器主动要求更换另一个服务器（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotRequireReconnectOfflineEvent(BotOfflineEvent.RequireReconnect event) {
        return ListeningStatus.LISTENING;
    }
    /**
     * 被禁言（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotMuteEvent(BotMuteEvent event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * 被取消禁言（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotUnmuteEvent(BotUnmuteEvent event) {

        return ListeningStatus.LISTENING;
    }

    /**
     * 主动退出一个群（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotQuitGroupEvent(BotLeaveEvent.Active event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * 被管理员或群主踢出群（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotKickGroupEvent(BotLeaveEvent.Kick event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * 成功加入了一个新群（不确定. 可能是主动加入）（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotActiveJoinGroupEvent(BotJoinGroupEvent.Active event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * 成功加入了一个新群（机器人被一个群内的成员直接邀请加入了群）（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotInviteJoinGroupEvent(BotJoinGroupEvent.Invite event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * 被邀请加入一个群（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotInvitedJoinGroupRequestEvent(BotInvitedJoinGroupRequestEvent event) {

        return ListeningStatus.LISTENING;
    }


    /**
     * 原群主通过 https://huifu.qq.com/ 恢复原来群主身份并入群, Bot 是原群主
     * @param event
     * @return
     */
    public ListeningStatus BotRetrieveJoinGroupEvent(BotJoinGroupEvent.Retrieve event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * 在群里的权限被改变. 操作人一定是群主（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus BotGroupPermissionChangeEvent(BotGroupPermissionChangeEvent event) {
        return ListeningStatus.LISTENING;
    }
}

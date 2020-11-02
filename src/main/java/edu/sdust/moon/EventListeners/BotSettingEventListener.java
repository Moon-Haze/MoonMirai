package edu.sdust.moon.EventListeners;

import edu.sdust.moon.Enum.BotEventType;
import edu.sdust.moon.Event.BotSettingEvent;

public class BotSettingEventListener extends EventListener {
    /**
     * 登录完成, 好友列表, 群组列表初始化完成（事件）
     *
     * @param event
     */

    public void BotOnlineEvent(BotSettingEvent event) {

    }

    /**
     * 头像被修改（通过其他客户端修改了头像）（事件）
     *
     * @param event
     */

    public void BotAvatarChangedEvent(BotSettingEvent event) {

    }

    /**
     * 昵称被改变事件, 在此事件触发时 bot 已经完成改名
     *
     * @param event
     */

    public void BotNickChangedEvent(BotSettingEvent event) {

    }

    /**
     * 主动或被动重新登录（事件）
     *
     * @param event
     */

    public void BotReloginEvent(BotSettingEvent event) {

    }

    /**
     * 主动离线（事件）
     *
     * @param event
     */

    public void BotActiveOfflineEvent(BotSettingEvent event) {

    }

    /**
     * 被挤下线（事件）
     *
     * @param event
     */

    public void BotForceOfflineEvent(BotSettingEvent event) {

    }

    /**
     * 被服务器断开（事件）
     *
     * @param event
     */

    public void BotMsfOfflineEvent(BotSettingEvent event) {

    }

    /**
     * 因 returnCode = -10008 等原因掉线
     *
     * @param event
     */
    public void PacketFactory10008(BotSettingEvent event) {

    }

    /**
     * 因网络问题而掉线
     *
     * @param event
     */

    public void BotDroppedOfflineEvent(BotSettingEvent event) {

    }

    /**
     * 服务器主动要求更换另一个服务器（事件）
     *
     * @param event
     */

    public void BotRequireReconnectOfflineEvent(BotSettingEvent event) {

    }

    @Override
    public Class getType() {
        return BotEventType.class;
    }
}
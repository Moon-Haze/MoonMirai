package edu.sdust.moon.ListenerHost;

import net.mamoe.mirai.event.EventHandler;
import net.mamoe.mirai.event.ListeningStatus;
import net.mamoe.mirai.event.events.*;

public class MemberSettingEventListener extends EventListener {

    /**
     * [机器人]成员群名片改动（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus MemberCardChangeEvent(MemberCardChangeEvent event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * [机器人]成员群头衔改动（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus MemberSpecialTitleChangeEvent(MemberSpecialTitleChangeEvent event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * [机器人]群成员被禁言（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus MemberMuteEvent(MemberMuteEvent event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * [机器人]群成员被取消禁言（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus MemberUnmuteEvent(MemberUnmuteEvent event) {
        return ListeningStatus.LISTENING;
    }

    /**
     * [机器人]成员权限改变（事件）
     *
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus MemberPermissionChangeEvent(MemberPermissionChangeEvent event) {
        return ListeningStatus.LISTENING;
    }
}
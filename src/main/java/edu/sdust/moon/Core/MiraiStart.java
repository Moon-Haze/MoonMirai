package edu.sdust.moon.Core;

import edu.sdust.moon.Config.ConfigObj;
import edu.sdust.moon.Config.ConfigRead;
import edu.sdust.moon.EventListeners.EventListener;
import edu.sdust.moon.Response.GroupResponse;
import kotlin.coroutines.CoroutineContext;
import net.mamoe.mirai.event.EventHandler;
import net.mamoe.mirai.event.Events;
import net.mamoe.mirai.event.ListeningStatus;
import net.mamoe.mirai.event.SimpleListenerHost;
import net.mamoe.mirai.event.events.*;
import net.mamoe.mirai.message.GroupMessageEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class MiraiStart {
    private static final Logger logger = LogManager.getLogger("MoonMirai");
    private static String RunDir;
    private static ConfigObj Config;

    public static void setConfig(ConfigObj config) {
        Config = config;
    }

    public static Logger getLogger() {
        return logger;
    }

    public static String getRunDir() {
        return RunDir;
    }

    public static ConfigObj getConfig() {
        return Config;
    }

    public static void start() {
        RunDir = System.getProperty("user.dir");
        logger.info("Starting...");
        if (ConfigRead.getInstance().ReadStart(RunDir)) {
            logger.info("Please modify the configuration file and restart.");
            return;
        }
        logger.info("Initialization complete.");
        if (!BotStart.getInstance().Start()) {
            logger.error("Failed to start the robot");
        }
    }

    public void addListener(Class<? extends EventListener> clazz){

    }

    public static void test() {
        Events.registerEvents(new SimpleListenerHost() {
            /**
             * [机器人]收到群消息（事件）
             *
             * @param event
             * @return
             */
            @EventHandler
            public ListeningStatus GroupMessageEvent(GroupMessageEvent event) {
                System.out.println(event);
                GroupResponse groupResponse=new GroupResponse(event);
                groupResponse.sendMessage("你好呀！");
                groupResponse.getMemberResponse(1126200515l).sendPrivateMessage("嘿嘿！！");
                edu.sdust.moon.Event.GroupMessageEvent gme= new  edu.sdust.moon.Event.GroupMessageEvent();
                new edu.sdust.moon.Event.GroupMessageEvent(event);
                return ListeningStatus.LISTENING;
            }

            /**
             * [机器人]在群消息发送后广播（事件）
             *
             * @param event
             * @return
             */
            @EventHandler
            public ListeningStatus GroupMessagePostSendEvent(GroupMessagePostSendEvent event) {
                 System.out.println(event);
                return ListeningStatus.LISTENING;
            }

            /**
             * [机器人]在发送群消息前广播（事件）
             *
             * @param event
             * @return
             */
            @EventHandler
            public ListeningStatus GroupMessagePreSendEvent(GroupMessagePreSendEvent event) {
                 System.out.println(event);
                return ListeningStatus.LISTENING;
            }


            /**
             * [机器人]在群临时会话消息发送后广播（事件）
             *
             * @param event
             * @return
             */
            @EventHandler
            public ListeningStatus TempMessagePostSendEvent(TempMessagePostSendEvent event) {
                 System.out.println(event);
                return ListeningStatus.LISTENING;
            }

            /**
             * [机器人]在发送群临时会话消息前广播（事件）
             *
             * @param event
             * @return
             */
            @EventHandler
            public ListeningStatus TempMessagePreSendEvent(TempMessagePreSendEvent event) {
                 System.out.println(event);
                return ListeningStatus.LISTENING;
            }

            /**
             * 群 "匿名聊天" 功能状态改变（事件）
             *
             * @param event
             */
            @EventHandler
            public ListeningStatus GroupAllowAnonymousChatEvent(GroupAllowAnonymousChatEvent event) {
                System.out.println(event);
                return ListeningStatus.LISTENING;
            }

            /**
             * [机器人]群 "坦白说" 功能状态改变（事件）
             *
             * @param event
             */
            @EventHandler
            public ListeningStatus GroupAllowConfessTalkEvent(GroupAllowConfessTalkEvent event) {
                System.out.println(event);
                return ListeningStatus.LISTENING;
            }

            /**
             * [机器人]群 "允许群员邀请好友加群" 功能状态改变（事件）
             *
             * @param event
             */
            @EventHandler
            public ListeningStatus GroupAllowMemberInviteEvent(GroupAllowMemberInviteEvent event) {
                System.out.println(event);
                return ListeningStatus.LISTENING;
            }

            /**
             * [机器人]入群公告改变（事件）
             *
             * @param event
             */
            @EventHandler
            public ListeningStatus GroupEntranceAnnouncementChangeEvent(GroupEntranceAnnouncementChangeEvent event) {
                System.out.println(event);
                return ListeningStatus.LISTENING;
            }

            /**
             * [机器人]群名改变（事件）
             *
             * @param event
             */
            @EventHandler
            public ListeningStatus GroupNameChangeEvent(GroupNameChangeEvent event) {
                System.out.println(event);
                return ListeningStatus.LISTENING;
            }

            /**
             * [机器人]群 "全员禁言" 功能状态改变（事件）
             *
             * @param event
             */
            @EventHandler
            public ListeningStatus GroupMuteAllEvent(GroupMuteAllEvent event) {
                System.out.println(event);
                return ListeningStatus.LISTENING;
            }
            @Override
            public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
                super.handleException(context, exception);
            }
        });
    }

    public static void main(String[] args) {
        start();
        test();
    }

    private MiraiStart() {
    }
}

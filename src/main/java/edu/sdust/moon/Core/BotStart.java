package edu.sdust.moon.Core;

import edu.sdust.moon.Annotation.ExclusiveInClass;
import net.mamoe.mirai.Bot;
import net.mamoe.mirai.BotFactoryJvm;
import net.mamoe.mirai.utils.BotConfiguration;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class BotStart {
    private static final BotStart botStart = new BotStart ();

    private final HashMap<Long,QQ> QQs=new HashMap<>();

    public static BotStart getInstance () {
        return botStart;
    }

    public boolean Start () {
        for (var item : MiraiStart.getConfig ().getQQs ()) {
            var bot = BotFactoryJvm.newBot (item.getQQ (), item.getPassword (), new BotConfiguration () {
                {
                    fileBasedDeviceInfo (MiraiStart.getRunDir () + "/config/info.json");
                    switch (MiraiStart.getConfig ().getType ()) {
                        case 0:
                            setProtocol (MiraiProtocol.ANDROID_PHONE);
                            break;
                        case 1:
                            setProtocol (MiraiProtocol.ANDROID_WATCH);
                            break;
                    }
                }
            });
            try {
                bot.login ();
                bot.getConfiguration ().redirectNetworkLogToDirectory (new File (MiraiStart.getRunDir () + "/LOG/BotNetWork"));
                bot.getConfiguration ().redirectBotLogToDirectory (new File (MiraiStart.getRunDir () + "/LOG/BotLog"));
                QQs.put(item.getQQ(), new QQ(bot));
                MiraiStart.getLogger ().info ("QQ:" + item.getQQ () + "Is logged in");
            } catch (Exception e) {
                MiraiStart.getLogger ().error ("Robot error", e);
                return false;
            }
        }
        if (QQs.size () == 0) {
            MiraiStart.getLogger ().error ("No QQ login");
            return false;
        }
        return true;
    }

//    public Bot

    public void stop () {
        if (QQs.size () != 0) {
            QQs.values ().forEach (item -> {
                item.getBot().close(null);
            });
        }
    }

    public HashMap<Long, QQ> getQQs() {
        return QQs;
    }
}
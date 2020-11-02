package edu.sdust.moon.ListenerHost;

import edu.sdust.moon.Core.MiraiStart;
import kotlin.coroutines.CoroutineContext;
import net.mamoe.mirai.event.SimpleListenerHost;
import org.jetbrains.annotations.NotNull;

public class EventListener extends SimpleListenerHost {

    /**
     * 处理在处理事件中发生的未捕获异常
     * @param context   ......
     * @param exception ......
     */
    @Override
    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        MiraiStart.getLogger().error("在事件处理中发生异常" + "\n" + context, exception);
    }
}

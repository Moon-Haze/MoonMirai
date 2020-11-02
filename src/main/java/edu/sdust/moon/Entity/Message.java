package edu.sdust.moon.Entity;

import net.mamoe.mirai.contact.PermissionDeniedException;
import net.mamoe.mirai.message.data.MessageSource;

import java.util.HashMap;
import java.util.Map;

public class Message {
    private static final Map<Integer, MessageSource> MessageList = new HashMap<>();


    /**
     * @param source 消息
     * @return 如果此消息已经实例化，则返回已实例化的对象，否则返回的实例化对象，并储存。有低概率source获取其Id错误。
     */
    public static MessageSource createMessage(MessageSource source) {
        MessageSource messageCall = null;
        int id = source.getId();
        if (id != -1) {
            if (MessageList.containsKey(id)) {
                messageCall = MessageList.get(id);
            } else {
                MessageList.put(id, source);
            }
        }
        return messageCall;
    }

    /**
     * 撤回消息
     *
     * @return 撤回成功，则返回true；否则返回false
     * @throws PermissionDeniedException - 当 Bot 无权限操作时抛出
     * @throws IllegalStateException     - 当这条消息已经被撤回时抛出 (仅同步主动操作)
     */
    public static boolean reCall(MessageSource source) throws PermissionDeniedException, IllegalStateException {
        boolean is = false;
        if (source.getTime() < 3 * 60 * 100) {
            source.contentEquals("", true);
            source.getBot().recall(source);
            MessageList.remove(source.getId());
            is = true;
        }
        return is;
    }

}

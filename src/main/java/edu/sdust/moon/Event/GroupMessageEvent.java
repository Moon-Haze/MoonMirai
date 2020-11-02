package edu.sdust.moon.Event;


import edu.sdust.moon.Entity.Group;
import edu.sdust.moon.Entity.Member;
import net.mamoe.mirai.message.MessageReceipt;
import net.mamoe.mirai.message.data.MessageChain;

public class GroupMessageEvent extends Event {

     private MessageChain message;
    private Member sender;
    private int time;
    /**
     * 发信目标.
     */
    private Group target;

    private MessageReceipt<net.mamoe.mirai.contact.Group> receipt;

    public GroupMessageEvent(net.mamoe.mirai.message.GroupMessageEvent event) {
        sender = new Member(event.getSender());
        time = event.getTime();
        message = event.getMessage();
    }

    public GroupMessageEvent() {
    }

    public Member getSender() {
        return sender;
    }

    public void setSender(Member sender) {
        this.sender = sender;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Group getTarget() {
        return target;
    }

    public void setTarget(Group target) {
        this.target = target;
    }

    public MessageReceipt<net.mamoe.mirai.contact.Group> getReceipt() {
        return receipt;
    }

    public void setReceipt(MessageReceipt<net.mamoe.mirai.contact.Group> receipt) {
        this.receipt = receipt;
    }
    public MessageChain getMessage() {
        return message;
    }

    public void setMessage(MessageChain message) {
        this.message = message;
    }
}

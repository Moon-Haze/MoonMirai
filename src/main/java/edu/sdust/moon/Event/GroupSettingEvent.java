package edu.sdust.moon.Event;


import edu.sdust.moon.Entity.Group;
import edu.sdust.moon.Entity.Member;

public class GroupSettingEvent extends Event {
    /**
     * 原来的
     */
    public String origin;
    /**
    *  新的
    */
    public String  fresh;
    public Group group;
    /**
     * 操作人. 为 null 时则是机器人操作
     */
    public Member operator;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getFresh() {
        return fresh;
    }

    /**
     * 仅使用于 群 "全员禁言" 功能状态改变（事件），群 "坦白说" 功能状态改变（事件），
     * 群 "允许群员邀请好友加群" 功能状态改变（事件），群 "匿名聊天" 功能状态改变（事件）
     * 否则，报错。
     */
    public void setFresh(boolean fresh) {
        this.fresh = String.valueOf(fresh);
    }

    /**
     * 仅使用于 群 "全员禁言" 功能状态改变（事件），群 "坦白说" 功能状态改变（事件），
     * 群 "允许群员邀请好友加群" 功能状态改变（事件），群 "匿名聊天" 功能状态改变（事件）
     * 否则，报错。
     * @return Boolean true Or false
     */
    public boolean getOriginBool() {
        return Boolean.parseBoolean(origin);
    }
    /**
     * 仅使用于 群 "全员禁言" 功能状态改变（事件），群 "坦白说" 功能状态改变（事件），
     * 群 "允许群员邀请好友加群" 功能状态改变（事件），群 "匿名聊天" 功能状态改变（事件）
     * 否则，报错。
     */
    public void setOrigin(boolean origin) {
        this.origin = String.valueOf(fresh);
    }

    /**
     * 仅使用于 群 "全员禁言" 功能状态改变（事件），群 "坦白说" 功能状态改变（事件），
     * 群 "允许群员邀请好友加群" 功能状态改变（事件），群 "匿名聊天" 功能状态改变（事件）
     * 否则，报错。
     * @return Boolean true Or false
     */
    public boolean getFreshBool() {
        return Boolean.parseBoolean(origin);
    }

    public void setFresh(String fresh) {
        this.fresh = fresh;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Member getOperator() {
        return operator;
    }

    public void setOperator(Member operator) {
        this.operator = operator;
    }
}

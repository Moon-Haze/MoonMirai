package edu.sdust.moon.Entity;

import net.mamoe.mirai.contact.MemberPermission;

public class Member {
    /**
     * 所在的群.
     */
    private Group group;

    /**
     * 成员的权限, 动态更新.
     */
    private MemberPermission permission;

    /**
     * 群名片. 可能为空.
     * <p>
     * 管理员和群主都可修改任何人（包括群主）的群名片.
     */
    private String nameCard;

    /**
     * 群头衔.
     * <p>
     * 仅群主可以修改群头衔.
     */
    private String specialTitle;

    /**
     * 被禁言剩余时长. 单位为秒.
     */
    private int muteTimeRemaining;

    public Member() {

    }

    public Member(net.mamoe.mirai.contact.Member sender) {
    }
}

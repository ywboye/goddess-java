package com.bjike.goddess.capitalpreparation.type;

/**
 * 审批类型
 *
 * @Author: [yewenbo]
 * @Date: [2017-03-30 09:37]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public enum ApproveType {
    /**
     * 未通过
     */
    NONE(0),
    /**
     * 通过
     */
    ALLOWED(1),
    /**
     * 拒绝
     */
    DENIED(2)
    ;

    private int value;

    ApproveType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

package orderfoodMT.entity;

import lombok.Data;

/**
 * @author: lanxinyu@meituan.com  2018-10-24 下午5:47
 * @Description:
 */
@Data
public class DishPracticeInfoCO {
    /**
     * 加工方法id
     */
    private String practiceId;
    /**
     * 1加料、2做法、3规格、原来加工方法只有这3种，但是所有通过加一个字段去标记的，都可以抽象成一种加工方法
     *
     * 因为加工方法无外乎，加工方法的id、类别、算钱模式等
     * 4实价、5称重、6最小起售份数、7套餐中的必选菜、8可重复选的菜 都可以抽象成加工方法，如果需要细分按type区分
     *
     */
    private String practiceType;
    /**
     * DishCO对应的 dishId
     * dishId为套餐中的必选菜
     */
    private String dishId;
    /**
     * 加价类型 0直接加，其他是 乘以的 系数，
     * 比如称重菜practiceType=5，
     * 这个系数就是 （increaseMode斤-1）* dishCO.price = increasePrice,可为负数。
     */
    private String increaseMode;
    /**
     * 加工方法名称 红烧、加珍珠、大份、称重
     */
    private String practiceName;
    /**
     * 加价金额
     */
    private String increasePrice;
    /**
     * 是否默认加工方法1是0否
     */
    private String isDefault;
    /**
     * 是否必选加工方法1是0否
     * 比如如果这个是
     * 称重菜 （5）
     * 或者有
     * 最小起售份数 （6）
     * 或者
     * 套餐中的必选菜 （7）
     * 那么这个加工方法就是绑定的或者说是必选的加工方法；
     */
    private String isBinding;
    /**
     * 拓展字段
     */
    String extContent;

}

package com.meituan.structure.bridge.practice.abstraction;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author: lanxinyu@meituan.com  2018-09-21 下午2:22
 * @Description: 菜单的抽象
 */
@Setter
@Getter
public abstract class AbstractMenu implements Price, Show{

    protected static final String COMMON_DISPLAY = "食物 :\n%s\n总金额 「%s」\n桌号 「%s」";
    /**
     * 菜单中的食物
     */
    private List<AbstractFood> foods;

    /**
     * 菜单中的桌号
     */
    private List<Integer> tableNum;

    /**
     * 其它信息
     */
    private List<BillExtra> billExtras;

    @Override
    public BigDecimal commonAmt() {
        BigDecimal commonAmt = BigDecimal.ZERO;
        for(AbstractFood food: foods) {
            commonAmt = commonAmt.add(food.commonAmt());
        }

        //add billExtrasAmt
        return commonAmt;

    }

    @Override
    public BigDecimal vipAmt() {
        BigDecimal vipAmt = BigDecimal.ZERO;
        for(AbstractFood food: foods) {
            vipAmt = vipAmt.add(food.vipAmt());
        }

        //add billExtrasAmt
        return vipAmt;
    }


    @Override
    public String show(Boolean isVip) {
        StringBuilder sb = new StringBuilder();
        for(AbstractFood food:foods) {
            sb.append(food.show(isVip)).append("\n");
        }
        return String.format(COMMON_DISPLAY, sb.toString(), caculateAmt(isVip), tableNum.toString());
    }
}

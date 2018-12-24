package com.meituan.structure.bridge.practice.abstraction;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
public abstract class AbstractFood implements Price,Show {
    protected List<FoodWork> foodWorks;
    protected BigDecimal amt;
    protected BigDecimal vipAmt;
    protected Integer foodId;
    protected String foodName;

    protected static final String COMMON_DISPLAY = "菜品 「%s」\n 金额 「%s」 \n 做法 「%s」";

    public AbstractFood(String foodName, BigDecimal amt, BigDecimal vipAmt, List<FoodWork> foodWorks) {
        this.foodName = foodName;
        this.amt = amt;
        this.vipAmt = vipAmt;
        this.foodWorks = foodWorks;
    }

    @Override
    public String show(Boolean isVip) {
        return String.format(COMMON_DISPLAY, foodName, caculateAmt(isVip), JSON.toJSONString(foodWorks));
    }
}

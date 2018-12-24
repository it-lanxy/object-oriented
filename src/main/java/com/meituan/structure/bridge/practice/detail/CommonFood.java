package com.meituan.structure.bridge.practice.detail;

import com.meituan.structure.bridge.practice.abstraction.AbstractFood;
import com.meituan.structure.bridge.practice.abstraction.FoodWork;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author: lanxinyu@meituan.com  2018-09-21 下午2:50
 * @Description: 鱼
 */
public class CommonFood extends AbstractFood {


    public CommonFood(String foodName, BigDecimal amt, BigDecimal vipAmt, List<FoodWork> foodWorks) {
        super(foodName, amt, vipAmt, foodWorks);
    }

    @Override
    public BigDecimal commonAmt() {
        return amt;
    }

    @Override
    public BigDecimal vipAmt() {
        return vipAmt;
    }
}

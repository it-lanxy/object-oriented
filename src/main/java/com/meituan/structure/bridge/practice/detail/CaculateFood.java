package com.meituan.structure.bridge.practice.detail;

import com.meituan.structure.bridge.practice.abstraction.AbstractFood;
import com.meituan.structure.bridge.practice.abstraction.FoodWork;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * @author: lanxinyu@meituan.com  2018-09-21 下午2:56
 * @Description: 计算类食物, 比如按斤撑的鱼
 */
public class CaculateFood extends AbstractFood {

    private Double weight;
    /**
     * 加工费
     */
    private BigDecimal processAmt;
    public CaculateFood(String foodName, Double weight, BigDecimal processAmt, BigDecimal amt, BigDecimal vipAmt, List<FoodWork> foodWorks) {
        super(foodName, amt, vipAmt, foodWorks);
        this.weight = weight;
        this.processAmt = processAmt;
    }

    @Override
    public BigDecimal commonAmt() {
        return amt
                .multiply(new BigDecimal(weight))
                .add(processAmt).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal vipAmt() {
        return vipAmt
                .multiply(new BigDecimal(weight))
                .add(processAmt).setScale(2, RoundingMode.HALF_UP);
    }
}

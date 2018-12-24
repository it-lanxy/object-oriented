package com.meituan.structure.bridge.practice.abstraction;

import lombok.Getter;

/**
 * 实物做法
 */
@Getter
public class FoodWork {
    /**
     * 比如：0正常 1酸 2甜 3苦 4辣 5清蒸 6蒜
     * @return
     */
    Integer taste;

    /**
     * 0正常 1微 2重
     * @return
     */
    Integer level;

    public FoodWork(Integer taste, Integer level) {
        this.taste = taste;
        this.level = level;
    }
}

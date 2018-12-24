package com.meituan.structure.bridge.practice.abstraction;

import java.math.BigDecimal;

public interface Price {
    BigDecimal commonAmt();
    BigDecimal vipAmt();
    default BigDecimal caculateAmt(Boolean isVip){
        return isVip? vipAmt(): commonAmt();
    }
}

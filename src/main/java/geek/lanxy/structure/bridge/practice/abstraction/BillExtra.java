package geek.lanxy.structure.bridge.practice.abstraction;

import java.math.BigDecimal;

/**
 * @author: lanxinyu@meituan.com  2018-09-21 下午2:44
 * @Description: 账单其它信息
 */
public interface BillExtra extends Price{
    /**
     * 比如：0桌台费 1服务费 计算公式xxx
     * @return
     */
    Integer type();

    /**
     * 0正常 1微 2重
     * @return
     */
    BigDecimal amt();
}

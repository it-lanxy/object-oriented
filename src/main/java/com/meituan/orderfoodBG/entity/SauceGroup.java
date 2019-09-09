package orderfoodBG.entity;

import java.util.List;

/**
 * @author: lanxinyu@meituan.com 2018-10-29 下午3:03
 * @Description:
 */
public class SauceGroup {
    String sauceGroupId;
    String sauceGroupName;
    /**
     * 单选多选
     */
    Integer type;
    List<Sauce> sauceList;
}

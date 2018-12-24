package orderfoodBG.entity;

/**
 * @author: lanxinyu@meituan.com  2018-10-29 下午3:01
 * @Description: 加料
 */
public class Sauce {
    /**
     * 加料id
     */
    String sauceId;
    /**
     * 加料描述
     */
    String sauceDesc;

    Long sellPrice;

    Long memberPrice;
    /**
     * 是否必选  Y N
     */
    Boolean mustSelect;
    /**
     * 是否重复选  Y N
     */
    Boolean repeatSelect;
}

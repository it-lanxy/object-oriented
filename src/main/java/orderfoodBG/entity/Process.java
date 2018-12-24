package orderfoodBG.entity;


/**
 * @author: lanxinyu@meituan.com  2018-10-25 下午10:40
 * @Description: 做法&加料
 */
public class Process{
    /**
     * 做法id
     */
    String processId;
    /**
     * 做法描述
     */
    String processDesc;

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

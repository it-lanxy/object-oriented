package orderfoodBG.entity;

/**
 * @author: lanxinyu@meituan.com 2018-10-25 下午10:32
 * @Description:
 */
public class DishBasic {
    /**
     * 菜id
     */
    String dishId;
    /**
     * 菜名
     */
    String dishName;
    /**
     * 菜品图片uri
     */
    String imgUri;
    /**
     * 售卖价格
     */
    Long sellPrice;
    /**
     * 会员价格
     */
    Long memberPrice;
    /**
     * 餐盒价格
     */
    Long boxPrice;
    /**
     * 菜单位：粒、份、盘。可做成字典key
     */
    String unit;
    /**
     * 是否称重菜 Y是 N否
     */
    Boolean isWeight;
    /**
     * 是否是价 Y是 N否
     */
    Boolean curPriceFlag;
    /**
     * 菜品状态 open stop
     */
    Boolean status;
    /**
     * 起点份数
     */
    Integer minServing;
}

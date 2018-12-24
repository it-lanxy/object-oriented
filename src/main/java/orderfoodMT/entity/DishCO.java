package orderfoodMT.entity;

import lombok.Data;

/**
 * @author: lanxinyu@meituan.com  2018-10-24 下午5:17
 * @Description:
 */
@Data
public class DishCO {
    String dishId;
    /**
     * 小类，比如套餐中的"热菜"、"凉菜"
     */
    String categorySmallId;
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
    String sellPrice;
    /**
     * 会员价格
     */
    String memberPrice;

    /**
     * 餐盒价格
     */
    String boxPrice;
    /**
     * 排序
     */
    String sort;
    /**
     * 菜单位：粒、份、盘。可做成字典key
     */
    String unit;
    /**
     * 菜品扩展json字段 比如一些下单信息，可放入这里，而不必单独提供字段
     */
    String extContent;
}

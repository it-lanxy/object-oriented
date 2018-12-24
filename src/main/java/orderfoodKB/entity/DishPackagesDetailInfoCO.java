package orderfoodKB.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: lanxinyu@meituan.com  2018-10-24 上午11:57
 * @Description: 套餐明细list
 */
@Setter
@Getter
public class DishPackagesDetailInfoCO {
    private String packages_sku_id;// String	可选	32	套餐的sku_code	s1232131231
    private String detail_sku_id;// String	可选	32	套餐明细的skuId	s1231312321
    private String detail_sell_price;// Price	可选	18	明细菜品在套餐里的售卖单价	12.12
    private String detail_member_price;// Price	可选	18	明细菜品的会员价格单价	11.11
    private String detail_count;// String	可选	12	明细菜品在套餐里的个数, 不填默认为1	1
    private String detail_sort;// String	必填	32	排序字段 必输 仅为数字 越小排在前面	1
    private String detail_type;// String	必填	32	明细的类型，dish:单品 还是 group:项目	group
    private String detail_is_select;// String	可选	32	是否追加可选 Y .N 明细是否追加可选	N
    private String group_id;// String	可选	32	套餐组id,如果类型是group 必须要填groupId	G20181231232131
}

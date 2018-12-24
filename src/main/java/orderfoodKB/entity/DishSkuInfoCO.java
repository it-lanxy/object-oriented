package orderfoodKB.entity; //

import lombok.Getter;
import lombok.Setter;

/**
 * @author: lanxinyu@meituan.com  2018-10-24 上午11:53
 * @Description:
 */
@Setter
@Getter
public class DishSkuInfoCO {
    /**
     * DishesCO.dishesId, price, vipPrice
     */
    private String dish_id; //	String	可选	32	口碑的菜品id,新增的时候可以为空	d20180501000000001
    private String sell_price; //	Price	必填	18	售卖价格	12.12
    private String member_price; //	Price	必填	32	会员价格	11.11
    private String status; //	String	可选	32	open 启动 stop 停用 变更状态的时候必输入.新增时候如果不设置默认设置启动	open

    private String spec_code_01; //	String	可选	32	规则id1	c201800312313
    private String spec_code_02; //	String	可选	32	规格2	z2018312312313
    private String spec_code_03; //	String	可选	32	规格3	z1232131
    private String spec_code_04; //	String	可选	32	规格4	z124312412
    private String spec_code_05; //	String	可选	32	规格5	z21231

    private String box_price; //	Price	可选	18	餐盒费用	8.8
    private String sku_ext_content; //	String	可选	1024	sku的扩展字典,json字符串	{\"key\":\"values\"}
    private String sku_sort; // String	必填	12	sku的排序字段

    private DishPackagesDetailInfoCO[] dish_packages_detail_list; //可选	100000	套餐明细list
    private String goods_sku_id;//	String	可选	32	商品的skuId

    /**
     * 废弃字段
     */
    private String sku_id; //	String	可选	32	sku的id 口碑生成	s201801231232131
}

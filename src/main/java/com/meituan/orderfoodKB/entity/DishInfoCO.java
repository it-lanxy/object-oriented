package orderfoodKB.entity; //

import lombok.Getter;
import lombok.Setter;

/**
 * @author: lanxinyu@meituan.com 2018-10-24 上午11:48
 * @Description:
 */
@Setter
@Getter
public class DishInfoCO {
    /**
     * DishesCO.dishesId, dishesName, dishesSummary， dishesImage, season, dishesUnit, quantity
     */
    private String dish_id; // String 可选 32 口碑的菜品id,新增的时候可以为空 d20180501000000001
    private String dish_name; // String 必填 1024 菜品的名称 土豆丝
    private String remarks; // String 可选 1024 菜品的描述 土豆丝用土豆制作而成
    private String dish_img; // String 可选 1024 商品图片，需要先调用素材的图片上传api得到图片id a23123dsaaawe1
    private String cur_price_flag; // String 可选 32 是否是价 Y:是 N否 Y
    private String unit_id; // String 可选 32 单位id 字典的id 123123123
    private String status; // String 可选 32 open 启动 stop 停用 open

    /**
     * MenuInfo.DishesTypeCO.typeName
     */
    private String dish_cuisine; // String 可选 128 菜系,商家自定义 最火热，好吃的
    private String type_big; // String 必填 32 口碑枚举定义 single:单品; //packages：套餐 single
    private String type_small; // String 可选 32 小类,口碑枚举定义 fixed：固定套餐; //choose:选N套餐 几选几 fixed
    private String ext_content; // String 可选 1024 扩展字段,json串 {\"key\":\"values\"}
    private DishSkuInfoCO[] dish_sku_list; // dishSkuInfo[] 可选 100000 菜品sku列表
    private DishPracticeInfoCO[] dish_practice_list; // DishPracticeInfo[] 可选 10000 做法加价列表

    /**
     * 废弃字段
     */
    private String goods_id; // String 可选 32 口碑的商品id,用于营销透传 2018010200000102030120
    private String nb_remember_code; // String 可选 32 数字助记码 1232132
    private String en_remember_code; // String 可选 32 拼音助记码 toudousi
    private String catetory_big_id; // String 可选 32 分类字典大类的id z2018000102313
    private String catetory_small_id; // String 可选 32 小类,商家自定义配置表例如 肉，酒水，素菜 z2131312312312
    private String min_serving; // String 可选 32 起点分数 222
    private String dish_version; // String 可选 32 版本号 就是一个数据操作的时间戳 1232132131232131321
    private String merchant_id; // String 必填 32 商家id 2088123123123213
    private String create_user; // String 可选 32 操作员 张三
    private String update_user; // String 可选 32 修改操作小二 李四

}

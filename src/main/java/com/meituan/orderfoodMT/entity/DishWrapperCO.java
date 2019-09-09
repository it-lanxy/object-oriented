package orderfoodMT.entity;

import java.util.List;
import java.util.Map;

import lombok.Data;

/**
 * @author: lanxinyu@meituan.com 2018-10-24 下午5:23
 * @Description: 拥有一些和菜本身无关的，控制菜排列组合等的 菜描述层&菜
 */
@Data
public class DishWrapperCO {

    /**
     * 单菜就是 dishId，套餐就是 套餐id
     */
    String wrapperId;
    /**
     * 「包装名称」单品：土豆丝；套餐：满汉全席套餐
     */
    String wrapperName;
    /**
     * 包装菜的 img uri
     */
    String wrapperImgUri;
    /**
     * 『简介』土豆丝由土豆、豆油混炒而成；满汉全席有猪头肉，鸭子，鹅
     */
    String describe;
    /**
     * 如果是单品，就是DishCO中的sellPrice 如果是套餐，就是套餐售卖基础价格 如果是单品&称重菜，就是一斤的价格
     */
    String sellPrice;
    /**
     * 如果是单品，就是DishCO中的memberPrice 如果是套餐，就是套餐售卖基础会员价格 如果是单品&称重菜，就是一斤的价格
     */
    String memberPrice;
    /**
     * 1单品，2简易套餐，3多选套餐，4套餐几选几
     */
    String type;
    /**
     * 启用1、停用2
     */
    String status;
    /**
     * 库存
     */
    String repertoryNum;
    /**
     * "包装菜"单位
     */
    String unit;
    /**
     * 如果是单品、取dishList.get(0)
     */
    List<DishCO> dishList;
    /**
     * 加工相关
     */
    List<DishPracticeInfoCO> dishPracticeInfoList;
    /**
     * 套餐专属 可替换菜id, key为主菜，value为被选菜id
     */
    Map<String, List<String>> replaceablePairMap;
    /**
     * 套餐几选几 key categorySmallId value 数量
     */
    Map<String, Integer> freeChoicePairMap;
    /**
     * 套餐中的必选菜，dishIdList
     */
    List<String> mustEatDishIdList;
    /**
     * 套餐中的默认选择菜
     */
    List<String> defaultChooseDishIdList;
    /**
     * 既然这是一个"包装"，那么包装里面放字典、放销售额，都是合理的 key categorySmallId value 可以使json str，也可以是 describe
     */
    Map<String, String> dictMap;
    /**
     * 拓展字段
     */
    String extContent;

}

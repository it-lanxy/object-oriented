package orderfoodBG.entity;


import java.util.List;

/**
 * @author: lanxinyu@meituan.com  2018-10-25 下午10:31
 * @Description: 菜通用属性
 */
public class Dish{
    /**
     * 菜的基本属性
     */
    DishBasic dishBasic;
    /**
     * 排序 「kb」
     */
    Integer sort;
    /**
     * 是否默认 Y N
     */
    Boolean defaultSelect;
    /**
     * 是否必选  Y N
     */
    Boolean mustSelect;
    /**
     * 是否重复选  Y N
     */
    Boolean repeatSelect;
    /**
     * 做法/加料
     */
    List<ProcessGroup> processList;
    /**
     * 规格
     */
    SpecGroup specGroup;
    /**
     * 替换菜ids
     */
    List<String> replaceDishIdList;
}

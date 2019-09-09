package orderfoodMT.entity;

import java.util.List;

import lombok.Data;

/**
 * @author: lanxinyu@meituan.com 2018-10-24 下午5:12
 * @Description:
 */
@Data
public class DishCategoryCO {
    /**
     * 品类id，比如川菜、粤菜，菜大门类的id
     */
    String categoryBigId;
    /**
     * 描述
     */
    String description;
    /**
     * 一个品类对应多个所谓的"包装菜"
     */
    List<DishWrapperCO> dishWrapperList;
    /**
     * 扩展json字段
     */
    String extContent;
}

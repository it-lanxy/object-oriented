package orderfoodPX.entity;

import java.io.Serializable;
import java.util.List;

import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;

/**
 * @author: lanxinyu@meituan.com 2018-09-29 上午11:49
 * @Description: 菜品扩展属性 idl PropertyGroup
 */
@ThriftStruct
public class DishesExtCO implements Serializable {

    private static final long serialVersionUID = 5283100386900607712L;
    /**
     * 加料 idl:PropertyGroupType
     */
    public static final Integer DISHES_EXT_TYPE_ADDITION = 1;
    /**
     * 做法
     */
    public static final Integer DISHES_EXT_TYPE_METHOD = 2;
    /**
     * 规格
     */
    public static final Integer DISHES_EXT_TYPE_NORM = 3;

    /**
     * 当前属性类别的分类id DishPracticeInfoCO.practiceId
     */
    private String id;
    /**
     * 分类餐厅Id TODO 讨论要不要单拿出来字段 DishPracticeInfoCO.extContent.restaurantId
     */
    private String restaurantId;
    /**
     * 分类名称 TODO 讨论要不要单拿出来字段 DishPracticeInfoCO.extContent.categoryName
     */
    private String categoryName;
    /**
     * 排序顺序,正整数,按数字从小到大排序 TODO 讨论要不要单拿出来字段 DishPracticeInfoCO.extContent.sort
     */
    private Integer sort;
    /**
     * 做法分类选择方式1-单选，2-多选 TODO 讨论要不要单拿出来字段 DishPracticeInfoCO.extContent.selectFlag
     */
    private Integer selectFlag;
    /**
     * 菜品扩展属性具体信息
     */
    private List<DishesExtDetailCO> dishesExtDetails;

    @ThriftField
    public void setId(String id) {
        this.id = id;
    }

    @ThriftField
    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    @ThriftField
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @ThriftField
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @ThriftField
    public void setSelectFlag(Integer selectFlag) {
        this.selectFlag = selectFlag;
    }

    @ThriftField
    public void setDishesExtDetails(List<DishesExtDetailCO> dishesExtDetails) {
        this.dishesExtDetails = dishesExtDetails;
    }

    @ThriftField(value = 1, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getId() {
        return id;
    }

    @ThriftField(value = 2, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getRestaurantId() {
        return restaurantId;
    }

    @ThriftField(value = 3, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getCategoryName() {
        return categoryName;
    }

    @ThriftField(value = 4, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getSort() {
        return sort;
    }

    @ThriftField(value = 5, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getSelectFlag() {
        return selectFlag;
    }

    @ThriftField(value = 6, requiredness = ThriftField.Requiredness.OPTIONAL)
    public List<DishesExtDetailCO> getDishesExtDetails() {
        return dishesExtDetails;
    }
}

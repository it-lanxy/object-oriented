package orderfoodPX.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;

/**
 * @author: lanxinyu@meituan.com 2018-09-29 下午12:12
 * @Description: 套餐 idl:Combos
 */
@ThriftStruct
public class DishesComboCO implements Serializable {
    private static final long serialVersionUID = 5895156214443661746L;

    /**
     * 套餐id DishWrapperCO.wrapperId
     *
     */
    private String id;
    /**
     * 套餐组的名字 DishWrapperCO.wrapperName
     */
    private String groupName;
    /**
     * 是否重复选 DishWrapperCO.dishPracticeInfoList.practiceType = 8 & isBinding = 1
     */
    private Integer isRepeatable;
    /**
     * 菜品数量 如果可重选 DishWrapperCO.dishPracticeInfoList.practiceType = 8 & DishWrapperCO.dishPracticeInfoList.increaseMode
     */
    private Integer count;
    /**
     * 价格 DishWrapperCO.sellPrice
     */
    private String price;
    /**
     * 套餐名称 DishWrapperCO.wrapperName
     */
    private String name;
    /**
     * 套餐中的菜品 DishWrapperCO.dishList
     */
    private List<ComboCO> comboList;
    /**
     * 菜品扩展属性 key 1 加料信息、2做法信息、3规格信息 value 相应的办法
     *
     * key DishWrapperCO.dishPracticeInfoList.practiceType value DishWrapperCO.dishPracticeInfoList
     */
    private Map<Integer, List<DishesExtCO>> typeDishesExtPair;
    /**
     * 索引
     */
    private Integer index;
    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 套餐code
     */
    private String combosCode;

    @ThriftField
    public void setId(String id) {
        this.id = id;
    }

    @ThriftField
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @ThriftField
    public void setIsRepeatable(Integer isRepeatable) {
        this.isRepeatable = isRepeatable;
    }

    @ThriftField
    public void setCount(Integer count) {
        this.count = count;
    }

    @ThriftField
    public void setPrice(String price) {
        this.price = price;
    }

    @ThriftField
    public void setName(String name) {
        this.name = name;
    }

    @ThriftField
    public void setComboList(List<ComboCO> comboList) {
        this.comboList = comboList;
    }

    @ThriftField
    public void setTypeDishesExtPair(Map<Integer, List<DishesExtCO>> typeDishesExtPair) {
        this.typeDishesExtPair = typeDishesExtPair;
    }

    @ThriftField
    public void setIndex(Integer index) {
        this.index = index;
    }

    @ThriftField
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @ThriftField
    public void setCombosCode(String combosCode) {
        this.combosCode = combosCode;
    }

    @ThriftField(value = 1, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getId() {
        return id;
    }

    @ThriftField(value = 2, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getGroupName() {
        return groupName;
    }

    @ThriftField(value = 3, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getIsRepeatable() {
        return isRepeatable;
    }

    @ThriftField(value = 4, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getCount() {
        return count;
    }

    @ThriftField(value = 5, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getPrice() {
        return price;
    }

    @ThriftField(value = 6, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getName() {
        return name;
    }

    @ThriftField(value = 7, requiredness = ThriftField.Requiredness.OPTIONAL)
    public List<ComboCO> getComboList() {
        return comboList;
    }

    @ThriftField(value = 8, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Map<Integer, List<DishesExtCO>> getTypeDishesExtPair() {
        return typeDishesExtPair;
    }

    @ThriftField(value = 9, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getIndex() {
        return index;
    }

    @ThriftField(value = 10, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getQuantity() {
        return quantity;
    }

    @ThriftField(value = 11, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getCombosCode() {
        return combosCode;
    }
}

package orderfoodPX.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;

/**
 * @author: lanxinyu@meituan.com 2018-09-29 下午12:19
 * @Description: 套餐中的单个菜品 idl:Cdat
 */
@ThriftStruct
public class ComboCO implements Serializable {
    private static final long serialVersionUID = -7200687908384865116L;

    /**
     * 菜品id
     */
    private String id;
    /**
     * 是否默认菜品 1：是 0： 不是
     */
    private Integer defaultFood;
    /**
     * count 菜品数量
     */
    private Integer count;
    /**
     * 名称
     */
    private String name;
    /**
     * 是否重复
     */
    private Integer isRepeatable;
    /**
     * 可替换菜品id
     */
    private String chooseFoodId;
    /**
     * 价格
     */
    private String price;
    /**
     * 菜品扩展属性 加料信息、做法信息、规格信息
     */
    private Map<Integer, List<DishesExtCO>> typeDishesExtPair;
    /**
     * code码
     */
    private String code;
    /**
     * 索引
     */
    private Integer index;
    /**
     * 备注
     */
    private String remark;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 是否必选
     */
    private Boolean necessary;
    /**
     * 套餐单位
     */
    private String unit;
    /**
     * 会员价格
     */
    private String vipPrice;
    /**
     * 对于简易套餐，用户选择替换菜后，总价为之前的价格加上priceDiff，priceDiff可能为负数
     */
    private String priceDiff;

    @ThriftField
    public void setId(String id) {
        this.id = id;
    }

    @ThriftField
    public void setDefaultFood(Integer defaultFood) {
        this.defaultFood = defaultFood;
    }

    @ThriftField
    public void setCount(Integer count) {
        this.count = count;
    }

    @ThriftField
    public void setName(String name) {
        this.name = name;
    }

    @ThriftField
    public void setIsRepeatable(Integer isRepeatable) {
        this.isRepeatable = isRepeatable;
    }

    @ThriftField
    public void setChooseFoodId(String chooseFoodId) {
        this.chooseFoodId = chooseFoodId;
    }

    @ThriftField
    public void setPrice(String price) {
        this.price = price;
    }

    @ThriftField
    public void setTypeDishesExtPair(Map<Integer, List<DishesExtCO>> typeDishesExtPair) {
        this.typeDishesExtPair = typeDishesExtPair;
    }

    @ThriftField
    public void setCode(String code) {
        this.code = code;
    }

    @ThriftField
    public void setIndex(Integer index) {
        this.index = index;
    }

    @ThriftField
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @ThriftField
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @ThriftField
    public void setNecessary(Boolean necessary) {
        this.necessary = necessary;
    }

    @ThriftField
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @ThriftField
    public void setVipPrice(String vipPrice) {
        this.vipPrice = vipPrice;
    }

    @ThriftField
    public void setPriceDiff(String priceDiff) {
        this.priceDiff = priceDiff;
    }

    @ThriftField(value = 1, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getId() {
        return id;
    }

    @ThriftField(value = 2, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getDefaultFood() {
        return defaultFood;
    }

    @ThriftField(value = 3, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getCount() {
        return count;
    }

    @ThriftField(value = 4, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getName() {
        return name;
    }

    @ThriftField(value = 5, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getIsRepeatable() {
        return isRepeatable;
    }

    @ThriftField(value = 6, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getChooseFoodId() {
        return chooseFoodId;
    }

    @ThriftField(value = 7, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getPrice() {
        return price;
    }

    @ThriftField(value = 8, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Map<Integer, List<DishesExtCO>> getTypeDishesExtPair() {
        return typeDishesExtPair;
    }

    @ThriftField(value = 9, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getCode() {
        return code;
    }

    @ThriftField(value = 10, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getIndex() {
        return index;
    }

    @ThriftField(value = 11, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getRemark() {
        return remark;
    }

    @ThriftField(value = 12, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getQuantity() {
        return quantity;
    }

    @ThriftField(value = 13, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Boolean getNecessary() {
        return necessary;
    }

    @ThriftField(value = 14, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getUnit() {
        return unit;
    }

    @ThriftField(value = 15, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getVipPrice() {
        return vipPrice;
    }

    @ThriftField(value = 16, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getPriceDiff() {
        return priceDiff;
    }
}

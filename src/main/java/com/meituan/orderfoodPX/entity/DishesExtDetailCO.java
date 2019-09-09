package orderfoodPX.entity;

import java.io.Serializable;

import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;

/**
 * @author: lanxinyu@meituan.com 2018-09-29 上午11:53
 * @Description: 菜品扩展属性具体信息 idl:Property
 */
@ThriftStruct
public class DishesExtDetailCO implements Serializable {

    private static final long serialVersionUID = -890307800239088220L;

    /**
     * 比如当前属性是做法：id就是做法id
     */
    private String id;
    /**
     * 比如当前属性是做法： name是做法的名称
     */
    private String name;
    /**
     * 价格相关
     */
    private String price;
    /**
     * ExtAttrType取规格NORM种类时，才有vip价格
     */
    private String vipPrice;
    /**
     * 价格方式：0，不加价 1：比例加价，此时price为1-100整数，需要额外加的金额为菜品单价*price/100 2：固定价格
     */
    private Integer priceWay;
    /**
     * 是否默认 做法：1:是 2:否 规格：1:是 0:否
     */
    private Integer isDefault;
    /**
     * 库存 「-1 无库存」
     */
    private Integer repertory;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 排序
     */
    private Integer index;

    @ThriftField
    public void setId(String id) {
        this.id = id;
    }

    @ThriftField
    public void setName(String name) {
        this.name = name;
    }

    @ThriftField
    public void setPrice(String price) {
        this.price = price;
    }

    @ThriftField
    public void setVipPrice(String vipPrice) {
        this.vipPrice = vipPrice;
    }

    @ThriftField
    public void setPriceWay(Integer priceWay) {
        this.priceWay = priceWay;
    }

    @ThriftField
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    @ThriftField
    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }

    @ThriftField
    public void setIndex(Integer index) {
        this.index = index;
    }

    @ThriftField
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @ThriftField(value = 1, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getId() {
        return id;
    }

    @ThriftField(value = 2, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getName() {
        return name;
    }

    @ThriftField(value = 3, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getPrice() {
        return price;
    }

    @ThriftField(value = 4, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getVipPrice() {
        return vipPrice;
    }

    @ThriftField(value = 5, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getPriceWay() {
        return priceWay;
    }

    @ThriftField(value = 6, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getIsDefault() {
        return isDefault;
    }

    @ThriftField(value = 7, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getRepertory() {
        return repertory;
    }

    @ThriftField(value = 8, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getQuantity() {
        return quantity;
    }

    @ThriftField(value = 9, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getIndex() {
        return index;
    }
}

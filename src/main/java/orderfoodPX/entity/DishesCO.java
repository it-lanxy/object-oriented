package orderfoodPX.entity;

import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author: lanxinyu@meituan.com  2018-09-29 上午11:41
 * @Description: 菜肴 idl:Dishes
 */
@ThriftStruct
public class DishesCO implements Serializable {

    private static final long serialVersionUID = -1550140897227137496L;

    /**
     *菜品id
     * DishWrapperCO.wrapperId
     */
    private String dishesId;
    /**
     *菜品名称
     * DishWrapperCO.wrapperName
     */
    private String dishesName;
    /**
     *菜品简介
     * DishWrapperCO.describe
     */
    private String dishesSummary;
    /**
     *菜品价格
     * DishWrapperCO.sellPrice
     */
    private String dishesPrice;
    /**
     *菜品会员价格
     * DishWrapperCO.memberPrice
     */
    private String dishesVipPrice;
    /**
     *菜品图片
     * DishWrapperCO.wrapperImgUri
     */
    private String dishesImage;
    /**
     *是否时价菜  0: 否   1：是
     * DishWrapperCO.dishPracticeInfoList.practiceType = 4
     */
    private Integer season;
    /**
     *是否称重菜  0：否  1：是
     * DishWrapperCO.dishPracticeInfoList.practiceType = 5
     */
    private String weigh;
    /**
     *菜品单位
     * DishWrapperCO.unit
     */
    private String dishesUnit;
    /**
     *最小起售份数
     * DishWrapperCO.dishPracticeInfoList.practiceType = 6
     */
    private Integer minCount;
    /**
     *是否必选菜, true：必选  false：不是必选
     * DishWrapperCO.dishPracticeInfoList.practiceType = 7
     */
    private Boolean necessary;
    /**
     *菜品类别信息
     * dishesType.typeId -> DishCO.categorySmallId DishWrapperCO.dictMap.key
     * dishesType.typeName -> DishWrapperCO.dictMap.valueJSON.typeName
     * dishesType.code -> DishWrapperCO.dictMap.valueJSON.code
     */
    private DishesTypeCO dishesType;
    /**
     *菜品扩展属性 1加料信息、2做法信息、3规格信息
     * 1加料信息 -> DishWrapperCO.dishPracticeInfoList.practiceType = 1
     * 2做法信息 -> DishWrapperCO.dishPracticeInfoList.practiceType = 2
     * 3规格信息 -> DishWrapperCO.dishPracticeInfoList.practiceType = 3
     *
     */
    private Map<Integer, List<DishesExtCO>> typeDishesExtPair;
    /**
     *备选套餐列表
     */
    private List<DishesComboCO> dishesComboList;
    /**
     * 库存 「-1 无库存」
     * DishWrapperCO.status
     * DishWrapperCO.repertoryNum
     */
    private Integer repertory;
    /**
     * 套餐定价模式，0固定，1菜品合计价格，默认：0
     * TODO 和算钱逻辑相关，实现具体的算钱逻辑的
     */
    private Integer pricingType;
    /**
     * 套餐的初始价格
     */
    private String startPrice;
    /**
     * 套餐的会员初始价格
     */
    private String startVipPrice;
    /**
     * 索引
     */
    private Integer index;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 备注
     */
    private String remark;
    /**
     * 带规格加料做法的金额
     */
    private Long wholePrice;
    /**
     * 带规格加料做法的vip金额
     */
    private Long wholeVipPrice;
    /**
     * 菜品唯一标识
     */
    private String cartItemId;
    /**
     * 菜品编码
     */
    private String dishesCode;

    /**
     * 食物属性0:单品 ，1:套餐，2:简易套餐，3:多选套餐，4:组合套餐
     */
    private Integer foodProperty;

    @ThriftField
    public void setDishesId(String dishesId) {
        this.dishesId = dishesId;
    }
    @ThriftField
    public void setDishesName(String dishesName) {
        this.dishesName = dishesName;
    }
    @ThriftField
    public void setDishesSummary(String dishesSummary) {
        this.dishesSummary = dishesSummary;
    }
    @ThriftField
    public void setDishesPrice(String dishesPrice) {
        this.dishesPrice = dishesPrice;
    }
    @ThriftField
    public void setDishesVipPrice(String dishesVipPrice) {
        this.dishesVipPrice = dishesVipPrice;
    }
    @ThriftField
    public void setDishesImage(String dishesImage) {
        this.dishesImage = dishesImage;
    }
    @ThriftField
    public void setSeason(Integer season) {
        this.season = season;
    }
    @ThriftField
    public void setWeigh(String weigh) {
        this.weigh = weigh;
    }
    @ThriftField
    public void setDishesUnit(String dishesUnit) {
        this.dishesUnit = dishesUnit;
    }
    @ThriftField
    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
    }
    @ThriftField
    public void setNecessary(Boolean necessary) {
        this.necessary = necessary;
    }
    @ThriftField
    public void setDishesType(DishesTypeCO dishesType) {
        this.dishesType = dishesType;
    }
    @ThriftField
    public void setTypeDishesExtPair(Map<Integer, List<DishesExtCO>> typeDishesExtPair) {
        this.typeDishesExtPair = typeDishesExtPair;
    }
    @ThriftField
    public void setDishesComboList(List<DishesComboCO> dishesComboList) {
        this.dishesComboList = dishesComboList;
    }
    @ThriftField
    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }
    @ThriftField
    public void setPricingType(Integer pricingType) {
        this.pricingType = pricingType;
    }
    @ThriftField
    public void setStartPrice(String startPrice) {
        this.startPrice = startPrice;
    }
    @ThriftField
    public void setStartVipPrice(String startVipPrice) {
        this.startVipPrice = startVipPrice;
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
    public void setRemark(String remark) {
        this.remark = remark;
    }
    @ThriftField
    public void setWholePrice(Long wholePrice) {
        this.wholePrice = wholePrice;
    }
    @ThriftField
    public void setWholeVipPrice(Long wholeVipPrice) {
        this.wholeVipPrice = wholeVipPrice;
    }
    @ThriftField
    public void setCartItemId(String cartItemId) {
        this.cartItemId = cartItemId;
    }
    @ThriftField
    public void setDishesCode(String dishesCode) {
        this.dishesCode = dishesCode;
    }
    @ThriftField
    public void setFoodProperty(Integer foodProperty) {
        this.foodProperty = foodProperty;
    }
    @ThriftField(value = 1, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getDishesId() {
        return dishesId;
    }
    @ThriftField(value = 2, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getDishesName() {
        return dishesName;
    }
    @ThriftField(value = 3, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getDishesSummary() {
        return dishesSummary;
    }
    @ThriftField(value = 4, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getDishesPrice() {
        return dishesPrice;
    }
    @ThriftField(value = 5, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getDishesVipPrice() {
        return dishesVipPrice;
    }
    @ThriftField(value = 6, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getDishesImage() {
        return dishesImage;
    }
    @ThriftField(value = 7, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getSeason() {
        return season;
    }
    @ThriftField(value = 8, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getWeigh() {
        return weigh;
    }
    @ThriftField(value = 9, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getDishesUnit() {
        return dishesUnit;
    }
    @ThriftField(value = 10, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getMinCount() {
        return minCount;
    }
    @ThriftField(value = 11, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Boolean getNecessary() {
        return necessary;
    }
    @ThriftField(value = 12, requiredness = ThriftField.Requiredness.OPTIONAL)
    public DishesTypeCO getDishesType() {
        return dishesType;
    }
    @ThriftField(value = 13, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Map<Integer, List<DishesExtCO>> getTypeDishesExtPair() {
        return typeDishesExtPair;
    }
    @ThriftField(value = 14, requiredness = ThriftField.Requiredness.OPTIONAL)
    public List<DishesComboCO> getDishesComboList() {
        return dishesComboList;
    }
    @ThriftField(value = 15, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getRepertory() {
        return repertory;
    }
    @ThriftField(value = 16, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getPricingType() {
        return pricingType;
    }
    @ThriftField(value = 17, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getStartPrice() {
        return startPrice;
    }
    @ThriftField(value = 18, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getStartVipPrice() {
        return startVipPrice;
    }
    @ThriftField(value = 19, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getIndex() {
        return index;
    }
    @ThriftField(value = 20, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getQuantity() {
        return quantity;
    }
    @ThriftField(value = 21, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getRemark() {
        return remark;
    }
    @ThriftField(value = 22, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Long getWholePrice() {
        return wholePrice;
    }
    @ThriftField(value = 23, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Long getWholeVipPrice() {
        return wholeVipPrice;
    }
    @ThriftField(value = 24, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getCartItemId() {
        return cartItemId;
    }
    @ThriftField(value = 25, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getDishesCode() {
        return dishesCode;
    }
    @ThriftField(value = 26, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getFoodProperty() {
        return foodProperty;
    }
}

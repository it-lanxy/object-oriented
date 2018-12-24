package orderfoodPX.entity;

import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;

import java.io.Serializable;

/**
 * @author: lanxinyu@meituan.com  2018-09-27 下午5:54
 * @Description: 会员信息摘要
 */
@ThriftStruct
public class MemberSummaryCO implements Serializable {

    private static final long serialVersionUID = 2296860134009807328L;

    private Long id;
    private String cardNum;
    /**
     * 会员积分
     */
    private Long points;

    /**
     * 余额单位 分
     */
    private Double amt;

    /**
     * 优惠券数量
     * TODO：确定优惠券数量指的是用户持有的优惠券数量？那么当前没有相应信息吧，去哪查呢
     */
    private Integer couponNum;

    /**
     * 会员等级名称 eq 金卡、银卡
     */
    private String cardName;

    /**
     * 折扣类型
     * TODO: 貌似有不同的折扣类型，展示文案是怎样的？
     */
    private String disCountType;

    /**
     * 折扣名称
     */
    private String disCountName;
    /**
     *积分基数兑换（单位分）
     */
    private Long moneyBase;
    /**
     *积分兑换基数
     *多少pointBase 换多少moneyBase（单位分）
     */
    private Long pointBase;
    @ThriftField
    public void setPoints(Long points) {
        this.points = points;
    }
    @ThriftField
    public void setAmt(Double amt) {
        this.amt = amt;
    }
    @ThriftField
    public void setCouponNum(Integer couponNum) {
        this.couponNum = couponNum;
    }
    @ThriftField
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
    @ThriftField
    public void setDisCountType(String disCountType) {
        this.disCountType = disCountType;
    }
    @ThriftField
    public void setDisCountName(String disCountName) {
        this.disCountName = disCountName;
    }
    @ThriftField
    public void setId(Long id) {
        this.id = id;
    }
    @ThriftField
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }
    @ThriftField
    public void setMoneyBase(Long moneyBase) {
        this.moneyBase = moneyBase;
    }
    @ThriftField
    public void setPointBase(Long pointBase) {
        this.pointBase = pointBase;
    }
    @ThriftField(value = 1, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Long getPoints() {
        return points;
    }
    @ThriftField(value = 2, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Double getAmt() {
        return amt;
    }
    @ThriftField(value = 3, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getCouponNum() {
        return couponNum;
    }
    @ThriftField(value = 4, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getCardName() {
        return cardName;
    }
    @ThriftField(value = 5, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getDisCountType() {
        return disCountType;
    }
    @ThriftField(value = 6, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getDisCountName() {
        return disCountName;
    }
    @ThriftField(value = 7, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Long getId() {
        return id;
    }
    @ThriftField(value = 8, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getCardNum() {
        return cardNum;
    }
    @ThriftField(value = 9, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Long getMoneyBase() {
        return moneyBase;
    }
    @ThriftField(value = 10, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Long getPointBase() {
        return pointBase;
    }
}

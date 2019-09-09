package orderfoodPX.entity;

import java.io.Serializable;

import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;

/**
 * @author: lanxinyu@meituan.com 2018-09-27 下午5:55
 * @Description: 开卡信息摘要
 */
@ThriftStruct
public class OpenCardSummaryCO implements Serializable {

    private static final long serialVersionUID = -4567737153525433703L;
    /**
     * 开卡活动类型。1.开卡活动，2.消费满赠，3.储值满赠，4.生日活动，5.精准营销
     */
    private Integer type;

    /**
     * 活动描述文案
     */
    private String describe;

    @ThriftField
    public void setType(Integer type) {
        this.type = type;
    }

    @ThriftField
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @ThriftField(value = 1, requiredness = ThriftField.Requiredness.OPTIONAL)
    public Integer getType() {
        return type;
    }

    @ThriftField(value = 2, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getDescribe() {
        return describe;
    }
}

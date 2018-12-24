package orderfoodPX.entity;

import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;

import java.io.Serializable;

/**
 * @author: lanxinyu@meituan.com  2018-09-29 上午11:46
 * @Description: 菜品品类 idl:DishesType
 */
@ThriftStruct
public class DishesTypeCO implements Serializable {
    private static final long serialVersionUID = 8313396840838135662L;
    /**
     * 菜品品类id
     */
    private String typeId;
    /**
     * 菜品品类名称
     */
    private String typeName;
    /**
     * code 编号
     */
    private String code;
    @ThriftField
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
    @ThriftField
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    @ThriftField
    public void setCode(String code) {
        this.code = code;
    }
    @ThriftField(value = 1, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getTypeId() {
        return typeId;
    }
    @ThriftField(value = 2, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getTypeName() {
        return typeName;
    }
    @ThriftField(value = 3, requiredness = ThriftField.Requiredness.OPTIONAL)
    public String getCode() {
        return code;
    }
}

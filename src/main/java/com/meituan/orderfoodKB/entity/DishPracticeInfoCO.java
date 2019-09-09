package orderfoodKB.entity;//

import lombok.Getter;
import lombok.Setter;

/**
 * @author: lanxinyu@meituan.com 2018-10-24 下午2:26
 * @Description:做法加价列表
 */
@Setter
@Getter
public class DishPracticeInfoCO {
    private String dish_id;// String 可选 32 口碑的菜品id d20180501000000001
    private String increase_mode;// String 必填 18 加价类型 add:直接加 multiply:乘以系数 add
    private String practice_name;// String 必填 1024 做法名称 红烧
    private String increase_price;// Price 必填 18 加价金额 12.12
}

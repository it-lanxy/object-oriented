package orderfoodBG.entity;

import java.util.List;

/**
 * @author: lanxinyu@meituan.com  2018-10-25 下午10:33
 * @Description:
 */
public class SelectGroup {

    /**
     * 凉菜、热菜id
     */
    String groupId;
    /**
     * 小组名称
     */
    String groupName;
    List<Dish> dishList;
    Integer totleNum;
    Integer selectNum;
}
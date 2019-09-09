package orderfoodBG.entity;

import java.util.List;

/**
 * @author: lanxinyu@meituan.com 2018-10-26 下午8:30
 * @Description:
 */
public class ProcessGroup {
    String processGroupId;
    String processGroupName;
    /**
     * 单选多选
     */
    Integer type;
    List<Process> processList;
}

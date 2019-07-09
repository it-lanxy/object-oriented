package cardInfo.service;

import cardInfo.entity.BankCardInfo;

/**
 * @author: lanxinyu@xiaomi.com
 *
 * @create: 2019-07-09
 */
public class BankOperation implements OperationI{

    private BankCardInfo bankCardInfo;

    public BankOperation(BankCardInfo bankCardInfo) {
        this.bankCardInfo = bankCardInfo;
    }

    @Override
    public boolean delete() {
        //后端删除 bankCardInfo
        return true;
    }
}

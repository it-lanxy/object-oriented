package cardInfo.context;

import cardInfo.CardType;
import cardInfo.entity.BankCardInfo;
import cardInfo.entity.CardInfo;
import cardInfo.service.BankOperation;
import cardInfo.service.OperationI;

/**
 * @author: lanxinyu@xiaomi.com
 *
 * @create: 2019-07-09
 */
public class CardContext implements OperationI{
    private CardInfo cardInfo;
    private OperationI operation;
    private CardType cardType;
    private String cardId;

    public CardContext cardType(CardType cardType) {
        this.cardType = cardType;
        return this;
    }

    public CardContext cardId(String cardId) {
        this.cardId = cardId;
        return this;
    }

    public CardContext build() {
        switch (cardType) {
            case BANK:
                buildBankContext();
                return this;
            default:
                return this;
        }
    }

    private void buildBankContext() {
        //select from db
        BankCardInfo bankCardInfo = new BankCardInfo();
        this.cardInfo = bankCardInfo;
        this.operation = new BankOperation(bankCardInfo);
    }

    @Override
    public boolean delete() {
        return operation.delete();
    }
}

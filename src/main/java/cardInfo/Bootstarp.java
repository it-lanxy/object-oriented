package cardInfo;

import cardInfo.context.CardContext;

/**
 * @author: lanxinyu@xiaomi.com
 *
 * @create: 2019-07-09
 */
public class Bootstarp {

    public static void main(String[] args) {
        CardContext cardContext = new CardContext().cardId("11111").cardType(CardType.BANK).build();

        cardContext.delete();
    }
}

package Classes;

/** Добавляю класс, описывающий акционного клиента */

public class PromotionalClient extends Actor {
    /**
     * Включаю поля: название акции, id клиента и количество участников в акции(поле
     * статическое)
     */
    protected String namePromotion;
    protected int id;
    protected int numberParticipants = 4;

    public PromotionalClient(String name, int id, int numberParticipants, String namePromotion) {
        super(name + " - акционный клиент: " + "название акции" + namePromotion + "количество участников акции: "
                + numberParticipants);
        this.id = id;
        this.namePromotion = namePromotion;
        this.numberParticipants = numberParticipants;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
        return this;
    }

}
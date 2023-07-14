package Classes;


public class PromotionalClient extends Actor {
    private String namePromotion;
    private int id;
    private int numberParticipants;


      public PromotionalClient(String name, int id,int numberParticipants,String namePromotion ) {
        super(name+" - акционный клиент: ");
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
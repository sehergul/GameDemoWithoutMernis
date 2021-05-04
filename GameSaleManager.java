public class GameSaleManager implements GameSaleService{
    ValidationManager validationManager;

    public GameSaleManager(ValidationManager validationManager){
        this.validationManager=validationManager;
    }

    @Override
    public void sell(Customer customer, Game game) {
        if(validationManager.checkIfRealPerson(customer))
            System.out.println(customer.getFirstName() + " adlı kullanıcı " + game.getName() +
                " oyununu " + game.getPrice() + " TL'ye satın almıştır!");
        else
            System.out.println("Geçersiz müşteri olduğundan satış yapılamadı!");
    }



    @Override
    public void sell(Customer customer, Game game, Campaign campaign) {
        if(validationManager.checkIfRealPerson(customer))
            System.out.println(customer.getFirstName() + " adlı kullanıcı " + game.getName() +
                " oyununu " + campaign.getName() + " kampanyasından faydalanarak " +
                campaign.getPriceAfterDiscount() + " TL'ye satın almıştır!");
        else
            System.out.println("Geçersiz müşteri olduğundan satış yapılamadı!");
    }
}

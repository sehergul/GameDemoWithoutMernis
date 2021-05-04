public class Main {

    public static void main(String[] args) {
        Game game = new Game("GTA5",500,"Araba oyunu");
        Campaign campaign = new Campaign("Araba10", 1, "İlkbahar indirimi",10, game);
        Customer customer = new Customer("Seher","Gul","12345678901",2000);
        CustomerManager customerManager = new CustomerManager(new ValidationManager());
        customerManager.add(customer);
        GameSaleManager gameSaleManager = new GameSaleManager(new ValidationManager());
        gameSaleManager.sell(customer,game,campaign);

        Game game2 = new Game("Max Payne",400,"Aksiyon oyunu");
        Customer customer2 = new Customer("Talha","Gul","1234",2000);
        CustomerManager customerManager2= new CustomerManager(new ValidationManager());
        customerManager2.add(customer2);
        GameSaleManager gameSaleManager2 = new GameSaleManager(new ValidationManager());
        gameSaleManager2.sell(customer2,game2);

    }
}

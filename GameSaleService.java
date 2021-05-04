public interface GameSaleService {
    void sell(Customer customer, Game game, Campaign campaign);
    void sell(Customer customer, Game game);
}

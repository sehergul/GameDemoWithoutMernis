public class Campaign {
    private String name;
    private int id;
    private String description;
    private double discount;
    private double priceAfterDiscount;
    Game game;

    public Campaign(){}

    public Campaign(String name, int id, String description, double discount, Game game) {
        this();
        this.name = name;
        this.id = id;
        this.description = description;
        this.discount=discount;
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPriceAfterDiscount(){
        return this.priceAfterDiscount = game.getPrice() - (game.getPrice() * discount)/100;
    }


}

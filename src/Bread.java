public class Bread extends ProductForSale {
    public double getWeight() {
        return weight;
    }

    public Bread(String type, double price, String description, double weight) {
        super(type, price, description);
        this.weight = weight;
    }

    private double weight;

    @Override
    void showDetails() {
        System.out.println("Bread details: weight: "+ weight+ " price:"+ getPrice()+ "description: "+ getDescription()+ "type: "+ getType());

    }
}

public class Coke extends ProductForSale {
    private String brand;

    public Coke(String type, double price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    void showDetails() {
        System.out.println("Coke details: brand: "+ brand+ " price:"+ getPrice()+ "description: "+ getDescription()+ "type: "+ getType());

    }
}

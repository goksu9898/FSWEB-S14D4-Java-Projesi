public class Chocolate extends ProductForSale{
    public String getShape() {
        return shape;
    }

    public Chocolate(String type, double price, String description, String shape) {
        super(type, price, description);
        this.shape = shape;
    }

    private String shape;

    @Override
    void showDetails() {
        System.out.println("Chocolate details: shape: "+ shape+ " price:"+ getPrice()+ "description: "+ getDescription()+ "type: "+ getType());
    }
}

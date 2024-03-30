public class Store {
    public static void main(String[] args) {
    Chocolate chocolate= new Chocolate("milk",10.5,"without sugar","square");
    Bread bread=new Bread("cavdarli",18.7,"dilimli",0.5);
    Coke coke=new Coke("zero",39.9,"altili paket","CocaCola");

    ProductForSale[] products=new ProductForSale[3];
    products[0]=chocolate;
    products[1]=bread;
    products[2]=coke;

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
    for(int i=0;i< products.length;i++){
        products[i].showDetails();
    }
    }
}
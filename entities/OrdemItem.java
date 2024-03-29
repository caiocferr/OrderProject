package entities;

public class OrdemItem {
    private Integer quantity;
    private Double price;
    private Product product;
    //
    
    public OrdemItem() {
    }
    public OrdemItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    //
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    //
    public Double subTotal(){
        return price*quantity;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    @Override
    public String toString() {
        //return "Quantity: " + quantity + ", price: " + price + ", product= " + product.getName() + " Subtotal: ";
        return product.getName() + " $" + price + " Quantity: "+quantity+ " Subtotal: ";
    }
    
}

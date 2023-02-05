package chapter11;

public interface Product {

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName();

    String getColor();
    void setColor(String color);

    default String getBarcode(){
        return " no barcode";
    }
}

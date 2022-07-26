package ass_1;

import java.util.Objects;

public class Product{
    private int productId;
    private String productName;

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    private double productPrice;


    public Product(int productId, String productName,double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice=productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }



}

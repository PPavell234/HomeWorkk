package Practice_Exercises.chapterTwo;

/**
 *Task 14
 */
public class Product
{
    private String name; // The name of the product.
    private double price; // The price of the product.

    // Constructors
    /**
     * Constructs a product with a name and a price
     * @param productName name of product
     * @param productPrice price of product
     */
    public Product(String productName, double productPrice)
    {
        name = productName;
        price = productPrice;
    }
    // Methods
    /**
     * Gets the price of the product
     * @return
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Gets the name of the product
     * @return
     */
    public String getName()
    {
        return name;
    }

    /**
     * Reduces the price of product by an amount
     * @param amount amount to be reduced
     */
    public void reducePrice(double amount)
    {
        price = price - amount;
    }
}


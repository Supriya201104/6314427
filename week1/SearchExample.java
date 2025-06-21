import java.util.Arrays;
import java.util.Comparator;
public class SearchExample 
{
    static class Product 
    {
        int productId;
        String productName;
        String category;
        Product(int productId, String productName, String category) 
        {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }
        public String toString() 
        {
            return productId + " - " + productName + " (" + category + ")";
        }
    }
    static Product linearSearch(Product[] products, String targetName) 
    {
        for (Product product : products) 
        {
            if (product.productName.equalsIgnoreCase(targetName)) 
            {
                return product;
            }
        }
        return null;
    }
    static Product binarySearch(Product[] products, String targetName) 
    {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);
            if (cmp == 0) 
            {
                return products[mid];
            } 
            else if (cmp < 0) 
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1;
            }
        }
        return null;
    }
    static void sortProducts(Product[] products) 
    {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    }
}

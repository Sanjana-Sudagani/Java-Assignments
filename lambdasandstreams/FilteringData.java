package lambdasandstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class FilteringData{
    public static void main(String[] args) {
        List<Product> list=new ArrayList<Product>();
        list.add(new Product(1,"Samsung ",17000f));
        list.add(new Product(3,"Iphone ",65000f));
        list.add(new Product(2,"Sony ",25000f));
        list.add(new Product(4,"Nokia ",15000f));
        list.add(new Product(5,"Redmi ",26000f));
        list.add(new Product(6,"Lenovo ",19000f));

        // using lambda to filter data
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);

        // using lambda to iterate through collection
        filtered_data.forEach(
                product -> System.out.println(product.name+": "+product.price)
        );
    }
}

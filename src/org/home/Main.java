package org.home;

import org.home.data.ExampleData;
import org.home.models.Product;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Product> products = ExampleData.getPRODUCTS();

/*        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        });*/

        products.sort((p1, p2) ->  p1.getPrice().compareTo(p2.getPrice()));

        for (Product product: products) {
            System.out.println(product.toString());
        }
    }
}

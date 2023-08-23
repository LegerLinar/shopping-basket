package besedin.shoppingbasket.repository;

import besedin.shoppingbasket.model.Product;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class Assortment {
    private Map<Integer, Product> assortment = new HashMap<>(Map.of(
            1,
            new Product("Apple", 100, 1000, 1),
            2,
            new Product("Milk", 120, 850, 2),
            3,
            new Product("Bread", 45, 1, 3),
            4,
            new Product("Malrboro", 150, 1, 4),
            5,
            new Product("Cheese", 850, 1000, 5),
            6,
            new Product("Sugar", 50, 1000, 6),
            7,
            new Product("Grecha", 50, 1000, 7),
            8,
            new Product("Pen", 50, 1, 8),
            9,
            new Product("Tea", 250, 1, 9),
            10,
            new Product("Cookies", 150, 1000, 10)
    ));


    public Assortment() {
    }

    @Override
    public String toString() {
        return "Assortment{" +
                "assortment=" + assortment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assortment that = (Assortment) o;
        return Objects.equals(assortment, that.assortment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assortment);
    }

    public Map<Integer, Product> getAssortment() {
        return assortment;
    }
}

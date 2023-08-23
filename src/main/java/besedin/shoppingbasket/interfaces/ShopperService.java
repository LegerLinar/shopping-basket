package besedin.shoppingbasket.interfaces;

import besedin.shoppingbasket.model.Product;

import java.util.List;

public interface ShopperService {
    public List<Product> addProduct(int[] id);

    public List<Product> getBasket();

    public String clearBasket();

}

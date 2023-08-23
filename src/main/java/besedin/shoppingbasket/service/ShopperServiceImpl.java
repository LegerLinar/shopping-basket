package besedin.shoppingbasket.service;

import besedin.shoppingbasket.interfaces.ShopperService;
import besedin.shoppingbasket.model.Product;
import besedin.shoppingbasket.repository.Assortment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ShopperServiceImpl implements ShopperService {

    private List<Product> basket = new ArrayList<>();
    private final Assortment assortment;

    public ShopperServiceImpl(Assortment assortment) {
        this.assortment = assortment;
    }

    @Override

    public List<Product> addProduct(int[] identities) {
        List<Product> products = new ArrayList<>();
        for (int id : identities) {
            basket.add(assortment.getAssortment().get(id));
            products.add(assortment.getAssortment().get(id));
        }
        return products;
    }

    @Override
    public List<Product> getBasket() {
        return basket;
    }

    @Override
    public String clearBasket() {
        basket = new ArrayList<>();
        return "Basket is cleared";
    }
}

package besedin.shoppingbasket.service;

import besedin.shoppingbasket.interfaces.ShopperService;
import besedin.shoppingbasket.model.Product;
import besedin.shoppingbasket.repository.Assortment;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Scope(scopeName = "session", proxyMode= ScopedProxyMode.TARGET_CLASS)
public class ShopperServiceImpl implements ShopperService {

    private List<Product> basket = new ArrayList<>();
    private final Assortment assortment;

    public ShopperServiceImpl(Assortment assortment) {
        this.assortment = assortment;
    }

    @Override

    public String addProduct(int[] identities) {
        List<Product> products = new ArrayList<>();
        for (int id : identities) {
            if(assortment.getAssortment().get(id) != null) {
                basket.add(assortment.getAssortment().get(id));
                products.add(assortment.getAssortment().get(id));
            }
            else {
                throw new IllegalArgumentException("Please, specify the right product id");
            }
        }
        return products.toString() + "Added to basket";
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

    @Override
    public List<Long> getBasketsId(){
        return basket.stream()
                .map(e -> e.getId())
                .collect(Collectors.toList());
    }
}

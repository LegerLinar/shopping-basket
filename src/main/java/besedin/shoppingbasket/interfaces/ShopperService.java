package besedin.shoppingbasket.interfaces;

import besedin.shoppingbasket.model.Product;
import io.swagger.v3.oas.models.security.SecurityScheme;

import java.util.List;

public interface ShopperService {
    String addProduct(int[] id);

    List<Product> getBasket();

    String clearBasket();

    List<Long> getBasketsId();

}

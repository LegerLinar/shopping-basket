package besedin.shoppingbasket.controller;

import besedin.shoppingbasket.interfaces.ShopperService;
import besedin.shoppingbasket.model.Product;
import besedin.shoppingbasket.repository.Assortment;
import besedin.shoppingbasket.service.ShopperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "store/order")
public class ShopperServiceController {

    final ShopperService shopperService;

    public ShopperServiceController(ShopperService shopperService) {
        this.shopperService = shopperService;
    }

    @PostMapping(path = "/add")
    public String addProduct(@RequestParam int[] productsId) {
        try {
            return shopperService.addProduct(productsId);
        } catch (IllegalAccessError e) {
            return e.getMessage();
        }
    }

    @GetMapping(path = "/get")
    public List<Product> getBasket() {
        return shopperService.getBasket();
    }

    @DeleteMapping(path = "/clean")
    public String clearBasket() {
        return shopperService.clearBasket();
    }

    @GetMapping(path = "/get-by-id")
    public List<Long> getBasketsId(){
        return shopperService.getBasketsId();
    }
}

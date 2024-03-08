package Strategy;

import java.util.List;

public class Cart {
    List<Item> itemlist;
    DiscountStrategy discountStrategy;

    double getTotal()
    {
        double total = 0;
        for(Item item : itemlist)
        {
            total += item.price;
        }
        total *= discountStrategy.getDiscountedReate();
        return total;    
    }
}

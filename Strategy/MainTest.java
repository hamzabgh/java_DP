package Strategy;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Item phone = new Item("Sumsung",100);
        Item whatch = new Item("whatch 1",20);
        Cart cart =  createCart(false, false, phone,whatch);
        System.out.println(cart.getTotal());

    }

    static Cart createCart(boolean isMember, boolean isEmployee, Item... items)
    {
        Cart cart = new Cart();
        List<Item> itemList = new ArrayList<>();
        for(Item item : items)
        {
            itemList.add(item);
        }
        cart.itemlist = itemList;
        if(isEmployee){
            cart.discountStrategy = new EmployeeDiscount();
        }else if(isMember){
            cart.discountStrategy = new MemberDiscount();
        }else{
            cart.discountStrategy = new GeustDiscount();
        }
        return cart;
    }
}

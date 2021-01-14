package com.ru.dao;

import com.ru.models.Shop;
import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Set;

@Component
public class ShopDAO {
    private static int COUNT = 0;
    Set<Shop> shops;


    {
        shops = new HashSet<>();
        shops.add(new Shop(++COUNT,"Name_1", "Address_1", "1111", "email_1_@mail", "category_1", "description_1"));
        shops.add(new Shop(++COUNT,"Name_2", "Address_2", "2222", "email_2_@mail", "category_2", "description_2"));
        shops.add(new Shop(++COUNT,"Name_3", "Address_3", "3333", "email_3_@mail", "category_3", "description_3"));
        shops.add(new Shop(++COUNT,"Name_4", "Address_4", "4444", "email_4_@mail", "category_4", "description_4"));
    }

    public Set<Shop> listShop(){
        return shops;
    }

    public Shop showID(int id) {
        return shops.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Shop shop){
        shop.setId(++COUNT);
        shops.add(shop);
    }

}

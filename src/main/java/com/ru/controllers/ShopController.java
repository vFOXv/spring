package com.ru.controllers;

import com.ru.dao.ShopDAO;
import com.ru.models.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@Controller
@RequestMapping("/areal")
public class ShopController {

    //    /areal/new   - добовление магазина
    //    /areal/shop  или /areal  - список магазинов

    private final ShopDAO shopDAO;

    public ShopController(ShopDAO shopDAO) {
        this.shopDAO = shopDAO;
    }

    @GetMapping(value = {"","/listShops"})
    public String listShop(Model model) {
        model.addAttribute("shops", shopDAO.listShop());
        return "listShops";
    }

    @GetMapping("/{id}")
    public String showID(@PathVariable("id") int id, Model model){
        model.addAttribute("shop",shopDAO.showID(id));
        return "showID";
    }

    @GetMapping("/new")
    public String newShop(Model model){
        model.addAttribute("shop", new Shop());
        return "addShop";
    }

    @PostMapping("/new")
    public String create(@ModelAttribute("shop") @Valid Shop shop, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "addShop";
        }
        shopDAO.save(shop);
        return "redirect:listShops";
    }
}

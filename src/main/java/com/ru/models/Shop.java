package com.ru.models;


import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Shop {
    int id;

    @NotEmpty(message = "Name should not be empty")
    //@Min(value = 4, message = "This field mast long min 4 char")
    String name;
    @NotEmpty(message = "Field should not be empty")
    String address;
    //@Min(value = 5, message = "This field mast long min 5 char")
    String phone;
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    String email;
    @NotEmpty(message = "Field should not be empty")
    String categoryShop;
    @NotEmpty(message = "Field should not be empty")
    @Size(min=5, max = 10, message = "This field mast long min 5 char, max 10 char")
    String description;

    public Shop() {
    }

    public Shop(int id, String name, String address, String phone, String email, String categoryShop, String description) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.categoryShop = categoryShop;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategoryShop() {
        return categoryShop;
    }

    public void setCategoryShop(String categoryShop) {
        this.categoryShop = categoryShop;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", categoryShop='" + categoryShop + '\'' +
                ", description='" + description + '\'' +
                '}' + "\n";
    }
}

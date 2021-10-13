package com.example.shop.data.model;

public enum Currency {
    NGN("Naira"), USD("Dollar"), SRC(""), GBP("British Pounds"),FRC("Franc"),GHC("Ghana cedies");

    private  String currencyName;
    Currency(String currencyName) {
        this.currencyName = currencyName;
    }

    private String getName() {
        return  currencyName;
    }
}

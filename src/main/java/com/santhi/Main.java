package com.santhi;

import dao.ItemDaoImpl;
import dao.ItemDaoInterface;
import service.CustomerService;
import service.ItemService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        CustomerService customerService=new CustomerService();
//       customerService.addCustomer();
//        customerService.getCustomerById();
//        customerService.removeCustomerById();

        ItemService itemService=new ItemService();
    // itemService.addItem();
        itemService.removeItemById();
       //itemService.getItems();
    }
}
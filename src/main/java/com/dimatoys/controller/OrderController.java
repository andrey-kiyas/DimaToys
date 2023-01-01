package com.dimatoys.controller;

import com.dimatoys.model.MyOrder;
import com.dimatoys.repository.MyOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private MyOrderRepository myOrderRepository;

    private static final List<MyOrder> MY_ORDERS = new LinkedList<>();

    static {
        MY_ORDERS.add(new MyOrder("iphone", 123));
        MY_ORDERS.add(new MyOrder("book", 321));
        MY_ORDERS.add(new MyOrder("chair", 567));
    }

    private List<MyOrder> getOrderList() {
        List<MyOrder> myOrders = new ArrayList<>();
        myOrders.add(new MyOrder("iphone", 123));
        myOrders.add(new MyOrder("book", 321));
        myOrders.add(new MyOrder("chair", 567));
        return myOrders;
    }

    private static List<MyOrder> manageOrders(MyOrder myOrder) {
        if (myOrder != null) MY_ORDERS.add(myOrder);
//        MY_ORDERS.add(new MyOrder("iphone", 123));
        return MY_ORDERS;
    }

    @GetMapping("/orders")
    public String AddOrders(Model model) {
        model.addAttribute("orders", manageOrders(null));
        model.addAttribute("order", new MyOrder());
//        myOrderRepository.save(new MyOrder("iphone", 123));
//        List<MyOrder> myOrder = new ArrayList<>();
//        myOrder = getOrderList();
//        myOrderRepository.save(myOrder);
        return "orders_page";
    }

    @GetMapping("/orders-save")
    public String orders(Model model) {
//        model.addAttribute("orders", manageOrders(null));
//        model.addAttribute("order", new MyOrder());
//        myOrderRepository.save(new MyOrder("iphone", 123));
        List<MyOrder> myOrder = new ArrayList<>();
        myOrder = getOrderList();
//        myOrderRepository.save(myOrder);

//        myOrderRepository.findAll();
        saveOrderList(myOrder);
        return "orders_page";
    }

    public void saveOrderList(List<MyOrder> myOrders) {
        for (int i = 0; i < myOrders.size(); i++) {
            myOrderRepository.save(myOrders.get(i));
        }
    }

    @PostMapping("/createOrder")
    public String createOrder(@ModelAttribute MyOrder myOrder) {
        System.out.println("order is : " + myOrder);
        manageOrders(myOrder);
        return "redirect:/orders";
    }
}

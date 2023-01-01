package com.dimatoys.service;

import com.dimatoys.model.MyOrder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ShopService {

    private static final Set<MyOrder> MY_ORDERS = new HashSet<>();

}

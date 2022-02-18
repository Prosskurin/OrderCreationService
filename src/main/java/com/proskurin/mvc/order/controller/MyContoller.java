package com.proskurin.mvc.order.controller;

import com.proskurin.mvc.order.entity.Order;
import com.proskurin.mvc.order.service.EmailService;
import com.proskurin.mvc.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyContoller {


    @Autowired
    private OrderService orderService;
    @Autowired
    private EmailService emailService;

    @RequestMapping("/")
    public String showFirstView() {
        return "myView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {

        model.addAttribute("order", new Order());
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showAndDetails(@ModelAttribute("order") Order order) {
        double comis;
        double price = order.getPrice();
        int id = 0;
        String documents = order.getSignedDocuments();
        String prodType = order.getProductType();
        if (prodType.equals("Bond")) {
            comis = (price * 2.00) / 100.00;
            order.setComission(comis);
        } else if (price < 9900.00 && prodType.equals("Stock")) {
            comis = 99.00;
            order.setComission(comis);
        } else {
            comis = price / 100.00;
            order.setComission(comis);
        }
        order.setSignedDocuments(documents.replace("http", "https"));
        orderService.saveOrder(order);
        orderService.addId(id);
        id = order.getId();
        emailService.sendSimpleMessage("testproskurin@gmail.com", "New order " + String.valueOf(id), order.getSignedDocuments());

        return "show-emp-details-view";

    }
}

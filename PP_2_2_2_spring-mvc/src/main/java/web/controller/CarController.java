package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;


@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarDAO carDAO;

    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    @GetMapping
    public String show(@RequestParam(value = "count", required = false) String count, Model model) {
        if(count != null) {
            switch (count) {
                case "1" -> carDAO.newList(1);
                case "2" -> carDAO.newList(2);
                case "3" -> carDAO.newList(3);
                case "4" -> carDAO.newList(4);
                default -> carDAO.newList(5);
            }
            model.addAttribute("car", carDAO.getNewList());
        }else {
            model.addAttribute("car", carDAO.getList());
        }

        return "cars";

    }
//
//    @GetMapping
//      public String show2(Model model) {
//        List<String> messages = new ArrayList<>();
//        messages.add("Hello!");
//        messages.add("I'm Spring MVC application");
//        messages.add("5.2.0 version by sep'19 ");
//        model.addAttribute("messages", messages);
//        model.addAttribute("carAll", carDAO.getList());
//        return "cars";


}

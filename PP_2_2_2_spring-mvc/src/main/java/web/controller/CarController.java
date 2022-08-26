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
        if (count != null) {
            int x = Integer.parseInt(count);
            carDAO.newList2(x);
            model.addAttribute("car", carDAO.getNewList());
        } else {
            model.addAttribute("car", carDAO.getList());
        }

        return "cars";

    }

}

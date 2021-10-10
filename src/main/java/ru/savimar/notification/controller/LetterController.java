package ru.savimar.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.savimar.notification.entity.Letter;
import ru.savimar.notification.service.LetterService;

import java.util.List;

@Controller
public class LetterController {
    @Autowired
    private LetterService service;
    @RequestMapping("/letters")
    public String showLetterList(Model model) {
        List<Letter> letterList = service.findAll();
        model.addAttribute("letterList", letterList);
        return "letters";
    }

}

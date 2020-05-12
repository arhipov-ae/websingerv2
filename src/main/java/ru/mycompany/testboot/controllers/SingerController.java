package ru.mycompany.testboot.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.mycompany.testboot.model.entities.Singer;
import ru.mycompany.testboot.model.services.SingerService;
import ru.mycompany.testboot.model.services.TestSingerServiceImpl;
//import ru.mycompany.testboot.model.entities.Singer;
//import ru.mycompany.testboot.model.services.SingerService;

import java.util.List;

//import ru.mycompany.testboot.util.*;
//import org.apache.commons.io.IOUtils;

@RequestMapping("/singers")
@Controller
public class SingerController {
    private final Logger logger = LoggerFactory.getLogger(SingerController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String testing(Model uiModel) {
        String testing = "Hello";
        uiModel.addAttribute("testing", testing);

        return "/singers/testing";
    }

    /*private SingerService singerService = new TestSingerServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    public String testlist(Model uiModel) {
        List<Singer> testsingers = singerService.findAll();
        uiModel.addAttribute("testsingers", testsingers);

        return "/singers/testlist";
    }*/
/*
    private SingerService singerService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {
        logger.info("Listing singers");

        List<Singer> singers = singerService.findAll();
        uiModel.addAttribute("singers", singers);

        logger.info("No. of singers: " + singers.size());

        return "singers/list";
    }

    @Autowired
    public void setSingerService(SingerService singerService) {
        this.singerService = singerService;
    }
*/
}

package ru.fronto.stat.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Alex on 08.03.2018.
 */

@Controller
@RequestMapping("/stat")
public class StatController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getStat(ModelMap model) {
        return "Stat";
    }

}

package com.codingdojo.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DateControllers {
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
    @RequestMapping("/date")
    public String date(Model model) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, MMM d, yyyy");
        String formattedDate = dateFormat.format(date);
        model.addAttribute("date", formattedDate);
        return "date.jsp";
    }
    @RequestMapping("/time")
    public String time(Model model) {
        Date time = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        String formattedTime = timeFormat.format(time);
        model.addAttribute("time", formattedTime);
        return "time.jsp";
    }
}


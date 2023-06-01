package ru.itgirl.firstspringproject.controller;
import org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FirstController {

    @GetMapping("/dayOfWeek")
    public String hello(@RequestParam(value = "name", defaultValue = "unknown") String name) {
        if (name.equals("MONDAY")) {
            name = "Понедельник";
        }
        else if (name.equals("TUESDAY")) {
            name = "Вторник";
        }
        else if (name.equals("WEDNESDAY")) {
            name = "Среда";
        }
        else if (name.equals("THURSDAY")) {
            name = "Четверг";
        }
        else if (name.equals("FRIDAY")) {
            name = "Пятница";
        }
        else if (name.equals("SATURDAY")) {
            name = "Суббота";
        }
        else if (name.equals("SUNDAY")) {
            name = "Воскресенье";
        }
        return String.format("Сегодня %s!", name);
    }
}

package org.lee.spring.boot.demo.controller;

import org.lee.spring.boot.demo.api.WeatherAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// NOTE : RestTemplateCustomizerを使うことで、RestTemplateをカスタマイズする
@RestController
@RequestMapping(value="/weather")
public class WeatherController {

    @Autowired
    private WeatherAPI weatherAPI;

//    @GetMapping("/{cityCode}")
//    public Object show(@PathVariable Integer cityCode) {
//
//        WeatherAPI.City city = WeatherAPI.City.getCity(cityCode);
//
//        if (city != null ) {
//              return weatherAPI.show(city);
//        } else {
//            return "invalid city code";
//        }
//    }

    @GetMapping("/{cityCode}")
    public Object showWithCityCode(@PathVariable Integer cityCode) {
         return weatherAPI.show(cityCode);
    }
}

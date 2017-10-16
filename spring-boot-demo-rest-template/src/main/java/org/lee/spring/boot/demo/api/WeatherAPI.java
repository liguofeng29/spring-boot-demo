package org.lee.spring.boot.demo.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.Size;

@Component
@Validated
public class WeatherAPI {
    private final static String URL = "http://weather.livedoor.com/forecast/webservice/json/v1?city={code}";

    enum City {
        TOKYO(130010),
        OSAKA(270000);

        private final int cityCode;

        private City(int cityCode) {
            this.cityCode = cityCode;
        }

        public static City getCity(final int cityCode) {
            City[] cities = City.values();
            for (City city : cities) {
                if (city.cityCode == cityCode) {
                    return city;
                }
            }
            return null;
        }
    }

    private final RestTemplate restTemplate;

    @Autowired
    public WeatherAPI(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Object show(int cityCode) {
        return this.restTemplate.getForObject(URL, Object.class, cityCode);
    }

}

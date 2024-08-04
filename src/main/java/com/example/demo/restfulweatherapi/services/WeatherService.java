package com.example.demo.restfulweatherapi.services;

import com.example.demo.restfulweatherapi.entity.Weather;
import com.example.demo.restfulweatherapi.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository mWeatherRepository;

    public Weather addWeatherReport(Weather weather) {
        return mWeatherRepository.save(weather);
    }

    public List<Weather> getAllWeather() {
        return mWeatherRepository.findAll();
    }

    public Weather getWeatherDataById(Long id) {
        return mWeatherRepository.findById(id).orElse(null);
    }

    public void deleteItem(Long id) {
        mWeatherRepository.deleteById(id);
    }

}
package com.example.demo.restfulweatherapi.repository;

import com.example.demo.restfulweatherapi.entity.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Long> {
}
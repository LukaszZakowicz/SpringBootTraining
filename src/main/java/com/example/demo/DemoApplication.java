package com.example.demo;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    CarService carService;

    @EventListener(ApplicationReadyEvent.class)
    public void addCarsAtStartup() {
        carService.addCar(new Car("Brand1", "Model1", "blue"));
        carService.addCar(new Car("Brand2", "Model2", "czerwony"));
        carService.addCar(new Car("Brand3", "Model3", "white"));
        carService.addCar(new Car("Brand4", "Model4", "white"));
        carService.addCar(new Car("Brand5", "Model5", "blue"));
        carService.addCar(new Car("Brand6", "Model6", "blue"));
        carService.addCar(new Car("Brand7", "Model7", "black"));
        carService.addCar(new Car("Brand8", "Model8", "black"));
        carService.addCar(new Car("Brand9", "Model9", "brown"));
        carService.addCar(new Car("Brand10", "Model10", "brown"));
    }

}

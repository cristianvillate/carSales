/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.ControllerPersistence;
import java.util.List;
import model.Cars;

public class Controller {
    
    ControllerPersistence controllerPersistence = new ControllerPersistence();

    public void AddCar(String model, String brand, String engine, String color, String patent, int doors) {

Cars car = new Cars();
car.setBrand(brand);
car.setColor(color);
car.setDoors(doors);
car.setEngine(engine);
car.setModel(model);
car.setPatent(patent);

controllerPersistence.addCar(car);

    }

    public List<Cars> showCars() {

       return controllerPersistence.showCars();

    }

    public void deleteCar(int idCar) {
        controllerPersistence.deleteCar(idCar);
    }

    public Cars getCar(int idCar) {
      return  controllerPersistence.getCar(idCar);
    }

    public void modifyCar(Cars car, String model, String brand, String engine,
                            String color, String patent, int doors) {
        car.setBrand(brand);
        car.setColor(color);
        car.setDoors(doors);
        car.setEngine(engine);
        car.setModel(model);
        car.setPatent(patent);
        
        controllerPersistence.modifyCar(car);
        
    }

    
    
   
    
}

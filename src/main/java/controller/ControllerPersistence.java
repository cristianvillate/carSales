/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cars;

/**
 *
 * @author cristian
 */
public class ControllerPersistence {
carsJpaController jpaController = new carsJpaController();
    public void addCar(Cars car) {
       jpaController.create(car);
    }

    public List<Cars> showCars() {
        return jpaController.findcarsEntities();
    }

    public void deleteCar(int idCar) {
    try {
        jpaController.destroy(idCar);
    } catch (NonexistentEntityException ex) {
        Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public Cars getCar(int idCar) {
    return jpaController.findcars(idCar);

    }

    public void modifyCar(Cars car) {
    try {   
        jpaController.edit(car);
    } catch (Exception ex) {
        Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }

    


   
    
}

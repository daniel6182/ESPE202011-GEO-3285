/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.jugueton.controller;

import ec.edu.espe.jugueton.model.Toy;
import utils.FileManager;

/**
 *
 * @author Thomas Chavez
 */
public class ToyController {
    public void save(Toy toy){
        String data = toy.getName() + ";" + toy.getColor() + ";" + toy.getType() + ";" + toy.getAge();
        FileManager.save(data, "toys");
        
        
    }
    public String read() {

        String data;
        data = FileManager.read("toys.csv");
        return data;
    }
    }   

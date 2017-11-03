/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.nivelesacceso.usuarios;

/**
 *
 * @author Will
 */
public abstract class SalarieEmployee extends Employee{
    
    int annualSalary = 100;
    
    public SalarieEmployee(){
        name = "Will";
        setHireYear(1999);
        country = "Guatemala";
    }
    @Override
    public double monthlyPay(){
        return annualSalary/12;
    }
    @Override
    public abstract double annualPay();
}

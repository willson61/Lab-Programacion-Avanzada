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
public abstract class HourlyEmployee extends Employee{
    int hoursPerWeek = 8;
    double hourlyWage = 50;
    @Override
    public double monthlyPay(){
        return (hoursPerWeek*hourlyWage)*4;
    }
    @Override
    public abstract double annualPay();
}

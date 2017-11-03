
package gt.edu.url.nivelesacceso.usuarios;

/**
 *
 * @author Will
 */
public abstract class Employee {
    public String name;//Publica
    private int hireYear;//Privada
    protected String country;
    
    public int getHireYear() {
        return hireYear;
    }
    
    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
    
    protected abstract double monthlyPay();
    protected abstract double annualPay();
}

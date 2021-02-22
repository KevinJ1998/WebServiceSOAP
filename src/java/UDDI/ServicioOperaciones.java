/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDDI;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Kevin
 */
@WebService(serviceName = "ServicioOperaciones")
public class ServicioOperaciones {

    /**
     * This is a sample web service operation
     */
    int horasTotales;
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "calculoSueldo")
    public double salary(@WebParam(name="sueldoHora") double sueldo){
        return horasTotales*sueldo;
    }
    
    @WebMethod(operationName = "calculoHoras")
    public int hours(@WebParam(name="horasd1") int horasd1, @WebParam(name="horasd2") int horasd2,@WebParam(name="horasd3") int horasd3,@WebParam(name="horasd4") int horasd4,@WebParam(name="horasd5") int horasd5,@WebParam(name="horasd6") int horasd6){
        horasTotales = horasd1+horasd2+horasd3+horasd4+horasd5+horasd6;
        return horasTotales;
    }
    
}

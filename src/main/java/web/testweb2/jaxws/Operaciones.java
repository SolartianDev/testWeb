package web.testweb2.jaxws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(name="operaciones")
public class Operaciones {
    /**
     * This is a sample web service operation
     */
   // Este método se expone como un servicio web para sumar dos números.
    @WebMethod(operationName = "sumar")
    public String sumar(@WebParam(name = "numero1") double numero1, @WebParam(name = "numero2") double numero2 ) {
        return Double.toString(numero1 + numero2); 
// Realiza la operación de suma y convierte el resultado en una cadena.
    }
    
    // Este método se expone como un servicio web para restar dos números.
    @WebMethod(operationName = "restar")
    public String restar(@WebParam(name = "numero1") double numero1, @WebParam(name = "numero2") double numero2 ) {
        return Double.toString(numero1 - numero2);
        // Realiza la operación de resta y convierte el resultado en una cadena.
    }
    
    // Este método se expone como un servicio web para multiplicar dos números.
    @WebMethod(operationName = "multiplicacion")
    public String multiplicar(@WebParam(name = "numero1") double numero1, @WebParam(name = "numero2") double numero2 ) {
        return Double.toString(numero1 * numero2);
        // Realiza la operación de multiplicación y convierte el resultado en una cadena.
    }
}

import services.CafeteraServicio;
import services.CuentaBancariaServicios;
import entidades.Cafetera;
import entidades.CuentaBancaria;

public class ClaseServicios {
    public static void main(String[] args) {
        
        //EJERCICIO 1 -------------------------------------------
        /* CuentaBancariaServicios cBS = new CuentaBancariaServicios();
        CuentaBancaria cuenta = cBS.crearCuenta();
        cBS.ingresarSaldo(cuenta);
        cBS.retirarSaldo(cuenta);
        cBS.extraccionRapida(cuenta);
        cBS.consultarSaldo(cuenta);
        cBS.consultarDatos(cuenta); */

        // EJERCICIO 2 ---------------------------------------------
        CafeteraServicio cafeSer = new CafeteraServicio();
        Cafetera cafetera = cafeSer.crearCafetera();

        cafeSer.llenarCafetera(cafetera);
        cafeSer.servirTaza(cafetera);
        cafeSer.vaciarCafetera(cafetera);
        cafeSer.agregarCafe(cafetera);


    }
}

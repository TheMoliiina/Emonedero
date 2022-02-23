/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emonedero;

/**
 *
 * @author daniel
 */
public class Main {
    
 public static void main(String[] args, double cash) {

        Emonedero mycash;

        double dinero;

        mycash = GMonedero(cash);

        double SDisp = mycash.efectivo(); 

        System.out.println("El efectivo del monedero es  "+ SDisp );

    }

    public static Emonedero GMonedero(double cash) {
        Emonedero mycash;
        cash = 2500;
        mycash = new Emonedero("Nombre y apellidos del Alumno",500, "dni del alumno");
              try {

                    System.out.println(" Modificación 1");

                    mycash.recargar(10); //modificacion 2

                 } catch (Exception e) {

                           System.out.print("Ha fallado la recarga");

                            }
        try
            
        {
            
            mycash.pagar(200);
            
        } catch (Exception e)

        {

            System.out.print("No se puede pagar  ");

        }
        try

        {

            System.out.println("Debes recargar monedero");

            mycash.recargar(300);

        } catch (Exception e)

        {

            System.out.print("Error al recargar");

        }
        return mycash;
        
    }

}

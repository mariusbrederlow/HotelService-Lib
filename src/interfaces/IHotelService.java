/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;



import entities.Staedte;

/**
 *
 * @author mariusbrederlow
 */
public interface IHotelService {
    //Finde Hotels entsprechend der Kriterien
    public byte[] suchePassendeHotels(Staedte stadt, int pool, int sterne);
    //Finde alle Hotels in einer Stadt
    public byte[] sucheHotelsInStadt(Staedte stadt);
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.Hotels;
import entities.Staedte;
import java.util.List;

/**
 *
 * @author mariusbrederlow
 */
public interface IHotelService {
    //Finde Hotels entsprechend der Kriterien
    public List<Hotels> suchePassendeHotels(Staedte stadt, int pool, int sterne);
    //Finde alle Hotels in einer Stadt
    public List<Hotels> sucheHotelsInStadt(Staedte stadt);
}

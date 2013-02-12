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
    public void createHotel(Object hotel);
    public List<? extends Object> getallHotels();
    public List<Hotels> getMatchingHotels(Staedte stadt, int pool, int sterne);
    public List<Hotels> getHotelFromStadt(Staedte stadt);
}

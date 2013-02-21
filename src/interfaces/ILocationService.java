/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.Staedte;
import java.util.List;

/**
 *
 * @author mariusbrederlow
 * Ortsbestimmung anhand der angegebenen WLAN Stationene
 */
public interface ILocationService {
    //Liefert alle Nachbarknoten der id
    public List<Staedte> getNextKnoten(int id);
    //Liefert alle Nachbarknoten der Kombination id, id2
    public List<Staedte> getNextKnoten(int id, int id2);
    //Liefert Stadt mit der eindeutigen Kombination von id, id2 und id3
    public Staedte getStadt(int k1, int k2, int k3);
    
}

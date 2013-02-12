/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.Staedte;
import java.util.List;
import java.util.Set;

/**
 *
 * @author mariusbrederlow
 */
public interface ILocationService {
    public List<Staedte> getNextKnoten(int id);
    public List<Staedte> getNextKnoten(int id, int id2);
    public Set nextKnotenSet(int id);
    public List<Integer> getSecKnoten(int id);
    public List<Staedte> getTrdKnoten(int id, int id2);
    public Staedte getStadt(int k1, int k2, int k3);
    
}

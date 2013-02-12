/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mariusbrederlow
 */
@Entity
@Table(name = "Hotels", catalog = "Hotelsuche", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hotels.findHotelByStadt", query = "SELECT h FROM Hotels h WHERE h.staedteStadtID = :stadtid"),
    @NamedQuery(name = "Hotels.findMatchingHotelByStadt", query = "SELECT h FROM Hotels h WHERE h.staedteStadtID = :stadtid and h.sterne = :sterne and h.pool = :pool"),
    @NamedQuery(name = "Hotels.findAll", query = "SELECT h FROM Hotels h"),
    @NamedQuery(name = "Hotels.findByHotelID", query = "SELECT h FROM Hotels h WHERE h.hotelID = :hotelID"),
    @NamedQuery(name = "Hotels.findByHotelName", query = "SELECT h FROM Hotels h WHERE h.hotelName = :hotelName"),
    @NamedQuery(name = "Hotels.findByPool", query = "SELECT h FROM Hotels h WHERE h.pool = :pool"),
    @NamedQuery(name = "Hotels.findBySterne", query = "SELECT h FROM Hotels h WHERE h.sterne = :sterne")})
public class Hotels implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Hotel_ID")
    private Integer hotelID;
    @Column(name = "Hotel_Name")
    private String hotelName;
    @Column(name = "Pool")
    private Short pool;
    @Column(name = "Sterne")
    private Integer sterne;
    @JoinColumn(name = "Staedte_Stadt_ID", referencedColumnName = "Stadt_ID")
    @ManyToOne
    private Staedte staedteStadtID;

    public Hotels() {
    }

    public Hotels(Integer hotelID) {
        this.hotelID = hotelID;
    }

    public Hotels(String hotelName, short pool, int sterne){
        
        this.hotelName = hotelName;
        this.pool = pool;
        this.sterne = sterne;
        
    }
    
    public Integer getHotelID() {
        return hotelID;
    }

    public void setHotelID(Integer hotelID) {
        this.hotelID = hotelID;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getPool() {
        return pool;
    }

    public void setPool(Short pool) {
        this.pool = pool;
    }

    public Integer getSterne() {
        return sterne;
    }

    public void setSterne(Integer sterne) {
        this.sterne = sterne;
    }

    public Staedte getStaedteStadtID() {
        return staedteStadtID;
    }

    public void setStaedteStadtID(Staedte staedteStadtID) {
        this.staedteStadtID = staedteStadtID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hotelID != null ? hotelID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotels)) {
            return false;
        }
        Hotels other = (Hotels) object;
        if ((this.hotelID == null && other.hotelID != null) || (this.hotelID != null && !this.hotelID.equals(other.hotelID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Hotels[ hotelID=" + hotelID + " ]";
    }
    
}

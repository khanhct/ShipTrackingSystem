package vn.com.daisy.shiptrackingsystem.dao;
// Generated Nov 26, 2016 11:01:46 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Shiptracking generated by hbm2java
 */
@Entity
@Table(name="shiptracking"
    ,catalog="shiptrackingsystem"
)
public class Shiptracking  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
     private double lat;
     private double long_;

    public Shiptracking() {
    }

    public Shiptracking(int id, double lat, double long_) {
       this.id = id;
       this.lat = lat;
       this.long_ = long_;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="lat", nullable=false, precision=22, scale=0)
    public double getLat() {
        return this.lat;
    }
    
    public void setLat(double lat) {
        this.lat = lat;
    }

    
    @Column(name="long", nullable=false, precision=22, scale=0)
    public double getLong_() {
        return this.long_;
    }
    
    public void setLong_(double long_) {
        this.long_ = long_;
    }




}



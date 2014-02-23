package sat.save;
/**
 * @author kgehrma
 * 
 * SatInstance
 * 
 * Main Java class for holding sat information
 * 
 * contains all getters and setters for back end data
 * 
 * All right reserved 2014
 *
 */

public class SatInstance {
	
	private int id;
    private String name = " instance ";
    private int userid;
    private double lat = 0;
    private double lng = 0;
    private String provider = new String("Data Error");
    private float accuracy = 0;
    private double altitude = 0;
    private float bearing = 0;
 
    public SatInstance(){}
 
    public SatInstance(String name, int userid, double lat, double lng, String provider, float accuracy, double altitude, float bearing) {
        super();
        this.name = name;
        this.userid = userid;
        this.lat = lat;
        this.lng = lng;
        this.provider = provider;
        this.accuracy = accuracy;
        this.altitude = altitude;
        this.bearing = bearing;
    }
 
    //getters & setters
 
    @Override
    public String toString() {
    	String returnThis = " id: "+id+"\n Lat: "+lat+"\n Lng: "+lng+"\n Altitude: "+altitude;
        return returnThis;
    }
    
    public int getId(){
		return id;
    }
    public String getName(){
		return name;
    }
    public int getUserId(){
		return userid;
    }
    public double getLat(){
		return lat;
    }
    public double getLng(){
		return lng;
    }
    public String getProvider(){
		return provider;
    }
    public float getAccuracy(){
		return accuracy;
    }
    public double getAltitude(){
		return altitude;
    }
    public float getBearing(){
		return bearing;
    }
    /*
     * User setId function CAREFULLY, setId() would override AUTOINCREMENT from SQLite
     * 
     */
    public void setId(int id){
		 this.id = id;
    }
    
    public void setName(String name){
		 this.name = name;
    }
    public void setUserId(int userid){
		 this.userid = userid;
    }
    public void setLat(double lat){
		 this.lat = lat;
    }
    public void setLng(double lng){
		 this.lng = lng;
    }
    public void setProvider(String provider){
		 this.provider = provider;
    }
    public void setAccuracy(float accuracy){
		 this.accuracy = accuracy;
    }
    public void setAltitude(double altitude){
		 this.altitude = altitude;
    }
    public void setBearing(float bearing){
		 this.bearing = bearing;
    }
    

}
package locationservice.locationservice;

/**
 * Created by Ishaq Hassan on 12/10/2017.
 */

public class LocationData {
    private double lat;
    private double lng;

    public LocationData() {
    }

    public LocationData(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}

package locationservice.locationservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager()
                .findFragmentById(R.id.map);

        reference = FirebaseDatabase.getInstance().getReference()
                .child("userLocation");

        startService(new Intent(this,MyLocationService.class));

        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(final GoogleMap googleMap) {
                final LatLng latLng = new LatLng(24.9157143,67.0906278);
                MarkerOptions options = new MarkerOptions();
                options.position(latLng);
                options.title("SSUET");
                final Marker marker = googleMap.addMarker(options);

                reference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        LocationData locationData = dataSnapshot.getValue(LocationData.class);
                        if(locationData != null){
                            LatLng newPosition = new LatLng(locationData.getLat(),locationData.getLng());
                            marker.setPosition(newPosition);
                            googleMap.moveCamera(CameraUpdateFactory.newLatLng(newPosition));
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

                googleMap.setMinZoomPreference(17);
                googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
            }
        });

    }
}

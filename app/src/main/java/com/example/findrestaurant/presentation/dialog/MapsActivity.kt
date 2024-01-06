package com.example.findrestaurant.presentation.dialog

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import com.example.findrestaurant.R
import com.example.findrestaurant.databinding.ActivityMapsBinding
import com.example.findrestaurant.model.InfoDetail
import com.example.findrestaurant.model.InfoRequest
import com.example.findrestaurant.model.InfoResponse
import com.example.findrestaurant.presentation.dialog.adapters.InfoListAdapter
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.findrestaurant.presentation.dialog.MainViewModel


class MapsActivity : AppCompatActivity(), OnMapReadyCallback {
    companion object {
        fun start(activity: Activity) {
            Intent(activity, MapsActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            }.also {
                activity.startActivity(it)
            }
        }
    }
    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        // Add a marker in 한경대 and move the camera
        //기본 설정 시드니에서 한경대로 변경
        val hankyungUniv = LatLng(37.01171,127.2644)
        mMap.addMarker(MarkerOptions().position(hankyungUniv).title("Marker in hankyungUniv"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hankyungUniv))
    }


}

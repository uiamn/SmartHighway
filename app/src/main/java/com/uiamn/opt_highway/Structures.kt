package com.uiamn.opt_highway

import com.google.android.gms.maps.model.LatLng

class Structures {
    data class DeptDestLatLng(val dept: LatLng, val dest: LatLng)
    data class LatLngWithName(val name: String, val point: LatLng)
}


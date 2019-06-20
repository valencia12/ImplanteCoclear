package com.example.proyect

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.estherlara.taller5.R

class MainActivity : AppCompatActivity(), primerFragment.OnFragmentInteractionListener,
    SegundoFragment.OnFragmentInteractionListener,
    TercerFragment.OnFragmentInteractionListener,
    CuartoFragment.OnFragmentInteractionListener {

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}

package com.example.proyect


import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.estherlara.taller5.R
import kotlinx.android.synthetic.main.fragment_cuarto.*
import kotlinx.android.synthetic.main.fragment_tercer.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class CuartoFragment : Fragment() {

    private var listener: TercerFragment.OnFragmentInteractionListener? = null


    interface OnFragmentInteractionListener {
        fun onFragmentInteraction(uri: Uri)
    }

    override fun onStart() {
        super.onStart()
        btn_4.setOnClickListener { view ->
            Navigation.findNavController(view).navigate(R.id.actionNext)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cuarto, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is TercerFragment.OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

}

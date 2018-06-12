package com.epita.fr.androidfragtest


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_first.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FirstFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val rootView= inflater!!.inflate(R.layout.fragment_first,container,false)
        return rootView

    }


    override fun onViewCreated(rootView: View, savedInstanceState: Bundle?) {
        val gotoButton = rootView.findViewById<Button>(R.id.fragment_first_btn_goto)
        fragment_first_btn_goto.setOnClickListener {
            Toast.makeText(activity, "Clicked ;-)", Toast.LENGTH_SHORT).show()
            activity!!.supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.main_container,SecondFragment())
                    .commit()

        }
    }


}

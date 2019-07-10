package com.bedev.rvkotlinapi.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.ParsedRequestListener
import com.bedev.rvkotlinapi.adapter.ProfilAdapter
import com.bedev.rvkotlinapi.model.DataProfil
import com.bedev.rvkotlinapi.model.DataProfl
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_profil.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ProfilFragment : Fragment() {
    private val dataProflList: MutableList<DataProfl> = mutableListOf()
    private lateinit var myAdapter: ProfilAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        //setting adapter
        myAdapter = ProfilAdapter(dataProflList)
        var rv = profil_recycler_view

        // Inflate the layout for this fragment
        //setting recyclerview
        val rootView = inflater.inflate(com.bedev.rvkotlinapi.R.layout.fragment_profil, container, false)
        (activity as AppCompatActivity).supportActionBar!!.hide()

        rv = rootView.findViewById(com.bedev.rvkotlinapi.R.id.profil_recycler_view) as RecyclerView
        rv.layoutManager = LinearLayoutManager(activity)

        //connect api

        getDataProfil()
        rv.adapter = myAdapter


        return rootView


    }

    private fun getDataProfil() {
        AndroidNetworking.get("http://informatika.upgris.ac.id/mobile/data/index.php/api/example/detil_pribadi?key=d00ebe4242124b3354559a9eb3d255&npm=16670054")
            .build()
            .getAsObject(DataProfil::class.java, object : ParsedRequestListener<DataProfil> {
                override fun onResponse(response: DataProfil?) {
                    dataProflList.addAll(response!!.data)
                    myAdapter.notifyDataSetChanged()

                }

                override fun onError(anError: ANError?) {

                }

            })
    }


}

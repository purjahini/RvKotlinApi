package com.bedev.rvkotlinapi.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.ParsedRequestListener
import com.bedev.rvkotlinapi.adapter.MyAdapter
import com.bedev.rvkotlinapi.R
import com.bedev.rvkotlinapi.model.DataJdwl
import com.bedev.rvkotlinapi.model.DataJadwal
import kotlinx.android.synthetic.main.fragment_jadwal.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class JadwalFragment : Fragment() {
    private val dataJdwlList: MutableList<DataJdwl> = mutableListOf()
    private lateinit var myAdapter: MyAdapter



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //setting adapter
        myAdapter = MyAdapter(dataJdwlList)
        var rv = my_recycler_view

        // Inflate the layout for this fragment
        //setting recyclerview
        val rootView = inflater.inflate(R.layout.fragment_jadwal, container, false)

        rv = rootView.findViewById(R.id.my_recycler_view) as RecyclerView
        rv.layoutManager = LinearLayoutManager(activity)

        //connect api
        getdata()

        rv.adapter = myAdapter



        return rootView

    }

    private fun getdata() {
        AndroidNetworking.get("http://informatika.upgris.ac.id/mobile/data/index.php/api/example/detil_jadwal?key=d00ebe4242124b3354559a9eb3d255&npm=16670054")
            .build()
            .getAsObject(DataJadwal::class.java, object : ParsedRequestListener<DataJadwal> {
                override fun onResponse(response: DataJadwal?) {
                    dataJdwlList.addAll(response!!.data)
                    myAdapter.notifyDataSetChanged()
                }

                override fun onError(anError: ANError?) {

                }

            })
    }


}

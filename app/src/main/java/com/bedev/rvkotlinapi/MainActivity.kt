package com.bedev.rvkotlinapi

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.bedev.rvkotlinapi.fragment.HomeFragment
import com.bedev.rvkotlinapi.fragment.JadwalFragment
import com.bedev.rvkotlinapi.fragment.ProfilFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.home -> {
                replaceFragment(HomeFragment())

                return@OnNavigationItemSelectedListener true
            }
            R.id.jadwal -> {
                replaceFragment(JadwalFragment())

                return@OnNavigationItemSelectedListener true
            }
            R.id.profil -> {
                replaceFragment(ProfilFragment())

                return@OnNavigationItemSelectedListener true
            }
        }
        false

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        bottomNav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        replaceFragment(HomeFragment())
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }

}

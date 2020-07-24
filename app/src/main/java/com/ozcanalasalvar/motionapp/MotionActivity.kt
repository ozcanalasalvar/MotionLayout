package com.ozcanalasalvar.motionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import kotlinx.android.synthetic.main.coordinatorlayout_header.*
import kotlinx.android.synthetic.main.profile_layout.*
import kotlinx.android.synthetic.main.profile_layout_v2.*

class MotionActivity : AppCompatActivity() {

    private lateinit var drawer: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val key = intent.getIntExtra("key", 0);
        Log.e("key", "" + key)

        when (key) {
            1 -> {
                setContentView(R.layout.profile_layout)
                recyclerView.adapter = DummyRecyclerAdapter()
            }
            2 -> {
                setContentView(R.layout.profile_layout_v2)
                recyclerView2.adapter = DummyRecyclerAdapter()

            }
            3 -> {
                setContentView(R.layout.activity_drawer)
                drawer = findViewById(R.id.motionLayout)
                menuImage.setOnClickListener {
                    drawer.openDrawer(GravityCompat.START)
                }
            }
            else -> {
                setContentView(R.layout.box_layout)
            }
        }


    }
}
package com.ozcanalasalvar.motionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.profile_layout.*
import kotlinx.android.synthetic.main.profile_layout_v2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun startActivity(key: Int) {
        val intent = Intent(this, MotionActivity::class.java)
        intent.putExtra("key", key)
        startActivity(intent)
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.textBox -> startActivity(0)
            R.id.textProfile1 -> startActivity(1)
            R.id.textProfile2 -> startActivity(2)
            R.id.textCollapseToolbar -> startActivity(3)
        }

    }
}
package com.ozcanalasalvar.motionapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView


class DummyRecyclerAdapter() :
    RecyclerView.Adapter<DummyRecyclerAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent, false)

        view.setOnClickListener {
            setAnimation(view,parent.context)
        }

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = 10

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    private fun setAnimation(viewToAnimate: View, context: Context) {
            val animation: Animation =
                AnimationUtils.loadAnimation(context, R.anim.bounce_anim)
            viewToAnimate.startAnimation(animation)
    }
}
package com.sanjaysisodiya.myfirstapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class PersonAdpater(private val personlist:ArrayList<Person>, val context:Context): RecyclerView.Adapter<PersonAdpater.ViewHolder>() {
     override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
          var view=LayoutInflater.from(context).inflate(R.layout.list_row,p0,false)
          return ViewHolder(view)
     }

     override fun getItemCount(): Int {
          return personlist.size
     }

     override fun onBindViewHolder(viewhoilder: ViewHolder, position: Int) {
          viewhoilder!!.name.setText(personlist.get(position).name)
          viewhoilder!!.age.setText(personlist.get(position).age.toString())
     }

    class ViewHolder(itemv: View):RecyclerView.ViewHolder(itemv) {
          var name=itemv.findViewById<TextView>(R.id.name)
          var age=itemv.findViewById<TextView>(R.id.age)

     }

}
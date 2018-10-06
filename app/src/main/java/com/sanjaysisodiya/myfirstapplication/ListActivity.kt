package com.sanjaysisodiya.myfirstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_list)

          invtView()
     }

     private fun invtView() {
          var personlist = ArrayList<Person>()
          var adapter = PersonAdpater(personlist, this)

          rvlist.layoutManager = LinearLayoutManager(this)
          rvlist.adapter = adapter

          for(a in 1..20){
               var person=Person()
               person.age=20+a
               person.name="Sanjay $a"
               personlist!!.add(person)
          }
          adapter.notifyDataSetChanged()
     }
}

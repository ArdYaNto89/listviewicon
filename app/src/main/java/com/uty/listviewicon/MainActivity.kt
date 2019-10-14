package com.uty.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView=findViewById<ListView>(R.id.list_icon)

        var list= mutableListOf<model>()
        list.add(model("Ruby","Ruby is en open-source and fully" +
                "object-oriented programming language.",R.drawable.ruby))
        list.add(model("Rails","Ruby on Rails is a server-side" +
                "web application development framework written in rubby" +
                "language",R.drawable.rails))
        list.add(model("Python","Python is interpreted" +
                " scripting and object-oriented " +
                "programming language",R.drawable.python))
        list.add(model("Java Script","Java Script is an object-based" +
                "scripting language.",R.drawable.js))
        list.add(model("PHP","PHP is an interpreted language," +
                "i.e.,there no need for complication",R.drawable.php))

        listView.adapter=myadapter(mCtx = this, resources = R.layout.row_icon, items = list)

        listView.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
          if(position==0){
              Toast.makeText(this@MainActivity,"kamu telah memilih bahasa Ruby!",Toast.LENGTH_LONG).show()
          }
            if(position==1){
                Toast.makeText(this@MainActivity,"kamu telah memilih bahasa Rails!",Toast.LENGTH_LONG).show()
            }
            if(position==2){
                Toast.makeText(this@MainActivity,"kamu telah memilih bahasa Python!",Toast.LENGTH_LONG).show()
            }
            if(position==3){
                Toast.makeText(this@MainActivity,"kamu telah memilih bahasa Java Script!",Toast.LENGTH_LONG).show()
            }
            if(position==4){
                Toast.makeText(this@MainActivity,"kamu telah memilih bahasa PHP!",Toast.LENGTH_LONG).show()
            }

        }
    }
}

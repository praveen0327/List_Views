package com.example.list_view


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.list_view.databinding.ActivityMainBinding
import org.json.JSONObject


class MainActivity : AppCompatActivity() {
    private  lateinit var binding : ActivityMainBinding
    val language = arrayOf<String>("C","C++","Java",".Net","Kotlin","Ruby","Rails","Python","Java Script","Php","Ajax","Perl","Hadoop")
    val description = arrayOf<String>(
        "C programming is considered as the base for other programming languages",
        "C++ is an object-oriented programming language.",
        "Java is a programming language and a platform.",
        ".NET is a framework which is used to develop software applications.",
        "Kotlin is a open-source programming language, used to develop Android apps and much more.",
        "Ruby is an open-source and fully object-oriented programming language.",
        "Ruby on Rails is a server-side web application development framework written in Ruby language.",
        "Python is interpreted scripting  and object-oriented programming language.",
        "JavaScript is an object-based scripting language.",
        "PHP is an interpreted language, i.e., there is no need for compilation.",
        "AJAX allows you to send and receive data asynchronously without reloading the web page.",
        "Perl is a cross-platform environment used to create network and server-side applications.",
        "Hadoop is an open source framework from Apache written in Java."
    )
    val imageId = arrayOf<Int>(
        R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        val myListAdapter = MyListAdapter(this,language,description,imageId)
        binding.listView.adapter = myListAdapter

        binding.listView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
        }

    }
}
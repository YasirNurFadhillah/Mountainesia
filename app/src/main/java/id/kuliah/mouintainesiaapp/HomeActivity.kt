package id.kuliah.mouintainesiaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.kuliah.mouintainesiaapp.adapter.MountAd
import id.kuliah.mouintainesiaapp.model.listmount
import id.kuliah.mouintainesiaapp.model.mountcode
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {
    private lateinit var rvKode: RecyclerView
    private var list: ArrayList<mountcode> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvKode = findViewById(R.id.listviewicon)
        rvKode.setHasFixedSize(true)
        list.addAll(listmount.codelist)
        showKodingList()
    }
    private fun showKodingList() {
        rvKode.layoutManager = LinearLayoutManager(this)
        val listkodingAdapter = MountAd(list)
        rvKode.adapter = listkodingAdapter
    }

}

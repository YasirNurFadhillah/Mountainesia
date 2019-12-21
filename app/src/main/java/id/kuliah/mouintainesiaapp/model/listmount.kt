package id.kuliah.mouintainesiaapp.model

import id.kuliah.mouintainesiaapp.R

object listmount {
    private val namaIcon = arrayOf(
        "Gunung Bromo",
        "Gunung Ciremai",
        "Gunung Semeru"
    )


    private val logoicon = intArrayOf(
        R.drawable.bromo,
        R.drawable.ciremai,
        R.drawable.semeru
    )

    val codelist: ArrayList<mountcode>
        get() {
            val list = arrayListOf<mountcode>()
            for (position in namaIcon.indices) {
                val kod = mountcode ()
                kod.nama = namaIcon[position]
                kod.logo = logoicon[position]
                list.add(kod)
            }
            return list
        }
}
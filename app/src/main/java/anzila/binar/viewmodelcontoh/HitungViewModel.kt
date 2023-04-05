package anzila.binar.viewmodelcontoh

import androidx.lifecycle.ViewModel

class HitungViewModel : ViewModel() {
    var hasil = 0

    fun Hitung (panjang : Int, lebar : Int, tinggi :Int){
        hasil = panjang * lebar * tinggi
    }
}
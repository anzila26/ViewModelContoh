package anzila.binar.viewmodelcontoh.recycleview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import anzila.binar.viewmodelcontoh.R

class StudentViewModel : ViewModel() {

    val list = arrayListOf(
        DataStudent("Andika", "24616724", R.drawable.elmo),
        DataStudent("Titi", "64634634", R.drawable.elmo),
        DataStudent("Dwika", "536436436", R.drawable.elmo),
        DataStudent("Rois", "454345435",  R.drawable.elmo),
        DataStudent("Wiwit", "3252664",  R.drawable.elmo)
    )

    val studentList : MutableLiveData<List<DataStudent>> = MutableLiveData()

    fun getStudentList(){
        var stu = list
        studentList.value = stu
    }
}
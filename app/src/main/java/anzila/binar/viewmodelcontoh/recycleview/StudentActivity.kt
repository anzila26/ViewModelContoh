package anzila.binar.viewmodelcontoh.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import anzila.binar.viewmodelcontoh.R
import anzila.binar.viewmodelcontoh.databinding.ActivityMainBinding
import anzila.binar.viewmodelcontoh.databinding.ActivityStudentBinding

class StudentActivity : AppCompatActivity() {
    lateinit var binding: ActivityStudentBinding
    lateinit var studentVm: StudentViewModel
    lateinit var studentAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initStudent()
        studentVm = ViewModelProvider(this).get(StudentViewModel::class.java)
        studentVm.getStudentList()

        studentVm.studentList.observe(this, Observer {
            studentAdapter.setStudentData(it as ArrayList<DataStudent>)
        })

    }

    fun initStudent() {
        studentAdapter = StudentAdapter(ArrayList())
        binding.rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvStudent.adapter = studentAdapter
    }

    fun setDataStudent() {

    }
}
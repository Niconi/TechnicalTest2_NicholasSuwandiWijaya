package com.example.technicaltest2_nicholassuwandiwijaya


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentFeature : AppCompatActivity() {


    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_feature)

        recyclerView = findViewById(R.id.studentRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val students = generateStudentList()
        adapter = StudentAdapter(students)
        recyclerView.adapter = adapter

        val itemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(itemDecoration)
    }

    private fun generateStudentList(): List<Student> {
        val studentList = mutableListOf<Student>()
        studentList.add(Student("Jacobus Sumarban", R.drawable.foto1, "Jl Lapangan Bola 4, Dki Jakarta"))
        studentList.add(Student("Hokianto Rinaldi", R.drawable.foto2, "Jl Mangga Besar Raya 4 NN, Dki Jakarta"))
        studentList.add(Student("Diana Bastian", R.drawable.foto3, "Jl Jend Gatot Subroto 16, Dki Jakarta"))
        studentList.add(Student("Faris Rifqy", R.drawable.foto4, "Jl MH Thamrin 14, Dki Jakarta"))
        studentList.add(Student("Simanjuntak Manalu", R.drawable.foto5, "Jl Tebet Tmr Dlm 113, Dki Jakarta"))
        studentList.add(Student("Rahima Syabrina", R.drawable.foto6, "Jl Jend Sudirman Capitol Bl B/2, Jawa Barat"))
        studentList.add(Student("Heru Asmoro Patrick", R.drawable.foto7, "Mandiri Building 5th Floor, JL. Imam Bonjol No. 16D, Medan"))
        studentList.add(Student("Jonathan Patrick Rifqy", R.drawable.foto8, "Kompl Gading Griya Lestari Bl E-3/21, Dki Jakarta"))
        studentList.add(Student("Budi Haryanto", R.drawable.foto9, "Jl Mesjid Raya 92 A, Sulawesi Selatan"))
        studentList.add(Student("Nora Asmara", R.drawable.foto10, "Jl Asia Afrika Bl LT-7/141, Jawa Barat"))

        return studentList
    }
}

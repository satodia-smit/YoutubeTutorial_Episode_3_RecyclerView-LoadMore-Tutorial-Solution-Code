package com.hyperelement.mvvmdemo.data.repository

import android.content.Context
import com.hyperelement.mvvmdemo.data.datasources.local.EmployeeEntity

//we can inject context or dao as per the necessary
class FragmentOneRepository(
    private val context: Context
) {
    fun getEmployee(aNumber: Int): List<EmployeeEntity> {
        val mEmployeeList = mutableListOf<EmployeeEntity>()
        for (x in (aNumber * 10) + 1..(aNumber * 10) + 10) {
            mEmployeeList.add(
                EmployeeEntity(x, "Emp $x")
            )
        }
        return mEmployeeList
    }
}
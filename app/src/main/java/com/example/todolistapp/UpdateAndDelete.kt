package com.example.todolistapp

interface UpdateAndDelete {

    fun modifyItem(itenUID : String, isDone : Boolean)
    fun onItemDelete(itemUID: String)
}
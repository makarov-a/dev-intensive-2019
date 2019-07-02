package ru.skillbranch.devintensive.model

class Chat(
    val id: String,
    val members: MutableList<User> = mutableListOf(),
    val messages: MutableCollection<BaseMessage> = mutableListOf()
){
}
package ru.skillbranch.devintensive.utils

object Utils {
    //TODO: fixme
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return firstName to lastName
    }

    fun transliteration(payload: String, divider:String = " "): String {
        //TODO realize this
        return payload
    }
    fun toInitials(firstName:String?, lastName: String?):String?{
        //TODO realize this
        return firstName
    }
}
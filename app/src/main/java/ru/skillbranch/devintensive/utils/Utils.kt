package ru.skillbranch.devintensive.utils

object Utils {
    //TODO: fixme
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
         var firstName = parts?.getOrNull(0)
         var lastName = parts?.getOrNull(1)
        if (firstName.isNullOrBlank()) firstName = null
        if (lastName.isNullOrBlank()) lastName = null
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
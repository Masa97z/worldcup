package com.masa_97.worldcup.data

object data_manger {
    private val match_list = mutableListOf<match>()
    private var match_index = 0
    fun add_match(match: match){
        match_list.add(match)
    }
    fun current_match() :match = match_list[match_index]
    fun get_next():match{
        match_index ++
        return match_list[match_index]

    }
    fun get_pre():match{

        match_index--
        return match_list[match_index]

    }
}
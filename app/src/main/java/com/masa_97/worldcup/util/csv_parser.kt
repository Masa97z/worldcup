package com.masa_97.worldcup.util

import com.masa_97.worldcup.data.match


class csv_parser {
    fun parse(line : String) : match {
        val tokens =  line.split(",")
        return match(
            year = tokens[constants.column_index.year].toInt(),
            stadium = tokens[constants.column_index.stadium],
            home_team = tokens[constants.column_index.home_team],
            away_team = tokens[constants.column_index.away_team],
            goal_away_team = tokens[constants.column_index.goal_away_team].toInt(),
            goal_home_team = tokens[constants.column_index.goal_home_team].toInt(),
            sity = tokens[constants.column_index.sity]
        )
    }
}
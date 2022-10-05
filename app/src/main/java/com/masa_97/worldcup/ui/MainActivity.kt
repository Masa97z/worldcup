package com.masa_97.worldcup.ui


import android.view.LayoutInflater
import com.masa_97.worldcup.data.data_manger
import com.masa_97.worldcup.data.match
import com.masa_97.worldcup.databinding.ActivityMainBinding
import com.masa_97.worldcup.util.csv_parser
import java.io.BufferedReader
import java.io.InputStreamReader


class MainActivity : baseAvtivity<ActivityMainBinding>() {
    override val bindinginflaytor: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun setup() {
        open_file()
    }

    override fun call_clicker() {
        binding.next.setOnClickListener { bind_match(data_manger.get_next())  }
        binding.pre.setOnClickListener { bind_match(data_manger.get_pre()) }
    }
    fun open_file(){
        val inputStream = assets.open("worldcup.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser = csv_parser()
        buffer.forEachLine {
            val currunt_parser = parser.parse(it)
            data_manger.add_match(currunt_parser)
        }
    bind_match(data_manger.current_match())
    }

    override val LOG_TAG: String = "MainActivity"
    private fun bind_match(match: match){
        binding?.apply {
            year.text = match.year.toString()
            homeTeam.text = match.home_team
            awayTeam.text = match.away_team
            homeGoal.text = match.goal_home_team.toString()
            awayGoal.text = match.goal_away_team.toString()

        }
    }


}

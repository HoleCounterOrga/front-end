package com.hole.counter.presentation.ui.leaderboard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.hole.counter.presentation.ui.leaderboard.navigator.LeaderComponent
import com.hole.counter.viewmodels.leaderboard.LeaderBoardViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun LeaderBoardScreen(
    component: LeaderComponent,
    leaderBoardViewModel: LeaderBoardViewModel = koinViewModel()
    //items: List<LeaderBoardData>
){
    Scaffold {
       Box(modifier = Modifier.fillMaxSize()){
           Text("LeaderBoard")

           /*
           LazyColumn(){
               items(items){
                   CardLeaderBoardItem(
                       name = it.name,
                       score = it.score
                   )
               }
           }*/
       }
    }
}

@Preview
@Composable
fun LeaderBoardPreview(){

    val leaderBoardItems = listOf<LeaderBoardData>(
        LeaderBoardData(
            name = "Lilian Layrac",
            score = 350
        ),
        LeaderBoardData(
            name = "Lilian Layrac",
            score = 350
        ),
        LeaderBoardData(
            name = "Lilian Layrac",
            score = 350
        ),

    )
}

data class LeaderBoardData(
    val name: String,
    val score: Int
)
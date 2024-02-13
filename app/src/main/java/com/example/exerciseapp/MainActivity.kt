package com.example.exerciseapp

import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.indication
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exerciseapp.ui.theme.ExerciseAppTheme
import coil.compose.rememberImagePainter


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExerciseAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Red),
//                    color = MaterialTheme.colorScheme.background
                ) {
                    Phone_Screen()
                }
            }
        }
    }
}

@Composable
fun Phone_Screen(){
    Surface (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        , color = "#9F70FD".color
    ){
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Exercise App",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                Image(
                    modifier = Modifier
                        .size(90.dp)
                        .padding(top = 5.dp, end = 5.dp),
                    painter = painterResource(id = R.drawable.exercise),
                    contentDescription = "exercise",
                )
            }
            // Add your additional text here
            Text(
                modifier = Modifier
                    .padding(start = 10.dp, top = 20.dp),
                text = "Start Your Activty Now to Get Fit",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Start
            )
            Card (modifier = Modifier
                .padding(top = 15.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp)
                ){
            // Add the Portfolio composable here
            Portfolio()
            }
        }
    }
}
//import androidx.compose.ui.graphics.Color
@Composable
fun Portfolio() {
    val data = listOf(
        mapOf(
            "name" to "Crunches",
            "desc" to "Crunches are a classic abdominal exercise. Lie on your back with your knees bent and feet flat on the floor. Cross your arms over your chest or place your hands behind your head. Contract your abdominal muscles and lift your shoulders off the floor, keeping your lower back pressed into the ground. Lower back down with control.",
            "imageUrl" to "https://www.shutterstock.com/image-vector/woman-doing-modified-crunches-abdominals-600nw-2301438025.jpg",
            "color" to Color(0xFFC09CDB)
        ),
        mapOf(
            "name" to "Push-ups",
            "desc" to "Push-ups are a compound exercise that target multiple muscle groups, including the chest, shoulders, triceps, and core. Start in a plank position with your hands shoulder-width apart and your body in a straight line from head to heels. Lower your body until your chest nearly touches the floor, then push back up to the starting position.",
            "imageUrl" to "https://thumbs.dreamstime.com/b/art-illustration-200146808.jpg",
            "color" to Color(0xFFBE76CA)
        ),
        mapOf(
            "name" to "Squats",
            "desc" to "Squats are a lower body exercise that primarily target the quadriceps, hamstrings, and glutes. Stand with your feet shoulder-width apart and your toes pointed slightly outward. Keeping your chest up and back straight, bend your knees and lower your body as if you were sitting back into a chair. Lower until your thighs are parallel to the ground, then push through your heels to return to the starting position.",
            "imageUrl" to "https://www.shutterstock.com/image-vector/man-doing-air-squat-2-600nw-1830755837.jpg",
            "color" to Color(0xFF74AFDF)
        ),
        mapOf(
            "name" to "Lunges",
            "desc" to "Lunges are a unilateral lower body exercise that target the quadriceps, hamstrings, glutes, and calves. Start by standing with your feet together. Take a large step forward with one foot and lower your body until both knees are bent at 90-degree angles, with your back knee hovering just above the ground. Push through your front heel to return to the starting position, then repeat on the other side.",
            "imageUrl" to "https://img.freepik.com/premium-vector/lunge-exercise-men-workout-fitness-aerobic-exercises_476141-861.jpg",
            "color" to Color(0xFF577D81)
        ),
        mapOf(
            "name" to "Plank",
            "desc" to "The plank is a core-strengthening exercise that targets the muscles of the abdomen, lower back, and shoulders. Start in a push-up position with your hands directly under your shoulders and your body in a straight line from head to heels. Hold this position, keeping your core engaged and your hips level, for the desired duration.",
            "imageUrl" to "https://st2.depositphotos.com/4293685/8642/v/950/depositphotos_86427412-stock-illustration-perfect-body-with-the-plank.jpg",
            "color" to Color(0xFFCA94F3)
        ),
        mapOf(
            "name" to "Pull-ups",
            "desc" to "Pull-ups are a compound upper body exercise that primarily target the muscles of the back, including the latissimus dorsi, rhomboids, and traps, as well as the biceps and forearms. Hang from a pull-up bar with your hands slightly wider than shoulder-width apart and your palms facing away from you. Pull yourself up until your chin clears the bar, then lower yourself back down with control.",
            "imageUrl" to "https://thumbs.dreamstime.com/b/man-doing-pull-ups-exercise-flat-vector-illustration-man-doing-pull-ups-exercise-flat-vector-illustration-isolated-white-228445780.jpg",
            "color" to Color(0xFFBBC27C)
        ),
        mapOf(
            "name" to "Burpees",
            "desc" to "Burpees are a full-body exercise that combine a squat, push-up, and jump. Start in a standing position, then squat down and place your hands on the ground in front of you. Jump your feet back into a plank position, perform a push-up, then jump your feet back to the squat position. Explosively jump up into the air, reaching your arms overhead. Land softly and immediately begin the next repetition.",
            "imageUrl" to "https://previews.123rf.com/images/lioputra/lioputra2111/lioputra211100281/179184545-exercise-guide-with-man-doing-the-squat-thrust-burpee-position-in-3-step-illustration-about-workout.jpg?fj=1",
            "color" to Color(0xFFE0A28F)
        )
    )

    LazyColumn {
        items(data) { item ->
            val color = item["color"] as Color

            Surface(
                modifier = Modifier,
                color = Color(0xFFE9D7F7)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp)
                        ,
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = color),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                ) {
                    Row(
                        modifier = Modifier.padding(8.dp)
                    ) {
                        // Load image from URL
                        Image(
                            painter = rememberImagePainter(item["imageUrl"].toString()),
                            contentDescription = null,
                            modifier = Modifier
                                .size(150.dp)
                                .padding(8.dp)
                                .clip(RoundedCornerShape(10.dp)),
                            contentScale = ContentScale.Crop
                        )

                        Column(
                            modifier = Modifier
                                .padding(7.dp)
                                .align(alignment = Alignment.CenterVertically)
                        ) {
                            Text(text = item["name"].toString(), fontWeight = FontWeight.Bold)
                            Text(text = item["desc"].toString(), style = MaterialTheme.typography.bodySmall)
                        }
                    }
                }
            }
        }
    }
}

val String.color
    get() = Color(parseColor(this))


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExerciseAppTheme {
        Phone_Screen()
    }
}
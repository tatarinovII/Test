package com.my.test.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.my.test.models.NextTraining
import com.my.test.res.OpenSansFontFamily
import com.my.test.res.QuicksandFontFamily
import com.my.test.res.colorPrimary
import com.my.test.res.colorPrimaryLight
import com.my.test.res.colorRed
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun App() {
    MaterialTheme {
        HomePage()
    }
}

@Composable
fun HomePage() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            Modifier.padding(start = 15.dp, top = 15.dp), Alignment.TopStart
        ) {
            Text(
                text = "K-FLOW",
                fontFamily = QuicksandFontFamily(),
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                color = colorPrimary
            )
        }
        HorizontalDivider(
            Modifier.padding(top = 15.dp), thickness = 1.dp
        )
        Box(
            modifier = Modifier.fillMaxWidth().padding(start = 24.dp, end = 24.dp, top = 24.dp)
                .background(
                    color = colorPrimaryLight, shape = RoundedCornerShape(15.dp)
                ).wrapContentHeight(), contentAlignment = Alignment.Center

        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Оставшиеся тренировки",
                    modifier = Modifier.padding(top = 28.dp),
                    fontSize = 18.sp,
                    fontFamily = OpenSansFontFamily(),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "5",
                    fontSize = 60.sp,
                    fontFamily = QuicksandFontFamily(),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Вперед к цели!",
                    modifier = Modifier.padding(bottom = 22.dp),
                    fontSize = 14.sp,
                    fontFamily = OpenSansFontFamily(),
                    fontWeight = FontWeight.ExtraLight
                )
            }
        }
        Text(
            text = "Предстоящие тренировки",
            modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 28.dp),
            textAlign = TextAlign.Start,
            fontSize = 24.sp,
            fontFamily = QuicksandFontFamily(),
            fontWeight = FontWeight.Bold
        )
        Column(
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp, top = 13.dp)
        ) {
            NextTrainings(null)
            Spacer(modifier = Modifier.padding(top = 14.dp))
            NextTrainings(null)
        }
        Text(
            text = "История записей",
            modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 28.dp),
            textAlign = TextAlign.Start,
            fontSize = 24.sp,
            fontFamily = QuicksandFontFamily(),
            fontWeight = FontWeight.Bold
        )
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 13.dp, start = 24.dp, end = 24.dp)
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .m3Elevation(shape = RoundedCornerShape(10.dp))
                    .background(shape = RoundedCornerShape(10.dp), color = Color.White)
            ) {
                HistoryTrainingItem()
                HistoryTrainingItem()

            }
            Box(
                contentAlignment = Alignment.BottomCenter,
                modifier = Modifier
                    .padding(vertical = 24.dp, horizontal = 16.dp)
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .background(color = colorPrimary, shape = RoundedCornerShape(10.dp))
            ){
                Text(
                    text = "Купить тренировки",
                    fontFamily = OpenSansFontFamily(),
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(vertical = 16.dp)
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CanceledHistoryBar() {
    Box(
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight()
            .background(color = colorRed, shape = RoundedCornerShape(999.dp)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier
                .padding(vertical = 5.dp, horizontal = 15.dp),
            text = "Отменена",
            textAlign = TextAlign.Center,
            color = Color.White,
            fontFamily = OpenSansFontFamily(),
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp
        )
    }
}

@Composable
fun HistoryTrainingItem() {
    Box(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 11.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Силовая",
                    fontFamily = OpenSansFontFamily(),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Text(
                    text = "15 мая, 19:00",
                    fontFamily = OpenSansFontFamily(),
                    fontWeight = FontWeight.ExtraLight,
                    fontSize = 14.sp
                )
            }
            Box(
                contentAlignment = Alignment.CenterEnd
            ) {
                CanceledHistoryBar()
            }
        }
    }
    HorizontalDivider(thickness = 0.6f.dp)
}

fun Modifier.m3Elevation(
    shape: Shape,
    umbraColor: Color = Color.Black.copy(alpha = 0.2f),
    penumbraColor: Color = Color.Black.copy(alpha = 0.14f)
): Modifier = composed {
    this
        // 1. Umbra (основная, более резкая тень)
        .shadow(
            elevation = 4.dp,
            shape = shape,
            clip = false,
            ambientColor = umbraColor,
            spotColor = umbraColor
        )
        // 2. Penumbra (рассеянная, более мягкая тень)
        .shadow(
            elevation = 8.dp,
            shape = shape,
            clip = false,
            ambientColor = penumbraColor,
            spotColor = penumbraColor
        )
}

@Composable
@Preview()
fun NextTrainings(training: NextTraining?) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .m3Elevation(RoundedCornerShape(10.dp))
            .background(shape = RoundedCornerShape(10.dp), color = Color.White)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp, horizontal = 19.dp)
        ) {
            Column {
                Text(
                    text = "Ср, 22 Мая",
                    fontFamily = OpenSansFontFamily(),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = "Силовая, 19:00 - 20:00",
                    fontSize = 14.sp,
                    fontFamily = OpenSansFontFamily(),
                    fontWeight = FontWeight.Light
                )
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(width = 130.dp, height = 44.dp)
                    .background(color = colorPrimary, shape = RoundedCornerShape(10.dp))
            ) {
                Text(
                    text = "Записаться",
                    fontFamily = OpenSansFontFamily(),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
        }
    }
}
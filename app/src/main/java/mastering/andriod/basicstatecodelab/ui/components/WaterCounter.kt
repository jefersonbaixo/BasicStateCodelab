package mastering.andriod.basicstatecodelab.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import mastering.andriod.basicstatecodelab.R

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count by remember {
        mutableIntStateOf(0)
    }
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = stringResource(id = R.string.water_counter_text, count)
        )
        Button(onClick = { count++ }, Modifier.padding(top = 8.dp)) {
            Text(stringResource(id = R.string.add_one))
        }
    }

}
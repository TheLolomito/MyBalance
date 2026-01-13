package com.mybalance.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountBalanceWallet
import androidx.compose.material.icons.outlined.Assessment
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mybalance.ui.theme.MyBalanceTheme

@Composable
fun HomeScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(modifier = Modifier.fillMaxSize()) {
            HeaderSection()
            CharacterSection()
            TabsSection()
            BalanceSection()
            IncomeExpenseRow()
            ChartSection()
            Spacer(modifier = Modifier.weight(1f))
            BottomNavigationBar()
        }
    }
}

@Composable
private fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = {}) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
        }
        Text(text = "MyBalance", fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
        Box(
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.surfaceVariant)
        )
    }
}

@Composable
private fun CharacterSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(56.dp)
                .clip(CircleShape)
                .background(
                    Brush.linearGradient(
                        listOf(Color(0xFF6EE7F9), Color(0xFF7C83FF))
                    )
                )
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(text = "Nivel 3 · Explorador", fontWeight = FontWeight.SemiBold)
            Text(
                text = "Tu avatar crecerá con tu balance positivo",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Composable
private fun TabsSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TabPill(label = "General", selected = true)
        TabPill(label = "Cuentas", selected = false)
        TabPill(label = "Consejos", selected = false)
    }
}

@Composable
private fun TabPill(label: String, selected: Boolean) {
    val background = if (selected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surfaceVariant
    val contentColor = if (selected) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurfaceVariant
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .background(background)
            .padding(horizontal = 14.dp, vertical = 6.dp)
    ) {
        Text(text = label, fontSize = 12.sp, color = contentColor)
    }
}

@Composable
private fun BalanceSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Balance", fontSize = 13.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
            Text(text = "$45,678.90", fontSize = 26.sp, fontWeight = FontWeight.Bold)
            Text(text = "+20% mes sobre mes", fontSize = 12.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}

@Composable
private fun IncomeExpenseRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        SummaryCard(title = "Ingresos", amount = "$0.00", delta = "+0% mes sobre mes")
        SummaryCard(title = "Gastos", amount = "$0.00", delta = "-0% mes sobre mes")
    }
}

@Composable
private fun SummaryCard(title: String, amount: String, delta: String) {
    Card(
        modifier = Modifier
            .weight(1f)
            .wrapContentHeight(),
        shape = RoundedCornerShape(14.dp),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = title, fontSize = 13.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
            Text(text = amount, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(text = delta, fontSize = 12.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}

@Composable
private fun ChartSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Title", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
            Spacer(modifier = Modifier.height(12.dp))
            Divider(color = MaterialTheme.colorScheme.outlineVariant)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
                    .padding(top = 8.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Gráfico próximamente",
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.surface)
            .border(1.dp, MaterialTheme.colorScheme.outlineVariant)
            .padding(vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = Icons.Default.Home, contentDescription = "Inicio")
        Icon(imageVector = Icons.Default.Search, contentDescription = "Buscar")
        Icon(imageVector = Icons.Outlined.Assessment, contentDescription = "Insights")
        Icon(imageVector = Icons.Outlined.AccountBalanceWallet, contentDescription = "Billetera")
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    MyBalanceTheme {
        HomeScreen()
    }
}

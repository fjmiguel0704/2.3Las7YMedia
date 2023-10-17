package com.example.a7ymedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a7ymedia.databinding.ActivityMainBinding
import com.example.a7ymedia.databinding.PartidaBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingActivityMain: ActivityMainBinding
    lateinit var bindingPartida: PartidaBinding
    var puntuacionGanadora = 7.5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindingActivityMain = ActivityMainBinding.inflate(layoutInflater)
        bindingPartida = PartidaBinding.inflate(layoutInflater)

        setContentView(bindingActivityMain.root)

        bindingActivityMain.botonIrJugar.setOnClickListener {
            if (bindingActivityMain.nombreJugador1.text.isNullOrEmpty()||bindingActivityMain.nombreJugador2.text.isNullOrEmpty()){
                bindingActivityMain.errorDatos.text = "¡Los nombre no pueden estar vacíos!"
            } else if (bindingActivityMain.nombreJugador1.text.isNullOrEmpty()&&bindingActivityMain.nombreJugador2.text.isNullOrEmpty()){
                bindingActivityMain.errorDatos.text = "¡Los nombre no pueden estar vacíos!"
            } else {
                setContentView(bindingPartida.root)
                bindingPartida.mostrarNomJugador1.text = bindingActivityMain.nombreJugador1.text.toString()
                bindingPartida.mostrarNomJugador2.text = bindingActivityMain.nombreJugador2.text.toString()
            }
        }
        fun turnoJugador(): Int{
            return (1..2).random()
        }

        var turno = turnoJugador()

        //while (bindingPartida.puntuacionJ1>puntuacionGanadora)

        //if turno == 1{
        //    bindingPartida.cartaJugador1.isEnabled(false)
       // }

    }
}
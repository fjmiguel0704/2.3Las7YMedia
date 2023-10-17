package com.example.a7ymedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a7ymedia.databinding.ActivityMainBinding
import com.example.a7ymedia.databinding.PartidaBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingActivityMain: ActivityMainBinding
    lateinit var bindingPartida: PartidaBinding
    val puntuacionGanadora = 7.5
    var aleatorioPuntuacion: Int = 0
    var puntosGeneradosJ1: Double = 0.0
    var puntosGeneradosJ2: Double = 0.0
    var puntuacionActualJ1Cadena: String = ""
    var puntuacionActualJ2Cadena: String = ""
    var puntuacionActualJ1Num: Double = 0.0
    var puntuacionActualJ2Num: Double = 0.0

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
                bindingPartida.mostrarNomJugador1.text = bindingActivityMain.nombreJugador1.text.toString() + " J1"
                bindingPartida.mostrarNomJugador2.text = bindingActivityMain.nombreJugador2.text.toString() + " J2"
            }
        }

        fun cartaGenerada(): Int{
            return (1..9).random()
        }

            bindingPartida.cartaJugador1.setOnClickListener {
                aleatorioPuntuacion = cartaGenerada()
                if (aleatorioPuntuacion==1){
                    puntosGeneradosJ1=1.0
                } else if (aleatorioPuntuacion==2){
                    puntosGeneradosJ1=2.0
                } else if (aleatorioPuntuacion==3){
                    puntosGeneradosJ1=3.0
                } else if (aleatorioPuntuacion==4){
                    puntosGeneradosJ1=4.0
                } else if (aleatorioPuntuacion==5){
                    puntosGeneradosJ1=5.0
                } else if (aleatorioPuntuacion==6){
                    puntosGeneradosJ1=6.0
                } else if (aleatorioPuntuacion==7){
                    puntosGeneradosJ1=0.5
                } else if (aleatorioPuntuacion==8){
                    puntosGeneradosJ1=0.5
                } else if (aleatorioPuntuacion==9){
                    puntosGeneradosJ1=0.5
                } else {
                    puntosGeneradosJ1=0.0
                }

                puntuacionActualJ1Cadena = puntosGeneradosJ1.toString()
                bindingPartida.puntuacionActualJ1.text = puntuacionActualJ1Cadena

                puntuacionActualJ1Cadena = bindingPartida.puntuacionJ1.text.toString()
                puntuacionActualJ1Num = puntuacionActualJ1Cadena.toDouble()
                puntuacionActualJ1Num += puntosGeneradosJ1
                bindingPartida.puntuacionJ1.text = puntuacionActualJ1Num.toString()
            }


        bindingPartida.cartaJugador2.setOnClickListener {
            aleatorioPuntuacion = cartaGenerada()
            if (aleatorioPuntuacion==1){
                puntosGeneradosJ2=1.0
            } else if (aleatorioPuntuacion==2){
                puntosGeneradosJ2=2.0
            } else if (aleatorioPuntuacion==3){
                puntosGeneradosJ2=3.0
            } else if (aleatorioPuntuacion==4){
                puntosGeneradosJ2=4.0
            } else if (aleatorioPuntuacion==5){
                puntosGeneradosJ2=5.0
            } else if (aleatorioPuntuacion==6){
                puntosGeneradosJ2=6.0
            } else if (aleatorioPuntuacion==7){
                puntosGeneradosJ2=0.5
            } else if (aleatorioPuntuacion==8){
                puntosGeneradosJ2=0.5
            } else if (aleatorioPuntuacion==9){
                puntosGeneradosJ2=0.5
            } else {
                puntosGeneradosJ2=0.0
            }

            puntuacionActualJ2Cadena = puntosGeneradosJ2.toString()
            bindingPartida.puntuacionActualJ2.text = puntuacionActualJ2Cadena

            puntuacionActualJ2Cadena = bindingPartida.puntuacionJ2.text.toString()
            puntuacionActualJ2Num = puntuacionActualJ2Cadena.toDouble()
            puntuacionActualJ2Num += puntosGeneradosJ2
            bindingPartida.puntuacionJ2.text = puntuacionActualJ2Num.toString()

        }
    }
}
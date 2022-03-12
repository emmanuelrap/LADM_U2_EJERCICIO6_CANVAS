package com.example.ladm_u2_ejercicio6_canvas
import android.graphics.*
import android.view.View


class Lienzo(activity: MainActivity) : View(activity) {
    var activity=activity
    var logo=BitmapFactory.decodeResource(activity.resources,R.drawable.logo)

    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        var p=Paint(); //Paint(Acuarela)

       //Fondo
        p.color = Color.rgb(180,140,190)
        c.drawRect(0f,0f,10000f,10000f,p)

        p.color = Color.rgb(0,0,0)
        p.textSize = 150f


        c.drawText("Bienvenidos",150f,200f,p)
        c.drawBitmap(logo,(320).toFloat(),(300).toFloat(),p)

        p.textSize = 60f
        p.color = Color.rgb(0,170,255)
        c.drawText("Usuario:",170f,890f,p)
        c.drawText("Contraseña:",170f,1180f,p)

        //sombra editText
        p.color = Color.rgb(60,60,60)
        c.drawRect(170f,910f,900f,1010f,p)
        c.drawRect(170f,1200f,900f,1300f,p)

        //EditText
        p.color = Color.rgb(255,255,255)
        c.drawRect(175f,915f,905f,1015f,p)
        c.drawRect(175f,1205f,905f,1305f,p)

        //boton
        p.color = Color.rgb(40,100,200)
        c.drawRoundRect(RectF(275f, 1450f, 820f, 1600f), 20f, 20f, p)

        p.textSize = 70f
        p.color = Color.rgb(255,255,255)
        c.drawText("ENTRAR",400f,1550f,p)





    }
}
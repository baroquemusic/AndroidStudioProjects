package com.unicorn.userinteractions

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var showToast: Button
    lateinit var showSnackbar: Button
    lateinit var showDialog: Button
    lateinit var myLayout: ConstraintLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast = findViewById(R.id.buttonShowToast)
        showSnackbar = findViewById(R.id.buttonShowSnackbar)
        showDialog = findViewById(R.id.buttonShowDialog)
        myLayout = findViewById(R.id.myLayout)

        showToast.setOnClickListener {

            Toast.makeText(applicationContext,"My Toast Message Hurray!",Toast.LENGTH_LONG).show()

        }

        showSnackbar.setOnClickListener {

            Snackbar.make(myLayout, "My Snackbar message hurray!", Snackbar.LENGTH_INDEFINITE).setAction("Gotya!",
                View.OnClickListener {}).show()

        }

        showDialog.setOnClickListener {

            showDialog()

        }

    }

    fun showDialog () {

        var alertDialog = AlertDialog.Builder(this@MainActivity)

        alertDialog.setTitle("Change it!")
            .setMessage("Do you wanna change the button text?")
            .setIcon(R.drawable.warning)
            .setCancelable(false)
            .setNegativeButton("Nope", DialogInterface.OnClickListener { dialog, which ->

                dialog.cancel()

            })
            .setPositiveButton("YUP!", DialogInterface.OnClickListener { dialog, which ->

                showDialog.text = "Yuppy yeah!"

            })

        alertDialog.create().show()

    }
}

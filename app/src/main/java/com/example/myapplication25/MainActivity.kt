package com.example.myapplication25

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import com.example.myapplication25.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        drive()
    }

    class ResultFirstCar : DialogFragment() {
        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            return activity?.let {
                val firstDialog = AlertDialog.Builder(it)
                firstDialog.setTitle(R.string.dialog_message)
                    .setMessage("It's a red car!")
                    .setIcon(R.drawable.finish)
                    .setPositiveButton(R.string.congratulations) { dialog, _ ->
                        dialog.cancel()
                    }
                firstDialog.create()
            } ?: throw IllegalStateException("Activity cannot be null")
        }
    }

    class ResultSecondCar : DialogFragment() {
        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            return activity?.let {
                val secondDialog = AlertDialog.Builder(it)
                secondDialog.setTitle(R.string.dialog_message)
                    .setMessage("It's a white car!")
                    .setIcon(R.drawable.finish)
                    .setPositiveButton(R.string.congratulations) { dialog, _ ->
                        dialog.cancel()
                    }
                secondDialog.create()
            } ?: throw IllegalStateException("Activity cannot be null")
        }
    }

    class ResultThirdCar : DialogFragment() {

        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            return activity?.let {
                val thirdDialog = AlertDialog.Builder(it)
                thirdDialog.setTitle(R.string.dialog_message)
                    .setMessage("It's a blue car!")
                    .setIcon(R.drawable.finish)
                    .setPositiveButton(R.string.congratulations) { dialog, _ ->
                        dialog.cancel()
                    }
                thirdDialog.create()
            } ?: throw IllegalStateException("Activity cannot be null")
        }
    }

    private fun drive() {
        binding.button.setOnClickListener {
            val speedCar1 = Random.nextInt(1000, 2500)
            val speedCar2 = Random.nextInt(1000, 2500)
            val speedCar3 = Random.nextInt(1000, 2500)
            val anim1 = animation(binding.iVCar1, R.anim.firstcar)
            anim1.apply {
                this.duration = speedCar1.toLong()
                if (speedCar2 > speedCar1 && speedCar1 < speedCar3) {
                    showMessage(speedCar1) {
                        ResultFirstCar().show(supportFragmentManager, "first car")
                    }
                }
            }
            val anim2 = animation(binding.iVCar2, R.anim.secondcar)
            anim2.apply {
                this.duration = speedCar2.toLong()
                if (speedCar1 > speedCar2 && speedCar2 < speedCar3) {
                    showMessage(speedCar2) {
                        ResultSecondCar().show(supportFragmentManager, "second car")
                    }
                }
            }
            val anim3 = animation(binding.iVCar3, R.anim.thirdcar)
            anim3.apply {
                this.duration = speedCar3.toLong()
                if (speedCar1 > speedCar3 && speedCar3 < speedCar2) {
                    showMessage(speedCar3) {
                        ResultThirdCar().show(supportFragmentManager, "third car")
                    }
                }
            }
        }
    }
    private fun animation(name: ImageView, id: Int): Animation {
        val animation: Animation = AnimationUtils.loadAnimation(this, id)
        name.startAnimation(animation)
        return animation
    }

    companion object {
        fun showMessage(delay: Int, process: () -> Unit) {
            Handler().postDelayed({
                process()
            }, delay.toLong())
        }
    }
}
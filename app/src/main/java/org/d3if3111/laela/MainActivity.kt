package org.d3if3111.laela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import org.d3if3111.laela.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener { hitungRuang() }
    }
    private fun hitungRuang() {
        val sisi1 = binding.sisi1EditText.text.toString()
        if (TextUtils.isEmpty(sisi1)) {
            Toast.makeText(this, R.string.sisi1_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val sisi2 = binding.sisi2EditText.text.toString()
        if (TextUtils.isEmpty(sisi1)) {
            Toast.makeText(this, R.string.sisi2_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val sisi3 = binding.sisi3EditText.text.toString()
        if (TextUtils.isEmpty(sisi1)) {
            Toast.makeText(this, R.string.sisi3_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val volume = sisi1.toFloat() * sisi2.toFloat() * sisi3.toFloat()

        binding.hitungTextView.text = getString(R.string.volume_x, volume)
    }
}
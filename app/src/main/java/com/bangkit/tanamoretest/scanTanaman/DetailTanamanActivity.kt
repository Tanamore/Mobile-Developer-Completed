package com.bangkit.tanamoretest.scanTanaman


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.tanamoretest.R
import com.bangkit.tanamoretest.databinding.ActivityDetailTanamanBinding
import com.bangkit.tanamoretest.response.PlantInfo
import com.bumptech.glide.Glide

class DetailTanamanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailTanamanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailTanamanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = intent.getStringExtra("ANALYSIS_RESULT")
        val confidence = intent.getStringExtra("CONFIDENCE")
        val imageUrl = intent.getStringExtra("IMAGE_URL")
        val plantInfo: PlantInfo? = intent.getParcelableExtra("PLANT_INFO")

        imageUrl?.let {
            Glide.with(this)
                .load(Uri.parse(it))
                .placeholder(R.drawable.ic_placeholder)
                .into(binding.analyzedImage)
        }

        binding.tvResult.text = result ?: "No result"
        binding.tvConfidence.text = "Confidence: $confidence"

        plantInfo?.let {
            binding.tvPlantName.text = it.plantName ?: "Unknown Plant"
            binding.tvScientificName.text = "Scientific Name: ${it.scientificName ?: "N/A"}"
            binding.tvOriginPlace.text = "Origin: ${it.originPlace ?: "Unknown"}"
            binding.tvClimate.text = "Climate: ${it.climate ?: "Unknown"}"
            binding.tvCommonDisease.text = "Common Disease: ${it.commonDisease ?: "None"}"
            binding.tvDescription.text = it.description ?: "No description available"
        } ?: run {
            binding.tvPlantName.text = "No plant information"
        }

        binding.icBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, ScanTanamanActivity::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}
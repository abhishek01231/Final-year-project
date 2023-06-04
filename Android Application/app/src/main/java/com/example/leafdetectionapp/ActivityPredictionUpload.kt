package com.example.leafdetectionapp

import android.graphics.Bitmap
import android.graphics.Matrix
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.Gravity
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_prediction.*
import java.io.IOException

class ActivityPredictionUpload : AppCompatActivity() {

    private lateinit var mClassifier: Classifier
    private lateinit var mBitmap: Bitmap

    private val mInputSize = 224
    private val mModelPath = "leaf-cnn-mobilenet.tflite"
    private val mLabelPath = "labels.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prediction_upload)

        val image = findViewById<ImageView>(R.id.uploadImageView)
        val intent = intent
        val imageUri = Uri.parse(intent.getStringExtra("image-uri"))
        try {
            mBitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, imageUri)
        } catch (e: IOException) {
            e.printStackTrace()
        }
        /*val toast = Toast.makeText(this, ("Image cropped to: w= ${mBitmap.width} h= ${mBitmap.height}"), Toast.LENGTH_LONG)
        toast.setGravity(Gravity.BOTTOM, 0, 20)
        toast.show()*/
        image.setImageBitmap(mBitmap)
        mBitmap = scaleImage(mBitmap)

        mClassifier = Classifier(assets, mModelPath, mLabelPath, mInputSize)

        detectButton.setOnClickListener {
            val results = mClassifier.recognizeImage(mBitmap).firstOrNull()
            val bottomSheetFragment = BottomSheetFragment()

            val result_text= results?.title+"\n Confidence:"+results?.confidence

            val bundle = Bundle()
            bundle.putString("message", result_text)
            bottomSheetFragment.arguments = bundle

            bottomSheetFragment.show(supportFragmentManager,"BottomSheetDialog")
        }
    }
    fun scaleImage(bitmap: Bitmap?): Bitmap {
        val originalWidth = bitmap!!.width
        val originalHeight = bitmap.height
        val scaleWidth = mInputSize.toFloat() / originalWidth
        val scaleHeight = mInputSize.toFloat() / originalHeight
        val matrix = Matrix()
        matrix.postScale(scaleWidth, scaleHeight)
        return Bitmap.createBitmap(bitmap, 0, 0, originalWidth, originalHeight, matrix, true)
    }
}
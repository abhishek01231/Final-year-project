package com.example.leafdetectionapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_sheet_fragment.*

class BottomSheetFragment: BottomSheetDialogFragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.bottom_sheet_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fun TextView.setTextColor(color: Long) = this.setTextColor(color.toInt())

        var myValue: String? = this.arguments?.getString("message")

        val result_array: List<String>? = myValue?.split("\n")

        val disease: String? = result_array?.get(0)
        val conf: String? = result_array?.get(1)

        val string1: String? = "Oops!!"
        val string2: String? = "Leaf is not properly detected.Please upload other image and try again."

        val conf_array : List<String>? = conf?.split(":")
        val confidence: Double? = conf_array?.get(1)?.toDoubleOrNull()

        if (confidence != null) {
            if(confidence >= 0.80) {
                mResultTextView.text = disease
                mConfidenceTextView.text = conf
            }else{
                mResultTextView.text = string1
                mConfidenceTextView.text = string2
                mResultTextView.setTextColor(0xffff0000)
                mConfidenceTextView.setTextColor(0xffff6b6b)
            }
        }
        else{
            mResultTextView.text = string1
            mConfidenceTextView.text = string2
            mResultTextView.setTextColor(0xffff0000)
            mConfidenceTextView.setTextColor(0xffff6b6b)
        }

        fragment_btn.setOnClickListener{
            if (confidence != null) {
                if(confidence>=0.80) {
                    if (disease == "cherry including sour powdery mildew" || disease == "squash powdery mildew") {
                        val intent = Intent(activity, ActivityPowderyMildew::class.java)
                        startActivity(intent)
                    } else if (disease == "tomato mosaic virus") {
                        val intent = Intent(activity, ActivityMosaicVirus::class.java)
                        startActivity(intent)
                    } else if (disease == "tomato yellow leaf curl virus") {
                        val intent = Intent(activity, ActivityMosaicVirus::class.java)
                        startActivity(intent)
                    } else if (disease == "tomato target spot") {
                        val intent = Intent(activity, ActivityTargetSpot::class.java)
                        startActivity(intent)
                    } else if (disease == "tomato two spotted spider mite") {
                        val intent = Intent(activity, ActivitySpiderMite::class.java)
                        startActivity(intent)
                    } else if (disease == "tomato septoria leaf spot") {
                        val intent = Intent(activity, ActivitySeptoriaLeafSpot::class.java)
                        startActivity(intent)
                    } else if (disease == "tomato leaf mold") {
                        val intent = Intent(activity, ActivityLeafMold::class.java)
                        startActivity(intent)
                    } else if (disease == "strawberry leaf scorch") {
                        val intent = Intent(activity, ActivityLeafScorch::class.java)
                        startActivity(intent)
                    } else if (disease == "tomato late blight" || disease == "potato late blight") {
                        val intent = Intent(activity, ActivityLateBlight::class.java)
                        startActivity(intent)
                    } else if (disease == "tomato early blight" || disease == "potato early blight") {
                        val intent = Intent(activity, ActivityEarlyBlight::class.java)
                        startActivity(intent)
                    } else if (disease == "tomato bacterial spot" || disease == "pepper bell bacterial spot" || disease == "peach bacterial spot") {
                        val intent = Intent(activity, ActivityBacterialSpot::class.java)
                        startActivity(intent)
                    } else if (disease == "orange haunglongbing citrus greening") {
                        val intent = Intent(activity, ActivityCitrusGreening::class.java)
                        startActivity(intent)
                    } else if (disease == "grape leaf blight isariopsis leaf spot") {
                        val intent = Intent(activity, ActivityIsariopsisLeafSpot::class.java)
                        startActivity(intent)
                    } else if (disease == "apple scab") {
                        val intent = Intent(activity, ActivityAppleScab::class.java)
                        startActivity(intent)
                    } else if (disease == "grape esca black measles") {
                        val intent = Intent(activity, ActivityBlackMeasles::class.java)
                        startActivity(intent)
                    } else if (disease == "apple black rot" || disease == "grape black rot") {
                        val intent = Intent(activity, ActivityBlackRot::class.java)
                        startActivity(intent)
                    } else if (disease == "corn maize common rust") {
                        val intent = Intent(activity, ActivityCommonRust::class.java)
                        startActivity(intent)
                    } else if (disease == "corn maize cercospora gray leaf spot") {
                        val intent = Intent(activity, ActivityGrayLeafSpot::class.java)
                        startActivity(intent)
                    } else if (disease == "apple cedar apple rust") {
                        val intent = Intent(activity, ActivityLeafRust::class.java)
                        startActivity(intent)
                    } else if (disease == "corn maize northern leaf blight") {
                        val intent = Intent(activity, ActivityNorthernLeafBlight::class.java)
                        startActivity(intent)
                    }
                }
                else
                    Toast.makeText(context,"Not Available",Toast.LENGTH_SHORT).show()
            }
            else
                Toast.makeText(context,"Not Available",Toast.LENGTH_SHORT).show()
        }
    }
}
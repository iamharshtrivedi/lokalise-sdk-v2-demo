package com.lokalise.demo

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.lokalise.demo.databinding.ActivityMainBinding
import com.lokalise.sdk.Lokalise
import com.lokalise.sdk.LokaliseContextWrapper
import java.text.DateFormat
import java.util.Date
import java.util.Locale


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        val lokaliseResources = getString(R.string.hello_world)
        binding.testTextView.text = lokaliseResources
        with (binding) {
            val quantityStringFor1 = getString(R.string.have_cats, 0)
            pluralViewOne.text = quantityStringFor1

            val quantityStringFor2 = getString(R.string.have_cat, 1)
            pluralViewFew.text = quantityStringFor2

            val quantityStringFor5 = getString(R.string.have_cats, 3)
            pluralViewMany.text = quantityStringFor5

            val currentDateTime = Date()
            localizedDateTimeView.text = DateFormat.getDateTimeInstance().format(currentDateTime)

            buttonEnglish.setOnClickListener {
                Lokalise.setLocale("en","US")
                recreate()
            }
            buttonGujarati.setOnClickListener {
                Lokalise.setLocale("guj","IN")
                recreate()
            }
            buttonHindi.setOnClickListener {
                Lokalise.setLocale("hi","IN")
                recreate()
            }
            buttonArabic.setOnClickListener {
                Lokalise.setLocale("ar","UAE")
                recreate()
            }
            buttonFrench.setOnClickListener {
                Lokalise.setLocale("fr","FR")
                recreate()
            }
            buttonGerman.setOnClickListener {
                Lokalise.setLocale("de","DE")
                recreate()
            }
            buttonSpanish.setOnClickListener {
                Lokalise.setLocale("es","ES")
                recreate()
            }

        }
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LokaliseContextWrapper.wrap(newBase))

//        val localeToSwitch = Locale("lv")
//        val localeUpdatedContext = ContextUtils.updateLocale(newBase, localeToSwitch)
//        super.attachBaseContext(localeUpdatedContext)
    }
    }
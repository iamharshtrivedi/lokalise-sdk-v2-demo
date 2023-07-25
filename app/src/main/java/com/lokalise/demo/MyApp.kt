package com.lokalise.demo
import android.app.Application
import android.util.Log
import com.lokalise.sdk.Lokalise

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize the SDK
        Lokalise.init(this, "613e6ed37a23a537a9cb99daf71326e8d82b", "9421655964b914907e1069.40631988")

        // Add this only if you want to use pre-release bundles
        Lokalise.isPreRelease = true

        // Total number of languages
        Log.e("Lokalise","Total Language: ${Lokalise.getAvailableLocales().size}")
        for (i in Lokalise.getAvailableLocales().indices){
            Log.e("Lokalise","$i. ${Lokalise.getAvailableLocales()[i].displayName}")
        }

        // Fetch the latest translations from Lokalise (can be called anywhere)
        Lokalise.updateTranslations()
    }
}
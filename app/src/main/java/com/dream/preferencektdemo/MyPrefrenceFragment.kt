package com.dream.preferencektdemo

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class MyPrefrenceFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }
}
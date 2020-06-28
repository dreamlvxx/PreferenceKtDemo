package com.dream.preferencektdemo

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class SyncFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.sync_oreferences, rootKey)
    }
}
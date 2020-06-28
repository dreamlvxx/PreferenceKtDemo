package com.dream.preferencektdemo

import android.os.Bundle
import android.widget.Toast
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat

class SyncFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.sync_oreferences, rootKey)

        val clickPre = findPreference<Preference>("clickpre")
        clickPre?.setOnPreferenceClickListener {
            Toast.makeText(context,"click---",Toast.LENGTH_LONG).show()
            true
        }
    }
}
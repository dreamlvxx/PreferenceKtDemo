package com.dream.preferencektdemo

import android.os.Bundle
import android.widget.Toast
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceManager

class SyncFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.sync_oreferences, rootKey)

        val clickPre = findPreference<Preference>("clickpre")
        clickPre?.setOnPreferenceClickListener {
            Toast.makeText(context,"click---",Toast.LENGTH_LONG).show()
            true
        }

        val preManager = PreferenceManager.getDefaultSharedPreferences(context)
        val clickpre = preManager.getBoolean("notifications",false)
        Toast.makeText(context,"value = $clickpre",Toast.LENGTH_LONG).show()

    }
}
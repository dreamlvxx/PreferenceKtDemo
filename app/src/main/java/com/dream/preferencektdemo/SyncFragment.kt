package com.dream.preferencektdemo

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceManager
import androidx.preference.SwitchPreferenceCompat

class SyncFragment : PreferenceFragmentCompat(), Preference.OnPreferenceChangeListener,
    SharedPreferences.OnSharedPreferenceChangeListener {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.sync_oreferences, rootKey)

        val clickPre = findPreference<Preference>("clickpre")
        clickPre?.setOnPreferenceClickListener {
            Toast.makeText(context,"click---",Toast.LENGTH_LONG).show()
            true
        }

        val noti = findPreference<SwitchPreferenceCompat>("notifications")
        noti?.onPreferenceChangeListener = this

        val preManager = PreferenceManager.getDefaultSharedPreferences(context)
        val clickpre = preManager.getBoolean("notifications",false)
        Toast.makeText(context,"value = $clickpre",Toast.LENGTH_LONG).show()
    }

    override fun onPreferenceChange(preference: Preference?, newValue: Any?): Boolean {
        Toast.makeText(context,"click the cliczpre new value = $newValue",Toast.LENGTH_LONG).show()
        return true
    }

    override fun onResume() {
        super.onResume()
        preferenceManager.sharedPreferences.registerOnSharedPreferenceChangeListener(this)
    }

    override fun onPause() {
        super.onPause()
        preferenceManager.sharedPreferences.unregisterOnSharedPreferenceChangeListener(this)
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences?, key: String?) {
        when(key){
            "notifications" -> {
                Toast.makeText(context,"key is signature",Toast.LENGTH_LONG).show()
            }
        }
    }


}
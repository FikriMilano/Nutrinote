package com.sv.calorieintakeapps.feature_homepage.presentation.history

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.sv.calorieintakeapps.R
import com.sv.calorieintakeapps.feature.home.presentation.history.PendingReportsFragment

class HistoryPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = PendingReportsFragment()
            1 -> fragment = CompletedReportsFragment()
        }
        return fragment!!
    }

    override fun getCount(): Int {
        return 2
    }

    @StringRes
    private val TAB_TITLES = intArrayOf(
        R.string.tab_proses,
        R.string.tab_selesai
    )

    override fun getPageTitle(position: Int): CharSequence {
        return context.resources.getString(TAB_TITLES[position])
    }
}
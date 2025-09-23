package com.example.lab_week_04 // Or the correct package for your adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

// Define TABS_FIXED if it's not already defined elsewhere
// For example, in your CafeFragment or a constants file
private val TABS_FIXED = arrayOf(
    R.string.tab_text_1, // Replace with your actual string resources
    R.string.tab_text_2
    // Add more tabs as needed
)


class CafeAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return TABS_FIXED.size // Or the number of tabs you have
    }

    override fun createFragment(position: Int): Fragment {
        // Return the fragment for each tab position
        // Example:
        return when (position) {
            0 -> DrinksFragment() // Replace with your actual fragment
            1 -> FoodFragment()   // Replace with your actual fragment
            // Add more cases as needed
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}
    
package ua.lutsenko.vladyslav.moduleapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_f.*

class FFragment : Fragment(R.layout.fragment_f) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toGFragmentButton?.setOnClickListener {
            findNavController().navigate(R.id.action_FFragment_to_GFragment)
        }
    }
}
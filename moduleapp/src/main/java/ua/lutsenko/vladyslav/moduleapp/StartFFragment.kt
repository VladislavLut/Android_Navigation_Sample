package ua.lutsenko.vladyslav.moduleapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_start_f.*

class StartFFragment : Fragment(R.layout.fragment_start_f) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toFFragmentButton?.setOnClickListener {
            findNavController().navigate(R.id.action_startFFragment_to_FFragment)
        }
    }
}
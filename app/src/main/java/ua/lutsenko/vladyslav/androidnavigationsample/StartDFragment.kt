package ua.lutsenko.vladyslav.androidnavigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_start_d.*

class StartDFragment : Fragment(R.layout.fragment_start_d) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toDFragmentButton?.setOnClickListener {
            findNavController().navigate(R.id.action_startDFragment_to_DFragment)
        }
    }
}
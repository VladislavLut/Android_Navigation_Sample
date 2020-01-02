package ua.lutsenko.vladyslav.androidnavigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_d.*

class DFragment : Fragment(R.layout.fragment_d) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toEFragmentButton?.setOnClickListener {
            findNavController().navigate(R.id.action_DFragment_to_EFragment)
        }
    }
}
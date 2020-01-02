package ua.lutsenko.vladyslav.androidnavigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_a.*

class AFragment : Fragment(R.layout.fragment_a) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toCFragmentButton?.setOnClickListener {
            findNavController().navigate(R.id.action_AFragment_to_CFragment)
        }
    }
}
package ua.lutsenko.vladyslav.androidnavigationsample

import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_start.*

class StartFragment : Fragment(R.layout.fragment_start) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toAFragmentButton?.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_AFragment)
        }
        toBFragmentButton?.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_BFragment)
        }
        toSecondaryGraphButton?.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_navigation_secondary)
        }
        toDeepLinkButton?.setOnClickListener {
            findNavController().navigate(Uri.parse("app://start/d"))
        }
        toExternalModuleDeepLinkButton?.setOnClickListener {
            findNavController().navigate(Uri.parse("app://start/f"))
        }
    }

}
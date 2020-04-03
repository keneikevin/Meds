package com.example.meds

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.meds.databinding.FragmentChatBinding

/**
 * A simple [Fragment] subclass.
 */
class ChatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val binding = DataBindingUtil.inflate<FragmentChatBinding>(inflater,R.layout.fragment_chat,container,false)
        return binding.root
    }

}

package com.example.meds

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.meds.databinding.FragmentJournalBinding

/**
 * A simple [Fragment] subclass.
 */
class JournalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentJournalBinding>(inflater,R.layout.fragment_journal,container,false)
        binding.butto.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_journalFragment_to_chatFragment)}
        binding.button8.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_journalFragment_to_chekupFragment)}
        return binding.root
    }

}

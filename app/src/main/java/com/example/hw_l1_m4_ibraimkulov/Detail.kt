package com.example.hw_l1_m4_ibraimkulov

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.hw_l1_m4_ibraimkulov.databinding.FragmentDetailBinding

class Detail: Fragment() {
    val binding :FragmentDetailBinding by lazy {
        FragmentDetailBinding.inflate(layoutInflater)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val args = DetailArgs.fromBundle(it)
            binding.tvName.text = args.user
            binding.tvEmail.text = args.email
            binding.tvPassword.text = args.password
        }

    }




}



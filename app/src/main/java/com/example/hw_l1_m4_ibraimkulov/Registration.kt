package com.example.hw_l1_m4_ibraimkulov

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw_l1_m4_ibraimkulov.databinding.FragmentRegistrationBinding


class Registration : Fragment() {
      private val binding :FragmentRegistrationBinding by lazy {
          FragmentRegistrationBinding.inflate(layoutInflater)
      }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonSend.setOnClickListener {
            val user = binding.etName.text.toString()
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.toString()
            val action = RegistrationDirections.actionRegistrationToDetails(user, email, password)
            findNavController().navigate(action)

        }
    }




}






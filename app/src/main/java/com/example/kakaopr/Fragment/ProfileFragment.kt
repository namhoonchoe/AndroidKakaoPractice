package com.example.kakaopr.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kakaopr.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    private var profileBinding:FragmentProfileBinding? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentProfileBinding.inflate(inflater, container, false)
        profileBinding  = binding
        return profileBinding?.root
    }

    override fun onDestroyView() {
        profileBinding = null
        super.onDestroyView()
    }
}
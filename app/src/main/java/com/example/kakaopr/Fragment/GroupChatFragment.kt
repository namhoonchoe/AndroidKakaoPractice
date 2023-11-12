package com.example.kakaopr.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kakaopr.databinding.FragmentGroupChatBinding


class GroupChatFragment : Fragment() {

    private var groupChatBinding:FragmentGroupChatBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // 뷰바인딩 정리!!!

         val binding = FragmentGroupChatBinding.inflate(inflater, container, false)
        groupChatBinding  = binding
        return groupChatBinding?.root
    }

    override fun onDestroyView() {
        groupChatBinding = null
        super.onDestroyView()
    }
}
package com.example.kakaopr.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kakaopr.databinding.FragmentChatBinding


class ChatFragment : Fragment() {
    //????
   private  var chatBinding:FragmentChatBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        //
        container: ViewGroup?,
        //
        savedInstanceState: Bundle?
        //
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentChatBinding.inflate(inflater, container, false)
        chatBinding = binding
        return chatBinding?.root

      }

    override fun onDestroyView() {
        chatBinding = null
        super.onDestroyView()
    }

}
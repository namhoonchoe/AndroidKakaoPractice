package com.example.kakaopr.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kakaopr.databinding.FragmentShopBinding


/**
 * A simple [Fragment] subclass.
 * Use the [ShopFragment.newInstance] factory method to
 * create an instance of this fragment.
 */


class ShopFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private var shopBinding:FragmentShopBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentShopBinding.inflate(inflater, container, false)
        shopBinding  = binding
        return shopBinding?.root
    }

    override fun onDestroyView() {
        shopBinding = null
        super.onDestroyView()
    }
}
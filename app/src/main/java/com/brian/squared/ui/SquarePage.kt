package com.brian.squared.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.brian.squared.R
import com.brian.squared.databinding.FragmentSquarePageBinding

class SquarePage : Fragment() {
    //    private val viewModel: SquareViewModel by viewModels()
    private lateinit var binding: FragmentSquarePageBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_square_page, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var userNumber = binding.textInputEditText.text



        binding.calculateButton.setOnClickListener {
            var uncalculated = userNumber.toString().toInt()
            var calculated = uncalculated * uncalculated
            binding.resultTv.text = calculated.toString()

        }
    }

}
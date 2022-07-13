package com.example.nutritionapp.ui

import com.example.nutritionapp.databinding.FragmentHomeBinding
import com.example.nutritionapp.ui.base.BaseFragment


class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    private val diabeticsScreenFragment = FragmentDiabeticsScreen()
    private val mealsSearchFragment = MealsSearchFragment()
    private val caloriesCounterFragment = CaloriesCounterFragment()

    override fun bindingInflater(): FragmentHomeBinding =
        FragmentHomeBinding.inflate(layoutInflater)

    override fun setUp() {
        buttonCardDiabetics()
        buttonShowAll()
        buttonCaloriesCounter()
    }

    private fun buttonCardDiabetics() {
        binding.cardDiabetics.setOnClickListener {
            navigationTo(diabeticsScreenFragment)
        }
    }

    private fun buttonShowAll() {
        binding.showAll.setOnClickListener {
            navigationTo(mealsSearchFragment)
        }
    }

    private fun buttonCaloriesCounter() {
        binding.caloriesCounter.setOnClickListener {
            navigationTo(caloriesCounterFragment)
        }
    }

}
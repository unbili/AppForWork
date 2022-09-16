package com.example.appforwork

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.appforwork.databinding.FragmentFirstBinding
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        binding.button.setOnClickListener {
            /**
             * Flow基本使用
             */
            runBlocking {
                flow {
                    for(i in 0 until 10){
                        kotlinx.coroutines.delay(100)
                        Log.d("~~~", "(MainActivity.kt:10)")
                        emit("1235")
                    }
                }.onStart {
                    Log.d("~~~", "(MainActivity.kt:10)")
                }.onEach {
                    Log.d("~~~", "(MainActivity.kt:10)")
                }.catch {

                }.onCompletion {
                    Log.d("~~~", "(MainActivity.kt:10)")
                }.collect()
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
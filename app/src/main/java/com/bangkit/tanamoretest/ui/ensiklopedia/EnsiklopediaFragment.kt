package com.bangkit.tanamoretest.ui.ensiklopedia

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bangkit.tanamoretest.databinding.FragmentEnsiklopediaBinding
import com.bangkit.tanamoretest.scanTanaman.ScanTanamanActivity

class EnsiklopediaFragment : Fragment() {

    private lateinit var binding: FragmentEnsiklopediaBinding
    private lateinit var viewModel: EnsiklopediaViewModel
    private lateinit var adapter: EnsiklopediaAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEnsiklopediaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this)[EnsiklopediaViewModel::class.java]

        adapter = EnsiklopediaAdapter { dataItem ->
            val plantId = dataItem.id ?: ""

            if (plantId.isNotEmpty()) {
                viewModel.fetchEnsiklopediaDetail(plantId)
                val intent = Intent(requireContext(), DetailEnsiklopediaActivity::class.java)
                intent.putExtra("DATA_ITEM", dataItem)
                startActivity(intent)
            } else {
                Toast.makeText(requireContext(), "Invalid plant ID", Toast.LENGTH_SHORT).show()
            }
        }

        binding.rvPlantList.adapter = adapter
        binding.rvPlantList.layoutManager = LinearLayoutManager(requireContext())

        viewModel.ensiklopediaState.observe(viewLifecycleOwner) { state ->
            when (state) {
                is EnsiklopediaViewModel.EnsiklopediaState.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                    binding.rvPlantList.visibility = View.GONE
                }

                is EnsiklopediaViewModel.EnsiklopediaState.Success -> {
                    binding.progressBar.visibility = View.GONE
                    binding.rvPlantList.visibility = View.VISIBLE
                    adapter.submitList(state.ensiklopedia)
                }

                is EnsiklopediaViewModel.EnsiklopediaState.Error -> {
                    binding.progressBar.visibility = View.GONE
                    binding.rvPlantList.visibility = View.GONE
                    Toast.makeText(requireContext(), state.message, Toast.LENGTH_SHORT).show()
                }

                null -> {
                    binding.progressBar.visibility = View.GONE
                }
            }
        }

        viewModel.searchResults.observe(viewLifecycleOwner) { response ->
            response?.data?.let {
                adapter.submitList(it)
            } ?: run {
                Toast.makeText(requireContext(), "No results found", Toast.LENGTH_SHORT).show()
            }
        }

        viewModel.fetchEnsiklopedia()

        binding.icCamera.setOnClickListener {
            val intent = Intent(requireContext(), ScanTanamanActivity::class.java)
            startActivity(intent)
        }



        binding.btnSearch.setOnClickListener {
            val query = binding.etSearch.text.toString()
            if (query.isNotEmpty()) {
                viewModel.searchEnsiklopedia(query)
            } else {
                viewModel.fetchEnsiklopedia()
            }
        }
    }
}
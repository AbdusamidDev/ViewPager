package develop.abdusamid.viewpagerframgment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import develop.abdusamid.viewpagerframgment.R
import develop.abdusamid.viewpagerframgment.adapter.RvAdapter
import develop.abdusamid.viewpagerframgment.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var rvAdapter: RvAdapter
    private lateinit var arrayList: ArrayList<String>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        arrayList = ArrayList()
        addString()
        rvAdapter = RvAdapter(requireActivity(), arrayList)
        binding.recyclerViewSecond.adapter = rvAdapter
        // Inflate the layout for this fragment
        return binding.root
    }

    private fun addString() {
        for (i in 0..99) {
            arrayList.add("Second Fragment ${i + 1}")
        }
    }
}
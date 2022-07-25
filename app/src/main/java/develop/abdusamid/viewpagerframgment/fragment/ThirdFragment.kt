package develop.abdusamid.viewpagerframgment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import develop.abdusamid.viewpagerframgment.adapter.RvAdapter
import develop.abdusamid.viewpagerframgment.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private lateinit var arrayList: ArrayList<String>
    private lateinit var adapterRecycler: RvAdapter
    private lateinit var binding: FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        arrayList = ArrayList()
        addString()
        adapterRecycler = RvAdapter(requireActivity(), arrayList)
        binding.recyclerViewThird.adapter = adapterRecycler
        return binding.root
    }

    private fun addString() {
        for (i in 0..99) {
            arrayList.add("Third Fragment ${i + 1}")
        }
    }

}
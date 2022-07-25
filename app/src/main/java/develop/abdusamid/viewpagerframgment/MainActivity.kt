package develop.abdusamid.viewpagerframgment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import develop.abdusamid.viewpagerframgment.adapter.ViewPagerAdapter
import develop.abdusamid.viewpagerframgment.databinding.ActivityMainBinding
import develop.abdusamid.viewpagerframgment.fragment.FirstFragment
import develop.abdusamid.viewpagerframgment.fragment.SecondFragment
import develop.abdusamid.viewpagerframgment.fragment.ThirdFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var arrayList: ArrayList<Fragment>
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        arrayList = ArrayList()
        arrayList.add(FirstFragment())
        arrayList.add(SecondFragment())
        arrayList.add(ThirdFragment())
        viewPagerAdapter = ViewPagerAdapter(arrayList, supportFragmentManager, lifecycle)
        binding.myViewPager2.adapter = viewPagerAdapter
    }
}
package gaur.himanshu.august.viewpager2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import gaur.himanshu.august.viewpager2.adapters.ViewPagerAdapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewpager2= findViewById<ViewPager2>(R.id.view_pager_2)
        val tablayout= findViewById<TabLayout>(R.id.tab_layout)


        viewpager2.adapter=ViewPagerAdapter(this.supportFragmentManager,lifecycle)
        TabLayoutMediator(tablayout,viewpager2){tab,position->

            when(position){
                0->{
                    tab.text="First"
                }
                1->{
                    tab.text="Second"
                }
                2->{
                    tab.text="Third"
                }
            }

        }.attach()


    }
}
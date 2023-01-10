package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.whatsapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tablayout.addTab(binding.tablayout.newTab().setText("Chats"))
        binding.tablayout.addTab(binding.tablayout.newTab().setText("Status"))
        binding.tablayout.addTab(binding.tablayout.newTab().setText("Calls"))

        binding.dotbutton.setOnClickListener {
            //  val popupMenu : PopupMenu = PopupMenu(this,)
            val popupMenu: PopupMenu = PopupMenu(this@MainActivity,binding.dotbutton)
            popupMenu.menuInflater.inflate(R.menu.menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.new_group ->
                        Toast.makeText(this@MainActivity, "New group " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.new_Boardcast ->
                        Toast.makeText(this@MainActivity, "New Boardcast  " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.linked_devices ->
                        Toast.makeText(this@MainActivity, "Linked devices  " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.starred_messages ->
                        Toast.makeText(this@MainActivity, "Starred messages" + item.title, Toast.LENGTH_SHORT).show()
                    R.id.Payments ->
                        Toast.makeText(this@MainActivity, "Payments" + item.title, Toast.LENGTH_SHORT).show()
                    R.id.privacy_policy ->
                        Toast.makeText(this@MainActivity, "Privacy Policy" + item.title, Toast.LENGTH_SHORT).show()
                }
                true
            })
            popupMenu.show()
        }
    }

}

private fun TabLayout.setupWithViewPager(mainpager: ViewPager2) {
    TODO("Not yet implemented")

}
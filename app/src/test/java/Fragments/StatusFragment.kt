package Fragments

import Modelclass.StatusModelclass
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp.R
import com.example.whatsapp.databinding.FragmentStatusBinding

class StatusFragment : Fragment() {
    // TODO: Rename and change types of parameters
    var listst = ArrayList<StatusModelclass>()
    var namest = arrayOf("Shreya","Trusha","Janvi","Monali","Shreya","Trusha","Janvi","Monali","Shreya","Trusha","Janvi","Monali")
    var imgst = arrayOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var   binding = FragmentStatusBinding.inflate(layoutInflater)

        for (x in 0 ..imgst.size-1 )
        {
            var stdata = StatusModelclass(namest.get(x),imgst.get(x))
            listst.add(stdata)
        }

        binding.statusrecycleview.layoutManager = LinearLayoutManager(context)
        binding.statusrecycleview.adapter= Adapter.StatusAdapter(listst)

        return binding.root
    }

}
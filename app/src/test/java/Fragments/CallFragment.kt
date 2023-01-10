package Fragments

import Modelclass.CallModelclass
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp.R
import com.example.whatsapp.databinding.FragmentCallBinding

class CallFragment : Fragment() {
    // TODO: Rename and change types of parameters
    var list1 = ArrayList<CallModelclass>()
    var name = arrayOf("Shreya","Trusha","Janvi","Monali")
    var img = arrayOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentCallBinding.inflate(layoutInflater)

        for (x in 0 ..img.size-1 )
        {
            var caldata = CallModelclass(name.get(x),img.get(x))
            list1.add(caldata)
        }

        binding.callrecyclview.layoutManager = LinearLayoutManager(context)
        binding.callrecyclview.adapter = Adapter.CallAdapter(list1)

        return  binding.root
    }

}
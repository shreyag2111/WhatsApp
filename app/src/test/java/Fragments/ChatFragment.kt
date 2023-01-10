package Fragments

import Modelclass.ChatModelclass
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp.R
import com.example.whatsapp.databinding.FragmentChatBinding

class ChatFragment : Fragment() {
    // TODO: Rename and change types of parameters

    var list = ArrayList<ChatModelclass>()
    var names1 = arrayOf(
        "Shreya",
        "Trusha",
        "Janvi",
        "Monali",
        "Shreya",
        "Trusha",
        "Janvi",
        "Monali",
        "Shreya",
        "Trusha",
        "Janvi",
        "Monali",
        "Shreya",
        "Trusha"
    )
    var imgs = arrayOf(
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
        R.drawable.img6,
        R.drawable.img1
    )
    var dates = arrayOf(
        "Today",
        "1/7/22",
        "28/6/22",
        "28/6/22",
        "27/6/22",
        "28/5/22",
        "2/5/22",
        "20/5/22",
        "28/4/22",
        "23/3/22",
        "12/3/22",
        "28/9/21",
        "21/7/21",
        "14/3/21"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentChatBinding.inflate(layoutInflater)
        for (x in 0..imgs.size - 1) {
            var data = ChatModelclass(names1.get(x), dates.get(x), imgs.get(x))
            list.add(data)
        }

        binding.chatrecycleview.layoutManager = LinearLayoutManager(context)
        binding.chatrecycleview.adapter = Adapter.ChatAdapter(list)
        return binding.root
    }

}
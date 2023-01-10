package Adapter

import Modelclass.ChatModelclass
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.R
import de.hdodenhof.circleimageview.CircleImageView

class ChatAdapter (names: ArrayList<ChatModelclass>) : RecyclerView. Adapter<ChatAdapter.ChatHolder>() {

    var names = names

    class  ChatHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var nameid = itemView.findViewById<TextView>(R.id.namesid)
        var profile = itemView.findViewById<CircleImageView>(R.id.profile)
        var dates = itemView.findViewById<TextView>(R.id.dates)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHolder {
        return ChatHolder(LayoutInflater.from(parent.context).inflate(R.layout.chat_view,parent,false))
    }

    override fun onBindViewHolder(holder: ChatHolder, position: Int) {
        holder.nameid.text = names.get(position).name1
        holder.dates.text = names.get(position).dates
        holder.profile.setImageResource(names.get(position).imgs)
    }

    override fun getItemCount(): Int {
        return  names.size
    }


}
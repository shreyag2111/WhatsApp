package Adapter

import Modelclass.CallModelclass
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.R
import de.hdodenhof.circleimageview.CircleImageView

class CallAdapter(name: ArrayList<CallModelclass>) : RecyclerView.Adapter<CallAdapter.CallHolder>(){

    var name = name
    lateinit var context: Context
    class CallHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var name = itemView.findViewById<TextView>(R.id.name)
        var profile = itemView.findViewById<CircleImageView>(R.id.profile)
        var call = itemView.findViewById<CircleImageView>(R.id.call)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallHolder {

        context = parent.context
        return CallHolder(LayoutInflater.from(parent.context).inflate(R.layout.call_view,parent,false))
    }

    override fun onBindViewHolder(holder: CallHolder, position: Int) {
        holder.name.text = name.get(position).name
        holder.profile.setImageResource(name.get(position).img)
        holder.call.setOnClickListener {

            val intent = Intent (Intent.ACTION_CALL)
            intent.setData(Uri.parse("tel:"+"9876543210"))
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return name.size
    }
}
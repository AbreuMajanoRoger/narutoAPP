package com.example.narutoapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.narutoapp.Narutocharacters
import com.example.narutoapp.databinding.ItemNarutoBinding
import com.squareup.picasso.Picasso


class NarutoAdapter (private var dataSet: List<Narutocharacters> = emptyList(),
                     private val onItemClickListener: (Int) -> Unit
) : RecyclerView.Adapter<NarutoViewHolder>(){




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NarutoViewHolder {

        val binding = ItemNarutoBinding.inflate(LayoutInflater.from(parent.context))
        return NarutoViewHolder(binding)

    }

    override fun onBindViewHolder(holder: NarutoViewHolder, position: Int) {
        holder.render(dataSet[position])
        holder.itemView.setOnClickListener {
            onItemClickListener(position)
        }
    }

    override fun getItemCount(): Int = dataSet.size

    fun updateData(dataSet: List<Narutocharacters>) {
        this.dataSet = dataSet
        notifyDataSetChanged()
    }



}
class NarutoViewHolder(private val binding: ItemNarutoBinding) : RecyclerView.ViewHolder(binding.root) {

    fun render(narutoCharacters: Narutocharacters) {
        binding.txtViewName.text = narutoCharacters.name
        Picasso.get().load(narutoCharacters.image.url).into(binding.imCharacters)
    }


}



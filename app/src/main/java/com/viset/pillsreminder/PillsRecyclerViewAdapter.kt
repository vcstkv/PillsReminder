package com.viset.pillsreminder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.viset.pillsreminder.data.Pill

class PillsRecyclerViewAdapter(private val dataSet: Array<Pill>) :
        RecyclerView.Adapter<PillsRecyclerViewAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val header: TextView = view.findViewById(R.id.header_text)
        val description: TextView = view.findViewById(R.id.description)
        val img: ImageView = view.findViewById(R.id.imageView)

        fun bind(pill: Pill) {
            header.text = pill.name
            description.text = pill.description
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.pill_item_view, viewGroup, false)
        view.setOnClickListener { view.findNavController().navigate(R.id.action_pills_fragment_to_edit_pill_fragment) }
        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        val pill = dataSet[position]
        viewHolder.bind(pill)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}

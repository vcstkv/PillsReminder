package com.viset.pillsreminder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.viset.pillsreminder.data.Pill

/**
 * A simple [Fragment] subclass.
 * Use the [PillListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PillListFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pill_list, container, false)
        // Inflate the layout for this fragment
        val pills = arrayOf(Pill("test", "desc"),
                Pill("test2", "desc2"),
                Pill("test3", "desc3"),
                Pill("test4", "desc4"),
                Pill("test5", "desc5"),
                Pill("test6", "desc6"),
                Pill("test7", "desc7"))
        var recyclerView: RecyclerView = view.findViewById(R.id.pill_list)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = PillsRecyclerViewAdapter(pills)
        recyclerView.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        return view
    }
}

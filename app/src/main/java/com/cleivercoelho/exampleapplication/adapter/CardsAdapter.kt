package com.cleivercoelho.exampleapplication.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cleivercoelho.exampleapplication.view.ExampleXMLCardView

// RecyclerView Adapter to manage cards
class CardsAdapter(
    private val context: Context,
    private val cardsData: List<String> // Replace with your actual data type
) : RecyclerView.Adapter<CardsAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        // Create an instance of ExampleXMLCardView
        val cardView = ExampleXMLCardView(context, cardsData)
        return CardViewHolder(cardView)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        // Bind data to the view if needed
        // Example: holder.bind(cardsData[position])
    }

    override fun getItemCount(): Int = cardsData.size

    // Updated ViewHolder class
    class CardViewHolder(val view: ExampleXMLCardView) : RecyclerView.ViewHolder(view)
}


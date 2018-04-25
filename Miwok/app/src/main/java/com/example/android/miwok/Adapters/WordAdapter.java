package com.example.android.miwok.Adapters;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.Entries.Word;
import com.example.android.miwok.R;

import java.util.List;

/**
 * Created by HSANHUES on 3/18/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int backgroundColor;

    public WordAdapter(Context context, List<Word> words, int backgroundColor) {
        super(context, 0, words);
        this.backgroundColor = backgroundColor;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word currentWord = getItem(position);

        View listItemView = convertView;
        if(listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        TextView miWokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miWokTextView.setText(currentWord.getmMiWokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.icon_image_view);
        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageId());
            //Make sure the Image is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else
            imageView.setVisibility(View.GONE);


        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), backgroundColor);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutte", "واحد", R.drawable.number_one));
        words.add(new Word("two","otiiko", "إثنان", R.drawable.number_two));
        words.add(new Word("three","tolookosu", "ثلاث", R.drawable.number_three));
        words.add(new Word("four","oyyisa", "أربعة", R.drawable.number_four));
        words.add(new Word("five","massokka", "خمسة", R.drawable.number_five));
        words.add(new Word("six","temmokka", "ستة", R.drawable.number_six));
        words.add(new Word("seven","kenekaku", "سبعة", R.drawable.number_seven));
        words.add(new Word("eight","kawinta", "ثمانية", R.drawable.number_eight));
        words.add(new Word("nine","wo'e", "تسعة", R.drawable.number_nine));
        words.add(new Word("ten","na'aacha", "عشرة", R.drawable.number_ten));



        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
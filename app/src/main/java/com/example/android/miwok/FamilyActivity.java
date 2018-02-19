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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father","әpә", "أب", R.drawable.family_father));
        words.add(new Word("mother","әṭa", "أم", R.drawable.family_mother));
        words.add(new Word("son","angsi", "إبن", R.drawable.family_son));
        words.add(new Word("daughter","tune", "بنت", R.drawable.family_daughter));
        words.add(new Word("older brother","taachi", "الأخ الأكبر", R.drawable.family_older_brother));
        words.add(new Word("younger brother","chalitti", "الأخ الأصغر", R.drawable.family_younger_brother));
        words.add(new Word("older sister","teṭe", "الأخت الكبرى", R.drawable.family_older_sister));
        words.add(new Word("younger sister","kolliti", "الأخت الصغرى", R.drawable.family_younger_sister));
        words.add(new Word("grandmother","ama", "جدة", R.drawable.family_grandmother));
        words.add(new Word("grandfather","paapa", "جد", R.drawable.family_grandfather));



        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}

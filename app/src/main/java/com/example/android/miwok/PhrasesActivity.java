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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "إلى أين تذهب؟","minto wuksus?"));
        words.add(new Word("What is your name?","ما إسمك؟" ,"tinnә oyaase'nә?"));
        words.add(new Word("My name is...","إسمي...","oyaaset..."));
        words.add(new Word("How are you feeling?", "كيف هو شعورك؟","michәksәs?"));
        words.add(new Word("I’m feeling good.", "أشعر بخير.","kuchi achit"));
        words.add(new Word("Are you coming?", "أأنت آت؟","әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "نعم، إني آتٍ.","hәә’ әәnәm"));
        words.add(new Word("I’m coming.","إني آتٍ.","әәnәm"));
        words.add(new Word("Let’s go.","هيا نذهب","yoowutis"));
        words.add(new Word("Come here.","تعال هنا.","әnni'nem"));



        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}

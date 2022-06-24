package com.whynot.wmvvmdb.domain;

import androidx.lifecycle.LiveData;

import com.whynot.wmvvmdb.data.room.Word;

import java.util.List;

public interface WordRepository {

    LiveData<List<Word>> getAllWords();

    void insert(Word word);

    void deleteAll();
}
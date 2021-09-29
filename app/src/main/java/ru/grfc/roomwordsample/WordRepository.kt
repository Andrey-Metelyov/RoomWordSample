package ru.grfc.roomwordsample

import androidx.annotation.WorkerThread

class WordRepository(private val wordDao: WordDao) {
    val allWords = wordDao.getAlphabetizedWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}
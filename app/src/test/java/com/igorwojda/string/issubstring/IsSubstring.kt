package com.igorwojda.string.issubstring

import org.amshove.kluent.shouldEqual
import org.junit.Test

fun isSubstring(first:String, second:String): Boolean {
    return false
}

class PuzzleTest {
    @Test
    fun `first empty and second empty should return true`() {
        isSubstring("", "") shouldEqual true
    }

    @Test
    fun `first empty and second 'a' should return false`() {
        isSubstring("", "a") shouldEqual false
    }

    @Test
    fun `first 'go home' and second 'ome' should return true`() {
        isSubstring("go home", "ome") shouldEqual true
    }

    @Test
    fun `first '"Redactor"' and second 'Red' should return true`() {
        isSubstring("Redactor", "Red") shouldEqual true
    }

    @Test
    fun `first 'Here you are' and second 'you' should return true`() {
        isSubstring("Here you are", "you") shouldEqual true
    }

    @Test
    fun `first 'and everything' and second 'nothing' should return false`() {
        isSubstring("and everything", "nothing") shouldEqual false
    }
}

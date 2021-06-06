package com.example.unit_test_android

import java.util.regex.Pattern

class Validator {

    companion object {

        fun email(value: String): Boolean {
            return android.util.Patterns.EMAIL_ADDRESS
                .matcher(value)
                .matches()
        }

        fun password(value: String): Boolean {
            return Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$%!\\-_?&])(?=\\S+\$).{8,}")
                .matcher(value)
                .matches()
        }

    }

}
package com.example.unit_test_android

import org.junit.Test

class ValidatorTest {

    @Test
    fun when_email_is_valid() {
        assert(Validator.email("kagn.521@gmail.com"))
    }

    @Test
    fun when_email_is_invalid() {
        assert(!Validator.email("kagn.com"))
    }

    @Test
    fun when_password_is_valid() {
        assert(Validator.password("#b6e&kPu"))
    }

    @Test
    fun when_password_is_invalid() {
        assert(!Validator.password("admin"))
    }

}
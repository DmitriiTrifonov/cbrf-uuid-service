package com.mitya1234.uuid

import com.mitya1234.uuid.service.UuidServiceImpl
import org.junit.Test


class UuidServiceTest {

    @Test
    fun test01() {
        val service = UuidServiceImpl()
        println(service.getUuid())
    }

    @Test
    fun test02() {
        val service = UuidServiceImpl()
        println(service.generate(100))
    }

    @Test
    fun test03() {
        val service = UuidServiceImpl()
        println(service.generate(1))
    }


}
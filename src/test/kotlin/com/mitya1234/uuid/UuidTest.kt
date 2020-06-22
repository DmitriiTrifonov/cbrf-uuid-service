package com.mitya1234.uuid

import com.mitya1234.uuid.service.UuidServiceImpl
import org.junit.Test

class UuidTest {
    @Test
    fun uniqueGeneration() {
        val service = UuidServiceImpl()
        val generated = service.generate(10_000_000)
        val set = generated.value.toSet()
        assert(set.count() == generated.value.count())
    }

    @Test
    fun uniqueGenerationAnother() {
        val service = UuidServiceImpl()
        val generated = service.generate(1_000_000)
        val set = generated.value.toSet()
        assert(set.count() == generated.value.count())
    }
}


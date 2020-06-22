package com.mitya1234.uuid.service

import com.fasterxml.uuid.Generators
import com.mitya1234.uuid.common.getFull
import com.mitya1234.uuid.model.UuidList
import kotlin.collections.ArrayList

class UuidServiceImpl : UuidService {
    fun getUuid(): String = with(Generators.timeBasedGenerator().generate()) {
        getFull(this)
    }

    override fun generate(number: Int): UuidList {
        val result = ArrayList<String>()
        for (i in 0..number){
            result.add(getUuid())
        }
        return UuidList(result)
    }
}
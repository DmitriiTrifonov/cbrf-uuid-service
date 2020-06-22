package com.mitya1234.uuid.service

import com.mitya1234.uuid.model.UuidList

interface UuidService {
    fun generate(number: Int): UuidList
}
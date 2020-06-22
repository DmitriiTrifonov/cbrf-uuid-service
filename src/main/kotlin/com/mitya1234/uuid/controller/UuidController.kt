package com.mitya1234.uuid.controller

import com.mitya1234.uuid.model.UuidList
import com.mitya1234.uuid.service.UuidService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.Max
import javax.validation.constraints.Min

@RestController
@RequestMapping("/uuid")
@Validated
open class UuidController(val uuidService: UuidService) {

    @GetMapping
    open fun uuid(@RequestParam @Min(value = 0, message = "Minimum number is 0") @Max(value = 50_000, message = "Maximum number is 50_000") number: Int?): UuidList {
        val correctNumber = number ?: 0
        return uuidService.generate(correctNumber)
    }
}

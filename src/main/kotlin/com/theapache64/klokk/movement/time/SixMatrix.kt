package com.theapache64.klokk.movement.time

import com.theapache64.klokk.model.ClockData

object SixMatrix : DigitMatrix() {

    override fun getRow1(): List<ClockData?> {
        return listOf(
            clockDataRightAngledBottomRight(),
            clockDataHorizontal(),
            clockDataRightAngledBottomLeft(),
        )
    }

    override fun getRow2(): List<ClockData?> {
        return listOf(
            clockDataVertical(),
            clockDataRightAngledBottomRight(),
            clockDataRightAngledTopLeft()
        )
    }

    override fun getRow3(): List<ClockData?> {
        return listOf(
            clockDataVertical(),
            clockDataRightAngledTopRight(),
            clockDataRightAngledBottomLeft()
        )
    }

    override fun getRow4(): List<ClockData?> {
        return listOf(
            clockDataVertical(),
            clockDataVerticalBottomHalf(),
            clockDataVertical()
        )
    }

    override fun getRow5(): List<ClockData?> {
        return listOf(
            clockDataVertical(),
            clockDataVerticalTopHalf(),
            clockDataVertical()
        )
    }

    override fun getRow6(): List<ClockData?> {
        return listOf(
            clockDataRightAngledTopRight(),
            clockDataHorizontal(),
            clockDataRightAngledTopLeft()
        )
    }
}
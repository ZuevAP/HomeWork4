package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun moneyTransferCommissionVK() {

        val money = 1_000_000_00
        val card = VK_PAY
        val amount = 0

        val result =
            moneyTransferCommission(moneyTransfer = money, typeCard = card, transferAmounts = amount)

        assertEquals(1, result)
    }

    @Test
    fun moneyTransferCommissionMASTERCARD() {

        val money = 1_000_000_00
        val card = MASTERCARD
        val amount = 0


        val result =
            moneyTransferCommission(moneyTransfer = money, typeCard = card, transferAmounts = amount)

        assertEquals(6002000, result)

    }

    @Test
    fun moneyTransferCommissionMASTERCARD2() {

        val money = 1_000_00
        val card = MASTERCARD
        val amount = 75_000_10


        val result =
            moneyTransferCommission(moneyTransfer = money, typeCard = card, transferAmounts = amount)

        assertEquals(8000, result)

    }


    @Test
    fun moneyTransferCommissionMAESTRO() {

        val money = 74_999_00
        val card = MAESTRO
        val amount = 0

        val result =
            moneyTransferCommission(moneyTransfer = money, typeCard = card, transferAmounts = amount)

        assertEquals(0, result)

    }

    @Test
    fun moneyTransferCommissionVISA() {

        val money = 1_000_00
        val card = VISA
        val amount = 0

        val result =
            moneyTransferCommission(moneyTransfer = money, typeCard = card, transferAmounts = amount)

        assertEquals(7500, result)

    }

    @Test
    fun moneyTransferCommissionMIR() {

        val money = 74_999_00
        val card = MIR
        val amount = 0

        val result =
            moneyTransferCommission(moneyTransfer = money, typeCard = card, transferAmounts = amount)

        assertEquals(562425, result)

    }

    @Test
    fun moneyTransferCommissionVISA2() {

        val money = 100_00
        val card = VISA
        val amount = 0

        val result =
            moneyTransferCommission(moneyTransfer = money, typeCard = card, transferAmounts = amount)

        assertEquals(3500, result)

    }
}
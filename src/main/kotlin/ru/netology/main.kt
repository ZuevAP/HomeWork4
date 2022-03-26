
package ru.netology

const val VK_PAY = "Vk Pay"
const val MASTERCARD = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "Мир"



fun moneyTransferCommission(moneyTransfer: Int, typeCard: String, transferAmounts: Int): Int {



   val commission = when (typeCard) {

        VK_PAY -> 0

        MASTERCARD, MAESTRO -> if (moneyTransfer < 75_000_00 && transferAmounts < 75_000_00) {
            0
        }
        else {
            (moneyTransfer / 100) * 6 + 2000
        }

        VISA, MIR -> if (((moneyTransfer / 1000) * 75) > 3500) {
            (moneyTransfer / 1000) * 75
        }
        else {
            3500
        }

        else -> {
            error("Не читаемая карта")
        }
    }
    return commission

}

fun main() {


moneyTransferCommission(1_000_000000, VK_PAY,0)


}





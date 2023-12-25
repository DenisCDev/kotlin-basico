package XIIOrientacaoObjetos

class DatabaseConstants private constructor() {
    companion object GUEST {
        val TABLE_NAME = "Invited"

        object COLUMNS {
            val id = "id"
        }
    }

    object SELL {
        object COLUMNS {
            val total = "total"
        }
    }
}

fun main() {
    DatabaseConstants.GUEST.TABLE_NAME
    DatabaseConstants.GUEST.COLUMNS.id
    DatabaseConstants.SELL.COLUMNS.total
}
package com.ekyrizky.contacts.core.data

import com.ekyrizky.contacts.database.ContactDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {
    actual fun create(): SqlDriver {
        return NativeSqliteDriver(ContactDatabase.Schema, "contact.db")
    }
}
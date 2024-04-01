package com.ekyrizky.contacts.di

import com.ekyrizky.contacts.contacts.data.SqlContactDataSource
import com.ekyrizky.contacts.contacts.domain.ContactDataSource
import com.ekyrizky.contacts.core.data.DatabaseDriverFactory
import com.ekyrizky.contacts.core.data.ImageStorage
import com.ekyrizky.contacts.database.ContactDatabase

actual class AppModule {

    actual val contactDataSource: ContactDataSource by lazy {
        SqlContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory().create()
            ),
            imageStorage = ImageStorage()
        )
    }
}
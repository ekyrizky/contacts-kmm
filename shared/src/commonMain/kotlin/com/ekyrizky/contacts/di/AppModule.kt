package com.ekyrizky.contacts.di

import com.ekyrizky.contacts.contacts.domain.ContactDataSource

expect class AppModule {
    val contactDataSource: ContactDataSource
}
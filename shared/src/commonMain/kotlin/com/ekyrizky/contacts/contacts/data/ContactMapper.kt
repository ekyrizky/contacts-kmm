package com.ekyrizky.contacts.contacts.data

import com.ekyrizky.contacts.contacts.domain.Contact
import com.ekyrizky.contacts.core.data.ImageStorage
import database.ContactEntity

suspend fun ContactEntity.toContact(imageStorage: ImageStorage): Contact {
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = imagePath?.let { imageStorage.getImage(it) }
    )
}
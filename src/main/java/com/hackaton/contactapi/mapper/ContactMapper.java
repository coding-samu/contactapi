package com.hackaton.contactapi.mapper;

import com.hackaton.contactapi.domain.Contact;
import com.hackaton.contactapi.dto.ContactDto;

public class ContactMapper {
    public static ContactDto toDto(Contact contact) {
        return new ContactDto(
                contact.getId(),
                contact.getName(),
                contact.getEmail(),
                contact.getTitle(),
                contact.getPhone(),
                contact.getAddress(),
                contact.getStatus(),
                contact.getPhotoUrl()
        );
    }

    public static Contact toEntity(ContactDto contactDto) {
        return new Contact(
                contactDto.getId(),
                contactDto.getName(),
                contactDto.getEmail(),
                contactDto.getTitle(),
                contactDto.getPhone(),
                contactDto.getAddress(),
                contactDto.getStatus(),
                contactDto.getPhotoUrl()
        );
    }
}
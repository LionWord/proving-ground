package com.lionword.later.item;

public class ItemDtoMapper {
    static ItemDto itemToDto(Item item) {
        return ItemDto.builder()
                .id(item.getId())
                .url(item.getUrl())
                .tags(item.getTags())
                .build();
    }
}

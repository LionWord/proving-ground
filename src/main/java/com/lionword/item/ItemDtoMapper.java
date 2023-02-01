package com.lionword.item;

public class ItemDtoMapper {
    static ItemDto itemToDto (Item item) {
        return ItemDto.builder()
                .id(item.getId())
                .url(item.getUrl())
                .tags(item.getTags())
                .build();
    }
}

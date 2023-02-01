package com.lionword.item;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ItemServiceImpl {

    private final ItemRepository repository;

    List<ItemDto> getItems(Long userId) {
        return repository.findAllByUserIdOrderByIdDesc(userId).stream()
                .map(ItemDtoMapper::itemToDto)
                .collect(Collectors.toList());
    }
    ItemDto addNewItem(Long userId, Item item) {
        item.setUserId(userId);
        return ItemDtoMapper.itemToDto(repository.save(item));
    }
    void deleteItem(Long userId, Long itemId) {
        repository.deleteById(itemId);
    };
}

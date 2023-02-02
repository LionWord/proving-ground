package com.lionword.later.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository repository;

    @Override
    public List<ItemDto> getItems(Long userId) {
        return repository.findAllByUserIdOrderByIdDesc(userId).stream()
                .map(ItemDtoMapper::itemToDto)
                .collect(Collectors.toList());
    }

    @Override
    public ItemDto addNewItem(Long userId, Item item) {
        item.setUserId(userId);
        return ItemDtoMapper.itemToDto(repository.save(item));
    }

    @Override
    public void deleteItem(Long userId, Long itemId) {
        repository.deleteById(itemId);
    }

}

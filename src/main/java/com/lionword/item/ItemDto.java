package com.lionword.item;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder(access = AccessLevel.PUBLIC)
public class ItemDto {
    private Long id;
    private String url;
    private Set<String> tags;
}

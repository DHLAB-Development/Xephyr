package com.aeonicdev.xephyr.bukkit.builder.item;

import org.bukkit.inventory.meta.ItemMeta;

/**
 * Modifies metadata for ItemStacks on the fly.
 *
 * @author sc4re
 */
public interface MetaTransformer {

    /**
     * Transforms and modifies metadata for items on the fly, can be used by ItemStackBuilders to build
     * dynamic metadata. If the metadata is not the correct type, an exception should be thrown.
     *
     * @param meta The metadata to modify.
     * @return The modified metadata.
     */
    public ItemMeta transform(ItemMeta meta);

}

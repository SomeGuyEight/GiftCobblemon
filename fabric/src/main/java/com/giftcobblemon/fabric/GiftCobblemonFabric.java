package com.giftcobblemon.fabric;

import com.giftcobblemon.common.GiftCobblemon;
import net.fabricmc.api.ModInitializer;

public class GiftCobblemonFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        GiftCobblemon.init();
    }
}
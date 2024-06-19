package com.giftcobblemon.forge;

import dev.architectury.platform.forge.EventBuses;
import com.giftcobblemon.common.GiftCobblemon;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@SuppressWarnings("unused")
@Mod(GiftCobblemon.MOD_ID)
public class GiftCobblemonForge
{
    public GiftCobblemonForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(GiftCobblemon.MOD_ID,FMLJavaModLoadingContext.get().getModEventBus());
        GiftCobblemon.init();
    }
}
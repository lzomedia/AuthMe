package me.axieum.mcmod.authme.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.realms.gui.screen.RealmsMainScreen;

@Mixin(RealmsMainScreen.class)
public interface RealmsMainScreenAccess
{
    @Accessor
    @Mutable
    static void setCheckedClientCompatibility(boolean checked) {}

    @Accessor
    @Mutable
    static void setRealmsGenericErrorScreen(Screen screen) {}
}

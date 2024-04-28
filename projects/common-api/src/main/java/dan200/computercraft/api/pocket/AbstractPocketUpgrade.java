// SPDX-FileCopyrightText: 2018 The CC: Tweaked Developers
//
// SPDX-License-Identifier: MPL-2.0

package dan200.computercraft.api.pocket;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;


/**
 * A base class for {@link IPocketUpgrade}s.
 * <p>
 * One does not have to use this, but it does provide a convenient template.
 */
public abstract class AbstractPocketUpgrade implements IPocketUpgrade {
    private final Component adjective;
    private final ItemStack stack;

    protected AbstractPocketUpgrade(Component adjective, ItemStack stack) {
        this.adjective = adjective;
        this.stack = stack;
    }

    protected AbstractPocketUpgrade(String adjective, ItemStack stack) {
        this(Component.translatable(adjective), stack);
    }

    @Override
    public final Component getAdjective() {
        return adjective;
    }

    @Override
    public final ItemStack getCraftingItem() {
        return stack;
    }
}

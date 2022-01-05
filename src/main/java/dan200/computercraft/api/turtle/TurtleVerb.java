/*
 * This file is part of the public ComputerCraft API - http://www.computercraft.info
 * Copyright Daniel Ratcliffe, 2011-2022. This API may be redistributed unmodified and in full only.
 * For help using the API, and posting your mods, visit the forums at computercraft.info.
 */
package dan200.computercraft.api.turtle;

/**
 * An enum representing the different actions that an {@link ITurtleUpgrade} of type Tool may be called on to perform by a turtle.
 *
 * @see ITurtleUpgrade#getType()
 * @see ITurtleUpgrade#useTool(ITurtleAccess, TurtleSide, TurtleVerb, Direction)
 */
public enum TurtleVerb
{
    /**
     * The turtle called {@code turtle.dig()}, {@code turtle.digUp()} or {@code turtle.digDown()}.
     */
    DIG,

    /**
     * The turtle called {@code turtle.attack()}, {@code turtle.attackUp()} or {@code turtle.attackDown()}.
     */
    ATTACK,
}

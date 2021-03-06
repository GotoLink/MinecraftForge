/*
 * Minecraft Forge
 * Copyright (c) 2016-2019.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.client.event;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.ISuggestionProvider;
import net.minecraftforge.eventbus.api.Event;

/**
 * Fired when client {@link CommandDispatcher} has all of its commands synced from the server
 */
public class CommandRegistryEvent extends Event
{

    private final CommandDispatcher<ISuggestionProvider> dispatcher;

    public CommandRegistryEvent(CommandDispatcher<ISuggestionProvider> dispatcher)
    {
        this.dispatcher = dispatcher;
    }

    /**
     * @return The newly-updated command dispatcher that now contains all the commands that were just received.
     */
    public CommandDispatcher<ISuggestionProvider> getDispatcher()
    {
        return dispatcher;
    }
}

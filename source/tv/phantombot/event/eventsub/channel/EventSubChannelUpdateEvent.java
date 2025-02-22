/*
 * Copyright (C) 2016-2023 phantombot.github.io/PhantomBot
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tv.phantombot.event.eventsub.channel;

import com.gmt2001.eventsub.subscriptions.channel.ChannelUpdate;

/**
 * The channel.update subscription type sends notifications when a broadcaster updates the category, title, mature flag, or broadcast language for
 * their channel
 *
 * @author gmt2001
 */
public class EventSubChannelUpdateEvent extends EventSubChannelEvent {

    private final ChannelUpdate event;

    public EventSubChannelUpdateEvent(ChannelUpdate event) {
        super();
        this.event = event;
    }

    /**
     * Returns a {@link ChannelUpdate} object which indicates the latest channel parameters
     *
     * @return
     */
    public ChannelUpdate getEvent() {
        return this.event;
    }
}

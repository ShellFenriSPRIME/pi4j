package com.pi4j.component.relay;

/*
 * #%L
 * **********************************************************************
 * ORGANIZATION  :  Pi4J
 * PROJECT       :  Pi4J :: Device Abstractions
 * FILENAME      :  RelayStateChangeEvent.java
 *
 * This file is part of the Pi4J project. More information about
 * this project can be found here:  https://www.pi4j.com/
 * **********************************************************************
 * %%
 * Copyright (C) 2012 - 2021 Pi4J
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */


import java.util.EventObject;

public class RelayStateChangeEvent extends EventObject {

    private static final long serialVersionUID = 482071067043836024L;
    protected final RelayState oldState;
    protected final RelayState newState;

    public RelayStateChangeEvent(Relay relay, RelayState oldState, RelayState newState) {
        super(relay);
        this.oldState = oldState;
        this.newState = newState;
    }

    public Relay getRelay() {
        return (Relay)getSource();
    }

    public RelayState getOldState() {
        return oldState;
    }

    public RelayState getNewState() {
        return newState;
    }
}

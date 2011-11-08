/*
 * MainFrameAdapter.java
 * @author Adrian Bingener
 *
 * Copyright (C) 2011 Adrian Bingener
 *
 *-----------------------------------------------------------------------
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU Library General Public License as published
 *   by the Free Software Foundation; either version 2 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Library General Public License for more details.
 *
 *   You should have received a copy of the GNU Library General Public
 *   License along with this program; if not, write to the Free Software
 *   Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *----------------------------------------------------------------------
 */
package jcalc.adapter;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import jcalc.manager.ManagerFrameMain;
import jcalc.view.FrameMain;

/**
 * An Instance of this creates an WindowAdapter for the MainFrame, to catch the windowClosing event.
 * @author Frank Merten; Adrian Bingener
 */
public class MainFrameAdapter extends WindowAdapter {

    private FrameMain frameMain;

    /**
     * Constuctor
     * @param frameMain an instance of the Main JFrame.
     */
    public MainFrameAdapter(FrameMain frameMain) {
        this.frameMain = frameMain;
    }

    /**
     * Catches the WindowClosing event
     * @param windowEvent The WindowEvent that was fired.
     */
    @Override
    public void windowClosing(WindowEvent windowEvent) {
        if (windowEvent.getSource() == frameMain) {
            ManagerFrameMain.getManager(frameMain).windowClosed(frameMain.getLocation().x, frameMain.getLocation().y);
        }
    }
}

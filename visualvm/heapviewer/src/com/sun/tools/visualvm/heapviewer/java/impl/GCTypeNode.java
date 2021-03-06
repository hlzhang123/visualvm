/*
 * Copyright (c) 2017, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.sun.tools.visualvm.heapviewer.java.impl;

import java.awt.Font;
import org.netbeans.lib.profiler.ui.swing.renderer.LabelRenderer;
import org.netbeans.modules.profiler.api.icons.Icons;
import org.netbeans.modules.profiler.api.icons.ProfilerIcons;
import com.sun.tools.visualvm.heapviewer.java.InstancesContainer;
import com.sun.tools.visualvm.heapviewer.model.DataType;
import com.sun.tools.visualvm.heapviewer.ui.HeapViewerRenderer;

/**
 *
 * @author Jiri Sedlacek
 */
class GCTypeNode extends InstancesContainer.Objects {
    
    GCTypeNode(String name) {
        super(name, DataType.CLASS.getUnsupportedValue());
    }
    
    
    protected String getMoreNodesString(String moreNodesCount)  {
        return "<another " + moreNodesCount + " GC roots left>";
    }
    
    protected String getSamplesContainerString(String objectsCount)  {
        return "<sample " + objectsCount + " GC roots>";
    }
    
    protected String getNodesContainerString(String firstNodeIdx, String lastNodeIdx)  {
        return "<GC roots " + firstNodeIdx + "-" + lastNodeIdx + ">";
    }
    
    
    static class Renderer extends LabelRenderer implements HeapViewerRenderer {
        
        Renderer() {
            setIcon(Icons.getIcon(ProfilerIcons.RUN_GC));
            setFont(getFont().deriveFont(Font.BOLD));
        }
        
    }
    
}

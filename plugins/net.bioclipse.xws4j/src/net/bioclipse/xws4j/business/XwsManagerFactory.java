package net.bioclipse.xws4j.business;
import net.bioclipse.xws4j.Activator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IExecutableExtensionFactory;
/**
 * 
 * This file is part of the Bioclipse xws4j Plug-in.
 * 
 * Copyright (C) 2008 Johannes Wagener
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, see <http://www.gnu.org/licenses>.
 * 
 * @author Johannes Wagener, Ola Spjuth
 */
public class XwsManagerFactory implements IExecutableExtension, 
                                              IExecutableExtensionFactory {
    private Object xwsManager;
    public void setInitializationData(IConfigurationElement config,
            String propertyName, Object data) throws CoreException {
        xwsManager = Activator.getDefault().getXwsManager();
        if(xwsManager==null) {
            xwsManager = new Object();
        }
    }
    public Object create() throws CoreException {
        return xwsManager;
    }
}

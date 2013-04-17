/**
 *  This file is part of Google App Engine suppport in NetBeans IDE.
 *
 *  Google App Engine suppport in NetBeans IDE is free software: you can
 *  redistribute it and/or modify it under the terms of the GNU General
 *  Public License as published by the Free Software Foundation, either
 *  version 2 of the License, or (at your option) any later version.
 *
 *  Google App Engine suppport in NetBeans IDE is distributed in the hope
 *  that it will be useful, but WITHOUT ANY WARRANTY; without even the
 *  implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Google App Engine suppport in NetBeans IDE.
 *  If not, see <http://www.gnu.org/licenses/>.
 */
package org.netbeans.modules.j2ee.appengine.nodes;

import org.netbeans.modules.j2ee.deployment.plugins.spi.RegistryNodeFactory;
import org.openide.nodes.Node;
import org.openide.util.Lookup;

/**
 * @author Michal Mocnak
 */
public class AppEngineRegistryNodeFactory implements RegistryNodeFactory {

    @Override
    public Node getManagerNode(Lookup lookup) {
        return new AppEngineManagerNode(lookup);
    }

    @Override
    public Node getTargetNode(Lookup lookup) {
        return new AppEngineTargetNode();
    }
}
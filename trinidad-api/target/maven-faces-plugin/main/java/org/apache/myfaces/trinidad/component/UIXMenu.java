// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/
package org.apache.myfaces.trinidad.component;

import javax.faces.component.NamingContainer;
import javax.faces.component.UIComponent;
import org.apache.myfaces.trinidad.bean.FacesBean;

/**
 *
 * Signifies an element that can contain a series of UIXCommand components.
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXMenu extends UIXComponentBase
                     implements NamingContainer
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final String POPUP_MENU_FACET = "popupMenu";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Menu";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Menu";

  /**
   * Construct an instance of the UIXMenu.
   */
  public UIXMenu()
  {
    super("org.apache.myfaces.trinidad.List");
  }

  /**
   * the popup menu associated with this menu
   */
  final public UIComponent getPopupMenu()
  {
    return getFacet(POPUP_MENU_FACET);
  }

  /**
   * the popup menu associated with this menu
   */
  @SuppressWarnings("unchecked")
  final public void setPopupMenu(UIComponent popupMenuFacet)
  {
    getFacets().put(POPUP_MENU_FACET, popupMenuFacet);
  }

  @Override
  public String getFamily()
  {
    return COMPONENT_FAMILY;
  }

  @Override
  protected FacesBean.Type getBeanType()
  {
    return TYPE;
  }

  /**
   * Construct an instance of the UIXMenu.
   */
  protected UIXMenu(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Menu","org.apache.myfaces.trinidad.List");
  }
}

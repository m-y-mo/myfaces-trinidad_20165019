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

import java.io.IOException;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import org.apache.myfaces.trinidad.bean.FacesBean;

/**
 *
 * The group component is an invisible control that aggregates semantically-related children; the group itself has no associated client representation (visual or API).
 * Some parent components may have special representation for groups like adding separators around the group but this is a special case and is not always rendered this way.
 * In most cases, only the children of the group will be rendered directly to the page.
 * There will be no layout applied to the children so the natural layout behavior of the underlying HTML elements will apply.
 * If you require a more predictable layout, you should use a layout component such as panelGroupLayout.
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
public class UIXGroup extends UIXComponentBase
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Group";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Group";

  /**
   * Construct an instance of the UIXGroup.
   */
  public UIXGroup()
  {
    super(null);
  }
    /**
   * Overridden to return true.
   * @return true because the children are rendered by this component
   */
  @Override
  public boolean getRendersChildren()
  {
    return true;
  }

  /**
   * Renders the children in their raw form.
   * There is no Renderer for this component because it has no
   * visual representation or any sort of layout for its children.
   * @param context the FacesContext
   * @throws IOException if there is an error encoding the children
   */
  @Override
  public void encodeChildren(FacesContext context) throws IOException
  {
    if (context == null)
      throw new NullPointerException();

    if (!isRendered())
      return;

    if (getChildCount() > 0)
    {
      for(UIComponent child : (List<UIComponent>)getChildren())
      {
        __encodeRecursive(context, child);
      }
    }
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
   * Construct an instance of the UIXGroup.
   */
  protected UIXGroup(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lock();
  }
}
